package Zoho;

import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       char arr[][]=new char[n][n];
       int top=0;
       int bottom=arr.length-1;
       int right=arr[0].length-1;
       int left=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]='.';
            }
        }
if(n%2==0){
    while(top<bottom || left<right){
        for(int i=left;i<=right;i++){
            arr[top][i]='*';
        }
        top+=1;
        if(top>bottom || left>right) break;
        for(int i=top;i<=bottom;i++){
            arr[i][right]='*';

        }
        right-=1;
        if(top>bottom || left>right) break;
        for(int i=right;i>=left;i--){
            arr[bottom][i]='*';
        }
        bottom-=1;
        if(top>bottom || left>right) break;
        for(int i=bottom;i>=top;i--){
            arr[i][left]='*';
        }
        left+=1;
        if(top>bottom || left>right) break;
        top+=1;
        bottom-=1;
        left+=1;
        right-=1;
    }
}
else{
    while(top<=bottom || left<=right){
        if(top>0) arr[top][left-1]='*';
        for(int i=left;i<=right;i++){
            arr[top][i]='*';
        }
        top+=1;
        if(top>bottom || left>right) break;
        for(int i=top;i<=bottom;i++){
            arr[i][right]='*';

        }
        right-=1;
        if(top>bottom || left>right) break;
        for(int i=right;i>=left;i--){
            arr[bottom][i]='*';
        }
        bottom-=1;
        if(top>bottom || left>right) break;
        for(int i=bottom;i>top;i--){
            arr[i][left]='*';
        }
        left+=1;
        if(top>bottom || left>right) break;
        top+=1;
        bottom-=1;
        left+=1;
        right-=1;
    }
}


       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
}
