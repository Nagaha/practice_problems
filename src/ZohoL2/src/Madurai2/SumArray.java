package ZohoL2.src.Madurai2;

import java.util.ArrayList;
import java.util.Scanner;


public class SumArray {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the length of arr: ");
//        int len=sc.nextInt();
//        int arr[] =new int[len];
//        System.out.println("Enter the target number: ");
//        int tgt=sc.nextInt();
//
//        for(int i=0;i<arr.length;i++){
//            System.out.println("Enter the number "+(i+1)+" :");
//            arr[i]=sc.nextInt();
//        }

        int num[]=new int[]{9,4,5,6,2,1,7,3};
        int tar=16;
        ArrayList<ArrayList<Integer>> list=getSum(num,tar);

        System.out.println(list);
    }

    private static ArrayList<ArrayList<Integer>> getSum(int[] arr,int tgt) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int maxSum=0;
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=i;j< arr.length;j++){
                maxSum+=arr[j];
               if(maxSum<=tgt){
                   temp.add(arr[j]);
               }
               else if(maxSum>tgt){
                   maxSum-=arr[j];
               }
               if(maxSum==tgt){

                   if(!list.contains(temp)){
                       list.add(temp);

                   }
//
                   break;
               }

            }
        }
        return list;

    }
}
