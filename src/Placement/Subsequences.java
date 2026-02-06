package Placement;

import java.util.ArrayList;

public class Subsequences {
    static int arr[]={10,2,5,6,7};

    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        printAllSequences(0,ans);//Calling recursive function to print all subsequences
        ans.removeAll(ans);//Emptying ans
        System.out.println("With sum");
        printAllWithSum(0,12,ans);//Calling recursive function to print all subsequences with sum target




    }
    private static void printAllWithSum(int idx, int target, ArrayList<Integer> list) {
        //Base case
        if(idx>=arr.length){
            int sum=0;
            for(Integer x:list){
                sum+=x;
            }
            if(sum==target){
                for(Integer x:list){
                    System.out.print(x+" ");//Printing all the elements in list
                }
                System.out.println();
            }
            return;
        }
        //if base case not met
        list.add(arr[idx]);//take the current value at index
        printAllWithSum(idx+1,target,list);//Recursive call to get sequences with current value

        list.remove(list.size()-1);//Not take the current value at index(Removing lastly added element)
        printAllWithSum(idx+1,target,list);//Recursive call to get sequences without the current value
    }


    private static void printAllSequences(int idx, ArrayList<Integer> list) {
        //Base case
        if(idx>= arr.length){
            if (list.isEmpty()) System.out.println("null");
            for(Integer x:list){
                System.out.print(x+" ");//Printing all the elements in list
            }
            System.out.println();
            return;
        }

        //if base case not met
        list.add(arr[idx]);//take the current value at index
        printAllSequences(idx+1,list);//Recursive call to get sequences with current value

        list.remove(list.size()-1);//Not take the current value at index(Removing lastly added element)
        printAllSequences(idx+1,list);//Recursive call to get sequences without the current value
    }
}
