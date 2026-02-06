
/*
* input:[1, 0, 3] [2, 0, 4] [3, 0, 5] [4, 0, 6]
* output:1 2 6 8 5 6
* 1 0 3
*   2 0 4
*     3 0 5
*       4 0 6
* -------------   +
* 1 2 6 8 5 6
* -------------
 * */
import java.util.Arrays;
public class Zoho2 {
    public static void main(String[] args) {
        int arr[][]={{1,0,3},{2,0,4},{3,0,5},{4,0,6}};
        int ans[]=totalSum(arr);
        for(int x[]:arr){
            System.out.print(Arrays.toString(x) +" ");
        }
        System.out.println();
        System.out.println("The resulant array is: ");
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
    private static int[] totalSum(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int ans[]=new int[m+n-1];//creating the result array of length m+n-1(for 4X3 arr len is 6)
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                ans[i+j]+=arr[i][j];//for finding the 1 moved sum
            }
        }
        return ans;
    }
}
//Similar to hashing the ans index is the sum of the possibilites of arr indexes
//ans[0]=arr[0][0]
//ans[3]=arr[1][2]+arr[2][1]+arr[3][0]