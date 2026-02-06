package ZohoL2.src;

import java.util.*;

public class ColumnarTransposition {


    public static String generateKeyFromSentence(String sentence) {
        String[] words = sentence.trim().split("\\s+");//Split  the word
        StringBuilder keyBuilder = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                keyBuilder.append(word.charAt(word.length() - 1));//creating a string with last letter
            }
        }
        return keyBuilder.toString();
    }

    // Sort the key to get the column order
    public static int[] sortKey(String key) {
        Integer[] indices = new Integer[key.length()];
        for (int i = 0; i < key.length(); i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Character.compare(key.charAt(a), key.charAt(b)));
        return Arrays.stream(indices).mapToInt(Integer::intValue).toArray();
    }

    // Print the matrix for debugging
    public static void printMatrix(String[] matrix, int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (String col : matrix) {
                if (i < col.length()) {
                    System.out.print(col.charAt(i) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Encrypt the plaintext using columnar transposition
    public static String encryptColumnarTransposition(String plaintext, String key) {
        plaintext = plaintext.replace(" ", "");//replacing the empty spaces
        int keyLength = key.length();

        //no.of rows  needed
        int numRows = (plaintext.length() + keyLength - 1) / keyLength;
        //Pad plaintext with spaces if needed
        String paddedPlaintext = String.format("%-" + (numRows * keyLength) + "s", plaintext);

        // Create a matrix to store columns
        String[] matrix = new String[keyLength];
        Arrays.fill(matrix, "");

        for (int i = 0; i < paddedPlaintext.length(); i++) {
            matrix[i % keyLength] += paddedPlaintext.charAt(i);
        }

        //Printing matrix before transposition
        System.out.println("\nMatrix before columnar transposition:");
        printMatrix(matrix, numRows);

        //Sorting the columns based on the key
        int[] sortedOrder = sortKey(key);
        StringBuilder ciphertext = new StringBuilder();
        for (int i : sortedOrder) {
            ciphertext.append(matrix[i]);
        }

        //Printing the matrix after transposition
        System.out.println("\nMatrix after columnar transposition:");
        String[] sortedMatrix = new String[keyLength];//new matrix
        for (int i = 0; i < keyLength; i++) {
            sortedMatrix[i] = matrix[sortedOrder[i]];
        }
        printMatrix(sortedMatrix, numRows);

        return ciphertext.toString();
    }

    // Decrypt the ciphertext using columnar transposition
    public static String decryptColumnarTransposition(String ciphertext, String key) {
        int keyLength = key.length();
        int numRows = ciphertext.length() / keyLength;

        //sorting the key in reverse order
        int[] sortedOrder = sortKey(key);
        int[] reverseOrder = new int[keyLength];
        for (int i = 0; i < sortedOrder.length; i++) {
            reverseOrder[sortedOrder[i]] = i;
        }

        //Create a matrix to store columns
        String[] matrix = new String[keyLength];
        int index = 0;

        //Filling the matrix with characters from ciphertext according to the sorted key
        for (int i = 0; i < keyLength; i++) {
            int colIndex = sortedOrder[i];
            matrix[colIndex] = ciphertext.substring(index, index + numRows);
            index += numRows;
        }

        // Print the matrix after filling it with ciphertext
        System.out.println("\nMatrix during decryption (sorted columns):");
        printMatrix(matrix, numRows);

        // Read the plaintext row by row
        StringBuilder plaintext = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < keyLength; j++) {
                if (i < matrix[j].length()) {
                    plaintext.append(matrix[j].charAt(i));
                }
            }
        }

        return plaintext.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Key sentence");
        String keyS= scanner.nextLine();

        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine();

        //Generating key from the plain text
        String key = generateKeyFromSentence(keyS);
        System.out.println("The Key is: "+key);

        //Function call to encrypt
        String ciphertext = encryptColumnarTransposition(plaintext, key);
        System.out.println("\nEncrypted: " + ciphertext);

        // Function call to decrypt
        String decryptedText = decryptColumnarTransposition(ciphertext, key);
        System.out.println("\nDecrypted: " + decryptedText);

        scanner.close();
    }
}
