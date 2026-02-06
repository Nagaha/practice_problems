package Zoho;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[]=new int[]{-2,-1,1,0,3,2,-3};
        int target=2;
        ArrayList<int[]> list=getSubsetWithTarget(arr,target);
        for(int[] x:list){
            System.out.println(Arrays.toString(x));
        }
    }

    private static ArrayList<int[]> getSubsetWithTarget(int[] arr, int target) {
        ArrayList<int[]> list =new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                if( arr[left]+arr[right]+arr[i]==target){
                    list.add(new int[]{arr[left],arr[right],arr[i]});
                    right--;
                    left++;
                } else if ( arr[left]+arr[right]+arr[i]>target) {
                    right--;
                }
                else if( arr[left]+arr[right]+arr[i]<target){
                    left++;
                }
            }
        }

        return list;
    }
}
