package ZohoL2.src.Madurai;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {

        String arr[]={"1","15","35","4","20","18"};//sort without converting to int
       for(int i=0;i< arr.length;i++){
           for(int j=0;j< arr.length-1;j++){
               if(arr[j].length()> arr[j+1].length() || (arr[j].length()==arr[j+1].length() && arr[j].compareTo(arr[j+1])>0) ){
                   //swapping
                   String temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
               }
           }
       }
        System.out.println(Arrays.toString(arr));

    }
}
