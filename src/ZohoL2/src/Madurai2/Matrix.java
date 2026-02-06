package ZohoL2.src.Madurai2;

public class Matrix {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,0,-1,4},
                {3,1,2,4,6},
                {0,2,3,1,-4},
                {1,3,2,0,7},
                {2,1,3,-2,9}};
        int tgt=3;
        int maxProduct=getMaxProduct(arr,tgt);
        System.out.println("The maximum product is:"+maxProduct);
    }

    public static int getMaxProduct(int[][] arr, int tgt) {
        int maxProduct=0;
        int maxRow=0;
        int maxCol=0;
        int maxDiagonal=0;
        //checking horizontal
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length-tgt+1;j++){
               int product=1;
               for(int k=j;k<j+tgt;k++){
                   product*=arr[i][k];
                   System.out.print(arr[j][k]+" ");

               }
               System.out.println();
              // System.out.println(product);
               maxRow=Math.max(maxProduct,product);
           }
        }

        //checking vertical
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length-tgt+1;j++){
                int product=1;
                for(int k=j;k<j+tgt;k++){
                    product*=arr[k][i];
                }
                //System.out.println(product);
                maxCol=Math.max(maxCol,product);
            }
        }

        //checking diagonal
        for(int i=0;i<arr.length-tgt+1;i++){
            for(int j=0;j<arr[i].length-tgt+1;j++){
                int product=1;
                int k=j;
                int h=i;
                for(;k<j+tgt && h<j+tgt;k++,h++){
                    product*=arr[h][k];
                }
                //System.out.println(product);
                maxDiagonal=Math.max(maxDiagonal,product);
            }

        }
        System.out.println("Diagnoal "+maxDiagonal);
        System.out.println("Horizontal "+maxRow);
        System.out.println("Vertical "+maxCol);

        int maxOfRowAndCol=Math.max(maxCol,maxRow);
        maxProduct=Math.max(maxDiagonal,maxOfRowAndCol);
        return maxProduct;
    }
}
