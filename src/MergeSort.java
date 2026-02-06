public class MergeSort {
    static int[] temp =new int[7];
    public static void main(String[] args) {
        int arr[]=new int[]{13,46,20,24,52,9,60};
        System.out.println("The unsorted array is: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        mergeSort(arr,0, arr.length-1);
        System.out.println("The sorted array is: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void mergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low,int mid,int high){

        int x=low;
        int c=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[x]=arr[left];
                left++;
                x++;
            }
            else{
                temp[x]=arr[right];
                right++;
                x++;
            }
        }
        while(left<=mid){
            temp[x]=arr[left];
            left++;
            x++;
        }
        while(right<=high){
            temp[x]=arr[right];
            right++;
            x++;
        }

        for(int i:temp){
            arr[c]=i;
            c++;
        }

    }
}
