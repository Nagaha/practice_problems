package Zoho;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/*26.Sort the given elements in descending order based on the number of factors of each element */
public class Z_D26 {
    public static void main(String[] args) {
        int arr[]={10,57,60,89,36};
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int ans[]=factorSort(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }

    private static int[] factorSort(int[] arr) {
      int ans[]=new int[arr.length];
      for(int i=0;i< arr.length;i++){
         ans[i]=factor(arr[i]);
          System.out.print(ans[i]+" ");
      }
        System.out.println();
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j< arr.length;j++){
              if(ans[j] > ans[i]){
                  int tempNo = arr[i];
                  int tempFact = ans[i];
                  ans[i] = ans[j];
                  ans[j] = tempFact;

                  arr[i] = arr[j];
                  arr[j] = tempNo;
              }
          }
      }
      return arr;
    }

    private static Integer factor(int num) {
        int count=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }
}
