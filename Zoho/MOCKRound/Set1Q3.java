package MOCKRound;

public class Set1Q3 {
    public static void main(String[] args) {
        String input="WELCOMETOZOHOCORPORATION";
        String str="TOO";

        char[][] arr=store2D(input);
        findIndex(arr,str);
    }

    private static void findIndex(char[][] arr, String str) {
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //checking top to bottom
      

    }

    private static char[][] store2D(String input) {
        char arr[][]=new char[5][5];
        int col=0;
        int row=0;
        arr[row][col]=input.charAt(0);
        for (int i=1;i<input.length();i++){
            if(col!=4){
                col++;
            } else if (col==4) {
                col=0;
                row++;
            }
            arr[row][col]=input.charAt(i);
        }
        return arr;

    }
}
