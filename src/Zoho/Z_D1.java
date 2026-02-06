package Zoho;

public class Z_D1 {
    public static void main(String[] args) {
        int arr[]=new int[]{16, 17, 4, 3, 5, 2};
        int ans[]=nextGreater2(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
    public static int[] nextGreater(int arr[]){
        //This is a brute force approach  we take each value and check for the next greatest element and we place it
        for(int i=0;i<arr.length-2;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i+1;j< arr.length;j++){
                max=Math.max(max,arr[j]);
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
    public static int[] nextGreater2(int arr[]){
        //Here we traverse from the rear we maintain the temp and max
        //The max is the element which is to placed
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            max=Math.max(max,temp);
        }
        return arr;
    }
}
/*
1. Replace every element with the greatest element on right side
Given an array of integers, replace every element with the next greatest element
(greatest element on the right side) in the array. Since there is no element next to the last element, replace it with -1.
For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
*/
