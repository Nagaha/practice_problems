/*Given a string S, containing special characters and all the alphabets, reverse the string without
affecting the positions of the special characters.

Example 1:

Input: S = "A&B"
Output: "B&A"
Explanation: As we ignore '&' and
then reverse, so answer is "B&A".
Example 2:

Input: S = "A&x#
Output: "x&A#"
Explanation: we swap only A and x.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function reverse() which takes the string as inputs and returns required reverse string.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)
*/
class Solution
{
    public String reverse(String str)
    {
       int front=0;
       int rear=str.length()-1;
       StringBuilder sb=new StringBuilder(str);
       while(front<=rear){
           char c1=sb.charAt(front);
           char c2=sb.charAt(rear);
           if(!Character.isLetter(c1)){
               front++;
               continue;
           }
           if(!Character.isLetter(c2)){
               rear--;
               continue;
               
           }
           else{
               char temp=c1;
               sb.setCharAt(front,c2);
               sb.setCharAt(rear,temp);
               front++;
               rear--;
           }
           
       }
       return sb.toString();
    }
}
