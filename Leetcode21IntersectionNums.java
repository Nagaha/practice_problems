/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/
public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set1=new HashSet<>();
       HashSet<Integer> set2=new HashSet<>();
       for(int i:nums1)
        set1.add(i);
       for(int j:nums2)
        set2.add(j);
       HashSet<Integer> Mainset=new HashSet<>();
       for(Integer var:set1){
           if(set2.contains(var)){
               Mainset.add(var);

           }
       }
       int ans[]=new int[Mainset.size()];
       int j=0;
       for(Integer val:Mainset){
           ans[j]=val;
           j++;
       }
       return ans;
       
        
    }