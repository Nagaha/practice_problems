class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> tem=new Stack<>();//We use a stack to maintain the curr day
       int ans[]=new int[temperatures.length];//This array is going to have the waiting days
       for(int i=0;i<temperatures.length;i++){
           while(!tem.isEmpty() && temperatures[i]>temperatures[tem.peek()]){
               int idx=tem.pop();
               ans[idx]=i-idx;//here i is the warmer day while idx is cooler
           }
           tem.push(i);//We push the each new warm day's index or the index where stack is empty
       }
       return ans;
    }
}
