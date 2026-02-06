package Zoho;

import java.util.Stack;

/**
 * 9. Reverse the words in the given String1 from the first occurrence of String2 in String1 by maintaining white Spaces.
 * example: String1 = Input: This is a test String only String2 = st Output: This is a only String test*/
public class Z_D8 {
    public static void main(String[] args) {
        String ans=reversePart("This is a test String only","st");
        System.out.println(ans);
        System.out.println(String.valueOf(250));
    }

    private static String reversePart(String s1, String s2) {
        String myStr = s1;
        String regex = "[,\\.\\s]";
        String[] myArray = myStr.split(regex);
        boolean flag=false;
        String word="";
        Stack<String> st=new Stack<>();
       for(String x:myArray){
           if(checkPresent(x,s2) || flag){
               st.push(x);
               flag=true;
               continue;
           }
           word+=x+" ";
       }
       while (!st.isEmpty()) {
           word += st.pop() + " ";
       }
       return word;
    }

    private static boolean checkPresent(String word,String s2) {
       if(word.contains(s2)){
           return true;
       }
        return false;
    }
}
