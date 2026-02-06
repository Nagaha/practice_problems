public class MoveOddEven {

    public static void main(String[] args) {
        int arr[]={1253213,66,3,2,1,808};
       MoveNums(arr);
       for(int x:arr){
           System.out.print(x+" ");
       }
    }

    private static void MoveNums(int[] arr) {

        int left=0;//Two pointers  left and right
        int right=arr.length-1;

        while(left<right) {//runs until mid of the array
            if (arr[left] % 2 != 0  ) {
                left++;//if the left is odd move the pointer
            }
            if(arr[right]%2==0){
                right--;//if the right is even move the pointer
            }
            if (arr[left]%2==0 && arr[right]%2!=0 && left<right) {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            //Atlast favorable condition so swap the numbers and move the pointers check for left not execceds right
        }
    }

}
