public class Saro {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even[] = new int[arr.length];
        int odd[] = new int[arr.length];
        int evenP = 0;
        int oddP = 0;


        System.out.println(arr.length);
        for (int x : arr) {

            if (x % 2 == 0) {
                even[evenP] = x;
                evenP++;

            } else {
                odd[oddP] = x;
                oddP++;
            }



        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < even.length && even[i]!=0; i++) {

            System.out.print(even[i]+" ");
        }

        System.out.println();
        System.out.print("odd numbers: ");
        for (int i = 0; i < odd.length && odd[i]!=0; i++) {

            System.out.print( odd[i]+" ");

        }


    }
}

