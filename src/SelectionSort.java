public class SelectionSort {
    public static void main(String[] args) {
        int arr[]=new int[]{13,46,20,24,52,9,60};
        System.out.println("The unsorted array is: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        int ans[]=selectionSort(arr);
        System.out.println();
        System.out.println("The sorted array is: ");
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
    public static int[] selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
