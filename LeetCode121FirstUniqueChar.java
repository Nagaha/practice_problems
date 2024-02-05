/*
387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
*/

class Solution {
    public int firstUniqChar(String s) {
        //Here we are approaching the problem with hashing array
      int arr[]=new int[26];
      //This array is going to have the occureneces of the character
      for(int i=0;i<s.length();i++){
          arr[s.charAt(i)-'a']++;
      }
      //Now we have the occurenece array
      for(int i=0;i<s.length();i++){
          if(arr[s.charAt(i)-'a']==1){
              return i;
          }
      }//In the above for loop we traverse through each charcater and check its corressponding
      //occurence value if it is 1 return i else atlast return -1
      return -1;
    }
}
