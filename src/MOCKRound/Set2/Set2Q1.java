package MOCKRound.Set2;

public class Set2Q1 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8};
        int ans[]=alternateSort(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }

    private static int[] alternateSort(int[] arr) {
//        int k=0;
//        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i+=2){
            int max=i;
            int min=i;
            for(int j=i;j< arr.length;j++){
               max=arr[max]<arr[j]?j:max;
               min=arr[min]>arr[j]?j:min;
            }
            int temp1=arr[i];
            int temp2=arr[i+1];
            arr[i]=arr[max];
            arr[i+1]=arr[min];
            arr[max]=temp1;
            arr[min]=temp2;
        }
        return arr;
    }
}
