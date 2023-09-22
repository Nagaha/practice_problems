class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int z=nums.length-1;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        while(left<=right){
            if(nums[left]>=nums[right]){//if the left is large then add it to result
               ans[z]=nums[left];
               left++;
            }
            else{
                ans[z]=nums[right];
                right--;
            }
            z--;
        }
        return ans;
    }
}
