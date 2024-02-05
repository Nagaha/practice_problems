package Zoho;

public class NGE {
    //The function has to return an array where Next Greater Element(NGE) of arr[i] is placed at ith index
    //The NGE is first number greater than the current number and right of it.
    //If no greater element present place -1
    //{4,5,2,25} -> {5,25,25,-1}
    //{13,7,6,12} -> {-1,12,12,-1}
    public static void main(String[] args) {
        int ans[]=nextGreaterElement(new int[]{4,5,2,25});//calling the function
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
    //The approach is simple we have to traverse through each element and check for the next greater element and replace it

    private static int[] nextGreaterElement(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int min=arr[i];//taking minimum as current element
            for(int j=i+1;j<arr.length;j++){
                if(min<arr[j]){
                    arr[i]=arr[j];//placing the NGE element
                    break;//As we need the First NGE we break
                }
            }
            if(arr[i]==min){
                arr[i]=-1;//if no NGE found we place -1
            }
        }
        return arr;
    }
}
