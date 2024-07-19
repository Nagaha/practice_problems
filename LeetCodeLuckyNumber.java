*1380. Lucky Numbers in a Matrix
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.*/
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                boolean minRow=isMin(matrix[i][j],matrix,i);
                boolean maxCol=isMax(matrix[i][j],matrix,j);

                if(minRow && maxCol){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }

    public boolean isMin(int val,int matrix[][],int row){
        int num=Integer.MAX_VALUE;
        for(int i=0;i<matrix[row].length;i++){
            num=Math.min(matrix[row][i],num);
        }
        if(num==val){
            return true;
        }
        return false;
    }

    public boolean isMax(int val,int matrix[][],int col){
        int num=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
          num=Math.max(matrix[i][col],num);
        }
        if(num==val){
            return true;
        }
        return false;
    }
}
