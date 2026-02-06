package ZohoL2.src.Madurai;

public class P2 {
    public static void main(String[] args) {
        int arr[]={2,3,1,0,4};//you are 0th index step is reachable
        boolean isReachable=checkReachable(arr);
        System.out.println(isReachable);

    }

    private static boolean checkReachable(int[] arr) {
        int maxIdx=0;
        for(int i=0;i<arr.length;i++){
            if(i>maxIdx){
                return false;
            }
            maxIdx=Math.max(maxIdx,arr[i]+i);
        }
        return true;
    }


}
