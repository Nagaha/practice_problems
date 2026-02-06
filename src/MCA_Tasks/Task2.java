package MCA_Tasks;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
       boolean ans=rotateString("gcmbf","fgcmb");
        System.out.println(ans);
    }
    public static boolean rotateString(String s, String goal) {
        char first=goal.charAt(0);
        int idx=0;
        if(goal.length()!=s.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==first){
                idx=i;
                break;
            }
        }
        boolean flag=false;
        boolean visit=false;
        int place=0;
        while(idx<s.length() && place<goal.length()){
            if(s.charAt(idx)==goal.charAt(place)){
                idx++;
                place++;
                flag=true;
            }
            else{
                return false;
            }
            if(idx==s.length()-1 && visit==false){
                idx=0;
                place++;
                visit=true;
            }
        }
        return flag;
    }
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        int maxCount=Integer.MIN_VALUE;
        int count=1;
        int rep=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                count+=1;
            }
            else if(nums[i+1]-nums[i]==0){
                count+=1;
                rep+=1;
            }
            else{
                count=1;
                rep=0;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount-rep;
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[]=new int[arr1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
            }
            else{
                map.put(arr1[i],map.get(arr1[i])+1);
            }
        }
        System.out.println(map.entrySet());
        int idx=0;
        for(int i=0;i<arr2.length;i++){
            int limit=map.get(arr2[i]);
            map.put(arr2[i],0);
            for(int j=0;j<limit;j++){
                ans[idx]=arr2[i];
                idx++;
            }
        }
        System.out.println(map.entrySet());
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0){//Insertion sort
                for(int i=0;i<entry.getValue();i++){
                    list.add(entry.getKey());
                }

            }
        }
        for(int x:list){
            System.out.print(x+" ");
        }
        System.out.println();
        Collections.sort(list);
        for(int x:list){
            ans[idx++]=x;
        }

        return ans;
    }
}
