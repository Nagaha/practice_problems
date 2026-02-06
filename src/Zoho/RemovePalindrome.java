package Zoho;

public class RemovePalindrome {
    public static void main(String[] args) {
        String s="He did a good mam";
        String ans=removePalindrome(s);
        System.out.println(ans);
    }

    private static String removePalindrome(String str) {
        String ans="";
        //we take each word from the sentence and check it is palindrome or not
        str=str+" ";//we add an extra space in the end to make the last word
        String word="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word+=str.charAt(i);
            }
            else{
                if(!isPalindrome(word)){
                    ans+=word;
                }
                word="";
            }
        }
        return ans;

    }

    private static boolean isPalindrome(String word) {
        int left=0;
        int right=word.length()-1;
        while(left<=right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
