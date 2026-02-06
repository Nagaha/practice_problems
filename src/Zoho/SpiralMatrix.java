package Zoho;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        printSpiral(arr);
    }

    private static void printSpiral(int[][] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int top=0;
        int bottom= arr.length-1;
        int left=0;
        int right=arr[0].length-1;

        while(top<bottom || left<right){
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);

            }
            top++;
            if(top>bottom || left>right) break;
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);

            }
            right--;
            if(top>bottom || left>right) break;
            for(int i=right;i>=left;i--){
                list.add(arr[bottom][i]);

            }
            bottom--;
            if(top>bottom || left>right) break;
            for(int i=bottom;i>=top;i--){
                list.add(arr[i][left]);
            }
            left++;
            if(top>bottom || left>right) break;
        }
        for(int x:list){
            System.out.print(x+" ");
        }

    }
}
