package ZohoL2.src.saro_intervie_prep;

public class LargestNumber {
    public static void main(String[] args) {
        int[] input = new int[]{10,12,14,7,8,9,90};
        int result =  get_large_number(input);
        System.out.println("The Largest Number is: " + result);
    }
    private static int get_large_number(int arr[]){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++ ){
                if(largest < arr[i]){
                        largest = arr[i];
            }

        }
        return largest;
    }

}



//Input : [10,12,14,7,8,9]
//Output : 14
//Display the largest number in the given array