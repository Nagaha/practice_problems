package Zoho;

public class MergeSorted {
    public static void main(String[] args) {
        int arr[]=mergeSorted(new int[]{2,4,7,9,11,15},new int[]{5,6});
        for(int x:arr){
            System.out.print(" "+x);
        }
    }
    //This functions returns the merge of two arrays without sorting them but the input itself is sorted

    private static int[] mergeSorted(int[] arr1, int[] arr2) {
        int ans[]=new int[arr1.length+ arr2.length];
        int k=0;
        int a1=0;
        int a2=0;
        while(a1< arr1.length && a2< arr2.length){
            if(arr1[a1]<arr2[a2]){
                ans[k]=arr1[a1];
                a1++;
                k++;
            }
            else{
                ans[k]=arr2[a2];
                a2++;
                k++;
            }
        }
        if(a1< arr1.length){
            while(a1< arr1.length){
                ans[k]=arr1[a1];
                k++;
                a1++;
            }
        }
        if(a2< arr2.length){
            while(a2< arr2.length){
                ans[k]=arr2[a2];
                k++;
                a2++;
            }
        }
        return ans;
    }
}
