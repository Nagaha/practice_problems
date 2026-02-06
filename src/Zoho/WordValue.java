package Zoho;

public class WordValue {
    public static void main(String[] args) {
        String word="abcdd";
        int value=getWordValue(word);
        System.out.println(value);
    }

    private static int getWordValue(String word) {
        int value=0;
        for(int i=0;i<word.length();i++){
            value+=word.charAt(i)-'a'+1;
        }
        return value;
    }
}
