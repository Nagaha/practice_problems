/*
Shuffle the Array
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

*/
public class Challenge2 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,11,22,33,44,55};
        int n= arr.length/2;
        for(int i=0;i<n-1;i++){
            Swap(arr[i+1],arr[(arr.length/2)+i],arr);
        }
        for(int x:arr){
            System.out.print(" "+x);
        }

    }

    private static void Swap(int i, int j,int arr[]) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
