/*
* 2. Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
* input:-
1 0 0
0 0 0
0 0 1
output:-
1 1 1
1 0 1
1 1 1     */
package Zoho;

import java.util.HashSet;
import java.util.Set;

public class Z_D2 {
    public static void main(String[] args) {
        int arr[][]={{1,0,0},{0,0,0},{0,0,1}};
        int ans[][]=binaryForm(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] binaryForm(int[][] arr) {
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(row.contains(i)){
                    arr[i][j]=1;
                }
                if(col.contains(j)){
                    arr[i][j]=1;
                }
            }
        }
        return arr;
    }
}
