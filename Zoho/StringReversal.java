package Zoho;

import java.util.HashMap;

public class StringReversal {
    public static String ReverseString(String str){
        HashMap<Character,Integer> table=new HashMap<>();
        //we maintain a hashmap to check whether it is a repeated character or not
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(Character.isLetter(str.charAt(i)) && (table.get(str.charAt(i)))==null){
                //check for it is a letter and it is not repeated
                sb.append(str.charAt(i));
                if(!table.containsKey(str.charAt(i))){
                    table.put(str.charAt(i),1);
                }
                //if character is not present in hashmap update it and value i with 1
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
         String str="Hello! Naga";
         String ans=ReverseString(str);
        System.out.println(ans);
    }
}

/*This program returns the reversed string after ignoring the special characters and repeated letters*/