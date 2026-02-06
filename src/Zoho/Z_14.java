package Zoho;

import java.util.Arrays;

/*
Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
Output : 7 1 6 2 5 3 4

Input : arr[] = {1, 6, 9, 4, 3, 7, 8, 2}
Output : 9 1 8 2 7 3 6 4
*/
public class Z_14 {
    public static void main(String[] args) {
        int[] ans=alternateSort(new int[]{1, 6, 9, 4, 3, 7, 8, 2});
        for(int x:ans){
            System.out.print(x+" ");
        }
    }

    private static int[] alternateSort(int[] arr) {//two  pointers
        int temp[]=new int[arr.length];
        Arrays.sort(arr);//let us sort the array first
        int num1=0;//we create two indexes for new array for odd and even
        int num2=1;
        int left=0;//we create two pointers for sorted array from large and small
        int right=arr.length-1;
        while (left<=right ){
          temp[num1]=arr[right];//we place them in their apt positions
          if(num2< arr.length){//we check for array index out of bound
              temp[num2]=arr[left];
          }
          num1+=2;//increase the indexes (hope you guys can visualize)
          num2+=2;
          left++;//move the pointers
          right--;
      }
      return temp;
    }
}
