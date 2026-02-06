package Zoho;

public class SubSequence {
    public static void main(String[] args) {
//        String s1="Sangeetha";
//        String s2="Setax";
//        boolean ans=isSubsequence(s1,s2);
//        System.out.println(ans);
        int n=5;
        System.out.println(n>>1);
    }

    private static boolean isSubsequence(String s1, String s2) {
        int p1=0;
        int p2=0;
        while(p1<s1.length() && p2<s2.length()) {
            if(s1.charAt(p1)==s2.charAt(p2)){
                p1++;
                p2++;
            }
            else{
                p1++;
            }
        }
        if(p2==s2.length()){
            return true;
        }
        else{
            return false;
        }
    }
}
