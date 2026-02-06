package ZohoL2.src.Madurai;

import java.util.Scanner;
import java.util.Stack;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input="2[3[a2[b]]c]";//cc
        String ans=getDecodedString1(input);
        System.out.println(ans);
    }

    private static String getDecodedString(String str) {
        String ans="";
        int ptr=str.length()-1;
        Stack<String> stack=new Stack<>();
        while(ptr>=0){
            while(str.charAt(ptr)==']' && !stack.isEmpty()){
                ans=stack.pop()+ans;
                ptr--;
            }
            if(str.charAt(ptr)!='[' && !Character.isDigit(str.charAt(ptr)) && str.charAt(ptr)!=']'){
                stack.push(str.charAt(ptr)+"");

            }
            else if(Character.isDigit(str.charAt(ptr))){
                int len=Integer.parseInt(str.charAt(ptr)+"");

                String temp="";
                String curr="";
                while(!stack.isEmpty()){
                    curr+=stack.pop();

                }
                for(int i=0;i<len;i++){
                    temp+=curr;
                }
                stack.push(temp);
            }
            ptr--;
        }
        String aux=stack.toString();

        ans=aux.substring(1,aux.length()-1)+ans;
        return ans;
    }
    private static String getDecodedString1(String str) {
        String ans="";
        Stack<String> st=new Stack<>();
        int ptr=str.length()-1;

        while(ptr>=0){
            String curr="";
            String temp="";
            if(str.charAt(ptr)==']' || Character.isLetter(str.charAt(ptr))){
                st.push(str.charAt(ptr)+"");
            } else if (str.charAt(ptr)=='[') {
                int num=Integer.parseInt(str.charAt(ptr-1)+"");
                while(!st.isEmpty() && !st.peek().equals("]")){
                    curr+=st.pop();
                }
                if(!st.isEmpty() && st.peek().equals("]")) st.pop();
                for(int i=0;i<num;i++){
                    temp+=curr;
                }
                st.push(temp);
                ptr--;
            }
            ptr--;
        }
        ans=st.toString();
        return ans.substring(1,ans.length()-1);
    }
}
