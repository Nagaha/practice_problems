package MOCKRound;

public class Set1Q4 {
    public static void main(String[] args) {
        int[][] sudokuGrid = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        boolean ans=checkCorrect(sudokuGrid);
        System.out.println(ans);
    }

    private static boolean checkCorrect(int[][] arr) {
        //check vertical

        int sum =0;
        int exSum=45;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[j][i]>0 && arr[j][i]<=9){
                    sum+=arr[j][i];
                }
            }
            if(sum==exSum){
                sum=0;
            }
            else{
                return false;
            }
        }

        //check horizontal
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]>0 && arr[i][j]<=9){
                    sum+=arr[i][j];
                }
            }
            if(sum==exSum){
                sum=0;
            }
            else{
                return false;
            }
        }

        //check sub
        for(int i=0;i<arr.length;i+=3){
            for (int j=0;j< arr.length;j+=3){
                int row=i;
                int col=j;
                while (row<=2+i){
                    while(col<=2+j) {
                        sum += arr[row][col];
                        col++;
                    }
                    row++;
                }
            }
            if(sum==exSum){
                sum=0;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
