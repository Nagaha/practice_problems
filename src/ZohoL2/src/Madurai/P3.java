package ZohoL2.src.Madurai;

import java.util.ArrayList;

public class P3 {
    public static void main(String[] args) {
        String str="Example";
        String ans=removeVowels(str);
        System.out.println(ans);
    }

    private static String removeVowels(String str) {
        ArrayList<Character> list=new ArrayList<>();
        list.add('a');
        list.add('A');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('E');
        list.add('O');
        list.add('U');
        list.add('I');

        String ans="";
        for(int i=0;i<str.length();i++){
            if(!list.contains(str.charAt(i))){
                if(Character.isUpperCase(str.charAt(i))){
                    ans+='#';
                    ans+=Character.toLowerCase(str.charAt(i));
                }
                else{
                    ans+='#';
                    ans+=Character.toUpperCase(str.charAt(i));
                }
            }
        }
        return ans;

    }
}
