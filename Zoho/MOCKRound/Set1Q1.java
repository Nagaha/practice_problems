package MOCKRound;

public class Set1Q1 {
    public static void main(String[] args) {
        String input="PROGRAM";
        printPattern(input);
    }

    private static void printPattern(String str) {
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(j==i || j==str.length()-i-1){
                    System.out.print(str.charAt(j));
                }
                //the relationship is in jth loop condition
                //printing the characters only if they are the correct position
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
