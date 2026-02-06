package Zoho;

import java.util.ArrayList;

public class VowelString {
    public static void main(String[] args) {
        String s="manager";
        ArrayList<String> list=getVowelStrings(s);
        System.out.println(list);
    }

    private static ArrayList<String> getVowelStrings(String s) {
        ArrayList<Character> vowelList=new ArrayList<>();
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');
        ArrayList<String> list =new ArrayList<>();
        int right=s.length();
        int left=s.length()-1;
        while(left>=0){
            if(vowelList.contains(s.charAt(left))){
                list.add(s.substring(left,right));
                right=left;
            }
            left--;
        }
        return list;
    }
}
