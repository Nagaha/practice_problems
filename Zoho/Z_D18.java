package Zoho;
/*
18. -1 represents ocean and 1 represents land find the number of islands in the given matrix.

Input:   n*n matrix
       1 -1 -1  1
      -1  1 -1  1
      -1 -1  1 -1
      -1 -1 -1  1
Output: 2 (two islands that I have
bold in matrix at 1, 1 and 2, 2)
*/
public class Z_D18 {
    public static void main(String[] args) {
        int ans=noOfIslands(new int[][]{{1 ,-1, -1 , 1},{-1 , 1, -1 , 1},{-1, -1,  1, -1}});
        System.out.println("The total number of islands: "+ans);

    }

    private static int noOfIslands(int[][] arr) {
        //We have to find the no.of islands from the 2D array
        int islands=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1 && (i!=0 && i!= arr.length-1) && (j!=0 && j!=arr.length-1)){
                    islands++;
                    //The island is one where it is surronded by water on four sides
                    //but our approach is going to check it is not at the edge of the world
                    //Hope no two islands are together
                }
            }
        }
        return islands;
    }
}
