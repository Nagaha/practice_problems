package ZohoL2.src.Naga_Harish_06_02_25.L2;

import java.util.Stack;

public class LongestValid {
    public static void main(String[] args) {
        String str="(()()()";
        int longestValid=findLongest("()()())()((())))");
        System.out.println("The length of longest valid parentheses is: "+longestValid);
    }

    private static int findLongest(String s) {
        Stack<Character> stack=new Stack<>();
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(!stack.isEmpty()){
                stack.pop();
                count+=2;
            }
            else{
                max=Math.max(count,max);
                count=0;
            }

        }
        max=Math.max(count,max);
        return max;
    }
}
