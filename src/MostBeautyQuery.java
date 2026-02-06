public class MostBeautyQuery {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 2}, {2, 4}, {5, 6}, {3, 5}};
        int queries[] = {1, 2, 3, 4, 5, 6};
        int ans[] = maximumBeauty(arr, queries);
        for(int x:ans){
            System.out.print(x+",");
        }
    }

    public static int[] maximumBeauty(int[][] items, int[] queries) {
        //Selection sort
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i][0] > items[j][0]) {

                    int temp1 = items[i][0];
                    int temp2 = items[i][1];

                    items[i][0] = items[j][0];
                    items[i][1] = items[j][1];

                    items[j][0] = temp1;
                    items[j][1] = temp2;
                }
            }
        }

        //queries
        int ans[]=new int[queries.length];
        for(int i=0;i< queries.length;i++){
            int max=0;
            int price=queries[i];
            for(int j=0;j< items.length;j++){
                if(items[j][0]<=price){
                    max=Math.max(items[j][1],max);
                }
                else{
                    break;
                }
            }
            ans[i]=max;
        }
        

        for(int i=0;i<items.length;i++){
            for(int j=0;j<items[i].length;j++){
                System.out.print(items[i][j]+" ");
            }
            System.out.println();
        }
       return ans;
    }
}
