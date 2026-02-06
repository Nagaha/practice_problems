package ZohoL2.src.Accenture;

public class DecrasingTemp {
    public static void main(String[] args) {
        int arr[]=new int[]{12,8,6,14,7,8,9,6,5,7,3,2};
        int ans=findMaxDecTemperature(arr);
        System.out.println(ans);
    }

    private static int findMaxDecTemperature(int[] arr) {
        int max=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
            else{
                max=Math.max(count,max);
                count=0;
            }
        }
        max=Math.max(count,max);
        return max;
    }
}
