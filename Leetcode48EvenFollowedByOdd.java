/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]*/
public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;
        int ans[]=new int[nums.length];
        int place=0;
        int back=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){ 
                ans[place]=nums[i];
                place++;
            }
            else if(nums[i]%2!=0){
                ans[back]=nums[i];
                back--;
            }
        }
        return ans;
    }