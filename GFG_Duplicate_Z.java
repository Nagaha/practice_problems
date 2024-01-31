class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
       int aux_arr[]=new int[n];
       for(int i=0;i<n;i++){
           aux_arr[arr[i]]++;//We add one for each occurence of the element(hashing)
       }
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=0;i<n;i++){
           if(aux_arr[i]>1){//Check for more than one occurenece and if add in arraylist
               ans.add(i);
           }
       }
       if(ans.isEmpty()) ans.add(-1);//if list is empty add -1 to it
       return ans;
    }
}
