package ZohoL2.src.Naga_Harish_06_02_25.L2;

import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
       // int arr[][]={{1,2},{6,11},{1,3},{2,4}};
//      int arr[][]={{1,2},{1,2},{1,2}};
        int arr[][]={{1,2},{5,6},{3,4},{6,8},{4,6}};
        int minDeletions=findMinimum(arr);
        System.out.println("The minimum interval to be removed is: "+minDeletions);
    }

    private static int findMinimum(int[][] arr) {
        int count=0;
        //sort the array based on the 0 th place values
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i][0]>arr[j][0]){//Swapping the values
                    int temp0=arr[i][0];
                    int temp1=arr[i][1];

                    arr[i][0]=arr[j][0];
                    arr[i][1]=arr[j][1];

                    arr[j][0]=temp0;
                    arr[j][1]=temp1;
                }
            }
        }


        //checking the 2nd element with the 1st element
        int ptr1=0;//pointer 1
        int ptr2=1;//pointer 2
        while(ptr2<arr.length){
            while(ptr2< arr.length && arr[ptr1][1]>arr[ptr2][0]){
                count++;
                ptr2++;
            }
            ptr1++;
            ptr2++;

        }
        return count;
    }
}
