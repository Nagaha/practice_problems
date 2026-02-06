package Sorting;

class Solution2 {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] array = new int[m*n];
        int row = 0, column = 0;
        int i = 0;
        boolean up = true;
        while(row<m && column<n){
            if(up){
                while(row>0 && column<n-1){
                    array[i++]=matrix[row][column];
                    row--; column++;
                }
                array[i++]=matrix[row][column];
                if(column == n-1) row++;
                else column++;
            }
            else{
                while(column>0 && row<m-1){
                    array[i++]=matrix[row][column];
                    row++; column--;
                }
                array[i++]=matrix[row][column];
                if(row == m-1) column++;
                else row++;
            }
            up = !up;
        }
        return array;
    }
}