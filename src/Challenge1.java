/*Concatenation of Array
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

The input array is:
 10 2 40 89 56
The output array is:
 10 2 40 89 56 10 2 40 89 56
*/
public class Challenge1 {
    public static void main(String[] args) {
        int arr1[]=new int[]{10,2,40,89,56};
        System.out.println("The input array is: ");
        for(int x:arr1){
            System.out.print(" "+x);
        }
        System.out.println();
        int ans[]=new int[2* arr1.length];
        for(int i=0;i< arr1.length;i++){
            ans[i]=arr1[i];
        }
        for(int i=0;i< arr1.length;i++){
            ans[i+ arr1.length]=arr1[i];
        }
        System.out.println("The output array is: ");
        for(int x:ans){
            System.out.print(" "+x);
        }

    }
}
