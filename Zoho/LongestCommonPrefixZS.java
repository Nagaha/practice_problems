package Zoho;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String ans=longestCommonPrefix(new String[]{"flower","flow","flight"});
        if(ans.length()==0){
            System.out.println(-1);
        }
        else {
            System.out.println(ans);
        }
    }

    private static String longestCommonPrefix(String str[]) {
        Arrays.sort(str);//we arrange them lexicographically and take the first and last string
        String s1=str[0];
        String s2=str[str.length-1];
        int x=0;//To keep track of the ending of substring
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                x++;//We encounter common character we increment the index of ending
            }
            else {
                break;
            }
        }
        return s1.substring(0,x);
    }
}
