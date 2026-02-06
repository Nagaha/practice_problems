public class QuickSort {
    public static void main(String[] args) {
        int arr[]=new int[]{13,46,20,24,52,9,60};
        System.out.println("The unsorted array is: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        quickSort(arr, arr.length,0, arr.length-1);
        System.out.println();
        System.out.println("The sorted array is: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    private static void quickSort(int[] arr,int n,int lb,int ub) {
        if(lb<ub){
            int loc=partition(arr,lb,ub);
            quickSort(arr, arr.length, lb,loc-1);
            quickSort(arr, arr.length, loc+1,ub);
        }

    }
    public static int partition(int arr[], int lb, int ub){
       int pivot=arr[lb];
       int start=lb,end=ub;
       while(start<end){
           while(arr[start]<=pivot){
               start++;
           }
           while(arr[end]>pivot){
               end--;
           }
           if(start<end){
               int temp=arr[end];
               arr[end]=arr[start];
               arr[start]=temp;
           }
       }
       int temp=arr[lb];
       arr[lb]=arr[end];
       arr[end]=temp;
       return end;
    }
}
