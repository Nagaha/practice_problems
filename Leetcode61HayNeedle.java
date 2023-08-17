/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.*/   
public int strStr(String haystack, String needle) {
       int nlen=needle.length();
       int hlen=haystack.length();
       for(int i=0;i<hlen;i++){
           if(haystack.charAt(i)==needle.charAt(0)){
               int k=i;
               int j=0;
               while(j<nlen && k<hlen && haystack.charAt(k)==needle.charAt(j)){
                   j++;
                   k++;
                   if(j==nlen) return i;
               }
           }
       }
       return -1;
    }