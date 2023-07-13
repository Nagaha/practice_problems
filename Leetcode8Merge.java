/* 
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

*/


class Solution {
    public String mergeAlternately(String a, String b) {
        int n=a.length();
        int m=b.length();
        int i=0,j=0;
        String s=new String();
        while(i<n || j<m){
            if(i<n) s+=a.charAt(i++);
            if(j<m) s+=b.charAt(j++);
        }
        return s;

        
    }
}