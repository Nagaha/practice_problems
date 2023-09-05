class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int MaxArea=0;
        for(int i=0;i<height.length;i++){
            if(left>right) return MaxArea;
            int currentArea=Math.min(height[left],height[right])*(right-left);
            MaxArea=Math.max(MaxArea,currentArea);
            if(height[left]>=height[right]) right--;
            else left++;
        }
        return MaxArea;
    }
}
