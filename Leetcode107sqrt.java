/*69. Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 
Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
  
Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
  */
class Solution {
    public int mySqrt(int x) {
       if(x==1 || x==0){
           return x;
       } 
       int low=1;
       int high=x;
       int mid=0;

       while(low<=high){
           mid=low+(high-low)/2;
           if((long)mid*mid>(long)x){
               high=mid-1;
           }
           else if(mid*mid==x){
               return mid;
           }
           else{
               low=mid+1;
           }
       }
       return Math.round(high);
    }
}
