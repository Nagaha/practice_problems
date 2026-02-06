package ZohoL2.src.Learning;

import java.util.Stack;

public class ValidBraces {
    public static void main(String[] args) {
        boolean ans=isValid("){}[]");
        System.out.println(ans);
    }
    private static boolean isValid(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'  || str.charAt(i)=='[' || str.charAt(i)=='('){
                stack.push(str.charAt(i));
            } else if ((str.charAt(i)=='}'  || str.charAt(i)==']' || str.charAt(i)==')') && stack.isEmpty()) {
                return false;

            } else if(!stack.isEmpty() && str.charAt(i)=='}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(!stack.isEmpty() && str.charAt(i)==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(!stack.isEmpty() && str.charAt(i)==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
