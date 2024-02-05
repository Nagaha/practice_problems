package Zoho;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        sortOddEven(arr);
    }

    private static void sortOddEven(int arr[]) {
        int len=arr.length;
        int arr1[]=new int[(len/2)+1];
        int arr2[]=new int[(len/2)+1];
        int arr1P=0;
        int arr2P=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                arr2[arr2P]=arr[i];
                arr2P++;
            }
            else{
                arr1[arr1P]=arr[i];
                arr1P++;
            }
        }
        arr2P--;
        int x=0;
        int y=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.print(arr2[arr2P]+" ");
                arr2P--;

            }
            else{
                System.out.print(arr1[y]+" ");
                y++;
            }
        }
    }
}
