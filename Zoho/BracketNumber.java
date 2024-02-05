package Zoho;

import java.util.ArrayList;
import java.util.Stack;

public class BracketNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr =FindBracketNumber("((xhello))(())");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    private static ArrayList<Integer> FindBracketNumber(String s) {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> brac_stack=new Stack<>();
        int brac_count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                brac_count++;
                brac_stack.add(brac_count);
                ans.add(brac_count);
            }
            if(s.charAt(i)==')' && !brac_stack.isEmpty()){
                ans.add(brac_stack.pop());
            }
        }
       return ans;

    }
}
