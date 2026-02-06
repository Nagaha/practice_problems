package Zoho;
/*49.Given an array as input, The condition is if the number is repeated you must add the number and put the next index value to 0. If the number is 0 print it at the last.
Eg: arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8}
Output: 4 2 12 8 0 0 0 0 0 .*/
public class Z_D49 {
    public static void main(String[] args) {
        int arr[]={ 0, 2, 2, 2, 0, 6, 6, 0, 8};
        int ans[]=repeatedValueArray(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }

    private static int[] repeatedValueArray(int[] arr) {
        int ans[]=new int[arr.length];
        int num1=0;
        int num2=num1+1;
        while(num1< arr.length-1){
           for(int i=0;i< arr.length;i++){
               if(arr[i]!=0){
                   break;
               }
           }
           if(num1==0){
               arr=moveLast(arr,num1);
           }
           if(arr[num1]==arr[num2]){
               arr[num1]=arr[num1]+arr[num2];
               arr[num2]=0;
           }
        }
        return arr;

    }

    private static int[] moveLast(int[] arr,int place) {
        for(int i=place;i< arr.length-1;i++){
            arr[place]=arr[place+1];
            System.out.println(i);
        }
        return arr;
    }
}
