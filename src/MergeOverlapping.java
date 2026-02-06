import java.util.ArrayList;

public class MergeOverlapping {
    public static void main(String[] args) {
        int arr[][]= {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans=MergeOverlappingArray(arr);
        for (int[] x:ans) {
            System.out.print(x[0]+" ");
            System.out.print(x[1]+" ");

        }
    }

    private static int[][] MergeOverlappingArray(int[][] arr) {
        //int res[][]=new int[1][2];
        ArrayList<Integer> ans=new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=end){
                end=arr[i][1];
            }
            if(arr[i][0]<start){
                start=arr[i][0];
            }
            else{
                ans.add(start);
                ans.add(end);
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        ans.add(start);
        ans.add(end);
        int x=ans.size()/2;
        int[][] res=new int[x][2];
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

    }
}
