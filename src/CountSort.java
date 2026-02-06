public class CountSort {
    public static void main(String[] args) {
        int arr[]=new int[]{1,9,4,6,3,2,1,4,7,8,9,5,6,4,1,2,0,0,3};
        System.out.println("The unsorted array is: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        int ans[]=countSort(arr);
        System.out.println();
        System.out.println("The sorted array is: ");
        for(int x:ans){
            System.out.print(x+" ");
        }
    }

    private static int[] countSort(int[] arr) {
        int hash[]=new int[10];
        int ansArray[]=new int[arr.length];
        //Creating the array to have the hash values
        for(int i=0;i< arr.length;i++){
            hash[arr[i]]++;
        }
        //creating the cummulative count array
        for(int i=0;i<hash.length-1;i++){
            hash[i+1]+=hash[i];
        }
        //Putting it in the answer array
        for(int i= arr.length-1;i>=0;i--){
            ansArray[--hash[arr[i]]]=arr[i];
        }
        return ansArray;
    }
}
