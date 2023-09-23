/*
75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
*/
class Solution {
    public void sortColors(int[] nums) {
        int head=0;
        int b=0;
        int tail=nums.length-1;
        while(b<=tail){
            if(nums[b]==0){
                swap(nums,b,head);
                head++;
                b++;
            }
            else if(nums[b]==2){
                swap(nums,b,tail);
                tail--;
            }
            else b++;
        }
    }
    public void swap(int nums[],int h1,int h2){
        int temp=nums[h1];
        nums[h1]=nums[h2];
        nums[h2]=temp;
    }
}
