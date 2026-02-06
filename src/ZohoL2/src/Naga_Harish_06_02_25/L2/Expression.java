package ZohoL2.src.Naga_Harish_06_02_25.L2;

import java.util.Stack;

public class Expression {
    public static void main(String[] args) {
        String exp="13+4*2";
        int value=evaluateExp(exp);
        if(value!=0) {
            System.out.println("The evaluated value: " + value);
        }
    }
    private static int eval(String exp){
        Stack<Character> stack=new Stack<>();
        int ptr=0;
        while(ptr<exp.length()){
            int num=0;

            while(ptr<exp.length() && Character.isDigit(exp.charAt(ptr))){
                num=num*10+(exp.charAt(ptr)-'0');
                ptr++;
            }

        }
        return 0;
    }

    private static int evaluateExp(String exp) {
        if(exp.length()==1) {
            System.out.println("Invalid L2.Expression");
           return 0;
        }
        for(int i=0;i<exp.length()-1;i++){
            if(!Character.isDigit(exp.charAt(i)) && !Character.isDigit(exp.charAt(i+1))){
                System.out.println("Invalid L2.Expression");
                return 0;
            }
        }

        int ptr=0;
        int val=0;
        while(ptr<exp.length()){
            int num=0;
            while(ptr<exp.length() && Character.isDigit(exp.charAt(ptr))){
                num=num*10+(exp.charAt(ptr)-'0');
                ptr++;
            }
            if(ptr<exp.length()) {
                if (exp.charAt(ptr) == '+') {
                    val += num;
                } else if (exp.charAt(ptr) == '-') {
                    val -= num;
                } else if (exp.charAt(ptr) == '*') {
                    val *= num;
                } else if (exp.charAt(ptr) == '/') {
                    val /= num;
                }
                System.out.println(val);
                ptr++;
            }
        }

        return 0;
    }
}
