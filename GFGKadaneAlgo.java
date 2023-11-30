/*Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.*/
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        long sum=0;
        long max=arr[0];
        for(int i=0;i<n;i++){
           sum+=arr[i];
           max=Math.max(max,sum);
           if(sum<0){
               sum=0;
           }
        }
        
        return max;
        
    }
    
}
