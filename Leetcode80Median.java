class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0.0;
      ArrayList<Integer> x=new ArrayList<Integer>();
      for(int num:nums1){
          x.add(num);
      }
      for(int num:nums2){
          x.add(num);
      }
      Collections.sort(x);
      if(x.size()%2==0){
          int mid1=x.get(x.size()/2-1);
          int mid2=x.get(x.size()/2);
          ans=(double)(mid1+mid2)/2;
      }
      else{
          int mid1=x.get(x.size()/2);
          ans=(double)(mid1);
      }
      return ans;
    }
}
