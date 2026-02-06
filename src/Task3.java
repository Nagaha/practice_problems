import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int ans=swapOddEven(new int[]{3,5,2,7,9,11,12});
        System.out.println(ans);
    }

    private static int swapOddEven(int[] arr) {
       int count=0;
       int left=0;
       int right=arr.length-1;
       while(left<=right){
           if(arr[left]%2!=0 && arr[right]%2==0){
               count++;
               left++;
               right--;
           }
           if(arr[left]%2==0){
               left++;
           }
           if(arr[right]%2!=0){
               right--;
           }
       }
       return count;
    }
}
