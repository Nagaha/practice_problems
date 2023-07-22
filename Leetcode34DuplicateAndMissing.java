/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]*/
public int[] findErrorNums(int[] nums) {
        HashSet<Integer> h=new HashSet<Integer>();
        int dup=0;
        for(int n:nums){
         if(h.contains(n)){
             dup=n;
            }
            h.add(n);
        }
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i))
             return new int[]{dup,i};
        }
        return new int[]{};
    }