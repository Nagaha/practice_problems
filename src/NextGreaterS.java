import java.util.*;
public class NextGreaterS {
    public static void main(String[] args) {

//        int arr[]={4,5,2,25};
//        for(int i=0;i<arr.length;i++){
//            int temp=arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]<arr[j]){
//                    arr[i]=arr[j];
//                    break;
//                }
//            }
//            if(arr[i]==temp){
//                arr[i]=-1;
//
//
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
        int arr[]={4,5,2,25};
        int ans[]=findNGE(arr);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] findNGE(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                arr[i]=-1;
            }
            else if(stack.peek()<arr[i]){
                while(!stack.isEmpty()){
                    if(stack.peek()>arr[i]){
                        int x=arr[i];
                        arr[i]=stack.peek();
                        stack.push(x);
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    stack.push(arr[i]);
                    arr[i]=-1;
                }
            }
            else if(stack.peek()>arr[i]){
                int x=arr[i];
                arr[i]=stack.peek();
                stack.push(x);
            }
        }
        return arr;
    }
}
//The function has to return an array where Next Greater Element(NGE) of arr[i] is placed at ith index
//The NGE is first number greater than the current number and right of it.
//If no greater element present place -1
//{4,5,2,25} -> {5,25,25,-1}
//{13,7,6,12} -> {-1,12,12,-1}