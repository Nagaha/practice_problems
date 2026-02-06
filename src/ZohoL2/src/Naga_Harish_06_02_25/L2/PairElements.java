package ZohoL2.src.Naga_Harish_06_02_25.L2;

import java.util.ArrayList;

public class PairElements {
    public static void main(String[] args) {
        //new int[]{1,4,2,9,5,3};
        int arr[]=new int[]{1,6,4,10,13};
        int pairs=findPairs(arr);
        System.out.println("The pair elements are " +pairs);
    }

    private static int findPairs(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();//List to store all values in array
        for(int x:arr){
            list.add(x);
        }
        int count=0;//Count to maintain the pairs
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int tempSum=arr[i]+arr[j];
                if(list.contains(tempSum)){
                    count++;//incrementing if count is sum
                }
            }
        }
        return count;


    }
}
