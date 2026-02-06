package ZohoL2.src.Madurai2;

public class Matrix2 {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,0,-1,4},
                {3,1,2,4,6},
                {0,2,3,1,4},
                {1,3,2,0,7},
                {2,1,3,-2,9}
        };
        int tgt=3;
        printSubMatrix(arr,tgt);
    }

    private static void printSubMatrix(int[][] arr, int len) {
        for(int row=0;row<arr.length;row++){
            for(int col=0;col< arr[row].length;col++){
                for(int subRow=row;row+len<=arr.length && subRow<row+len;subRow++){
                    for(int subCol=col;col+len<=arr[0].length && subCol<col+len;subCol++){
                        System.out.print(arr[subRow][subCol]+" ");
                    }

                    System.out.println();
                }
                System.out.println("___________________");
            }
           // System.out.println("____________________");
        }


        //get maximum product of each sub matrix
//        Matrix obj=new Matrix();
//        obj.getMaxProduct();
        
    }
}
