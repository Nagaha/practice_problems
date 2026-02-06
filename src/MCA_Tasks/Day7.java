package MCA_Tasks;

import java.util.Stack;

public class Day7 {
    public static void main(String[] args) {
        int ans=validParantheses("()(((((()))");
        System.out.println(ans);
    }

    private static int validParantheses(String str) {
        int count=0;
        int maxcount=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push('(');
            }
            if(str.charAt(i)==')' && !stack.isEmpty()){
                count+=2;
                stack.pop();
            }
            else{
                maxcount=Math.max(count,maxcount);
                count=0;
            }
        }
        maxcount=Math.max(count,maxcount);
        return maxcount;
    }
}
