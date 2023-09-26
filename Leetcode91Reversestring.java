/*
344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/
class Solution {
    public void reverseString(char[] a) {
        int low=0;//pointer 1
        int high=a.length-1;//pointer 2
        while(low<high){
            char temp=a[low];
            a[low]=a[high];//Interchanging to reverse the string
            a[high]=temp;
            low++;
            high--;
        }
    }
}
