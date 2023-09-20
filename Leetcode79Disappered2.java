class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      Set<Integer> ch=new HashSet<Integer>();
        for(int n:nums){
            ch.add(n);
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=1;i<=nums.length;i++){
            if(!ch.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
