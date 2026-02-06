import java.util.Stack;

public class Infosys1 {
    public static void main(String[] args) {
        String ans=findSmallString("110");
        System.out.println(ans);
    }

    private static String findSmallString(String str) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(stack.isEmpty() || str.charAt(i)=='1'){
                stack.push(str.charAt(i));
                continue;
            }
            while(str.charAt(i)=='0' && !stack.isEmpty() && stack.peek()=='1'){
                stack.pop();
            }
            stack.push('0');

        }
        return stack.toString();
    }
}
