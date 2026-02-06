public class InsertionSort {
    public static void main(String[] args) {
        int arr[]=new int[]{13,46,20,24,52,9,60};
        System.out.println("The unsorted array is: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        int ans[]=bubbleSort(arr);
        System.out.println();
        System.out.println("The sorted array is: ");
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
    public static int[] bubbleSort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }
}
