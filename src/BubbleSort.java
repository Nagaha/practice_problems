public class BubbleSort {
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
    public static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
