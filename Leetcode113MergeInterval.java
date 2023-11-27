/*
56. Merge Intervals

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
*/
class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        //Compares and swap based on the first number in inner array
        ArrayList<Integer> ans=new ArrayList<>();
        //ArrayList for storing the intervals
        int start=arr[0][0];//pointer that keeps the begining of interval
        int end=arr[0][1];//pointer that keeps the end of interval
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=end && arr[i][1]>=end){
                //end is greater than first element and smaller than next element
                //end is moved 
                end=arr[i][1];
            }
            else if(arr[i][1]<end){
                end=end;
                //the next element is smaller to end then end remains same
            }
            else{
                //We are updating the arraylist with the start and end
                ans.add(start);
                ans.add(end);
                //Moving the pointers to next inner array
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        //if everything is unfavorable this comes into action
        ans.add(start);
        ans.add(end);
        //putting the arraylist elements into a 2d array
        int x=ans.size();
        int[][] res=new int[x/2][2];
        int i=0;
        int j=0;
         for(int y:ans){
            if(j<2){
                res[i][j]=y;
                j++;
            }
            
            else{
                i+=1;
                j=0;
                res[i][j]=y;
                j+=1;
            }
        }
        return res;
        //returing the array
    }
}
/*Why arraylist:-
    As we are not maintaining a 2d array for storing the intervals.
    We need a data struct to store the integers(each start and end).
    Arraylist preserves insertion order and accepts duplicates.
     */
