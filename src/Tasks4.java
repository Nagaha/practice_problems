import java.util.Arrays;

public class Tasks4 {
    public static void main(String[] args) {
        int ans=targetDiff(new int[]{2,4,2,3,2,2,6},5);
        System.out.println(ans);
    }

    private static int targetDiff(int[] arr, int target) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j< arr.length && j!=i;j++){
                temp=Math.abs(arr[i]-arr[j]);
                if(temp<target && arr[i]+arr[j]>ans){
                    ans=arr[i]+arr[j];
                }
                else if(temp==target){
                    ans=arr[i]+arr[j];
                    return ans;
                }
            }
        }
        return ans;
    }

    private static int[] moveZeros(int[] arr) {
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else if(arr[i]==0){
                i++;}
            else if (arr[j]!=0) {
                j++;}
        }
        return arr;
    }
}
