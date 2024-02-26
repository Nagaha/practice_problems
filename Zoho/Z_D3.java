package Zoho;
/*3. Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in an array A:
Example :
Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Input: A[] = {1, 2, 3}
Output: -1*/

public class Z_D3 {
    public static void main(String[] args) {
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        int ans=findEquilbiruim(arr);
        System.out.println(ans);
    }

    private static int findEquilbiruim(int[] arr) {
        int lsum=0;
        int rsum=0;
        int l=0;
        int r=arr.length-1;
        return 0;//here
    }
    }
