package Vaishnav;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String word1="cupcake";
        String word2="cakcpue";

        boolean isAnagram= checkIsAnagram(word1,word2);
        System.out.println(isAnagram);
    }

    private static boolean checkIsAnagram(String word1, String word2) {
        boolean flag=true;

        if(word1.length()!=word2.length()){ //ethuku??
            return false;
        }

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<word1.length();i++){
            if(map1.containsKey(word1.charAt(i))){
                int freq=map1.get(word1.charAt(i));
                map1.put(word1.charAt(i),freq+1);
            }
            else{
                map1.put(word1.charAt(i),1);
            }
        }

        for(int i=0;i<word2.length();i++){
            if(map2.containsKey(word2.charAt(i))){
                int freq=map2.get(word2.charAt(i));
                map2.put(word2.charAt(i),freq+1);
            }
            else{
                map2.put(word2.charAt(i),1);
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        for(int i=0;i<word1.length();i++){
            if(map1.get(word1.charAt(i))!=map2.get(word1.charAt(i))){
                flag=false;
                break;
            }
        }

        return flag;
    }
}
/*
*   P         M
*    R      A
*      O  R
*        G
*      O   R
*    R       A
*   P          M
* */