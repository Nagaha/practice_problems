package ZohoL2.src.Madurai2;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans=checkPalindrome(8);
        System.out.println(ans);
    }

    private static boolean checkPalindrome(int num) {
        String binary="";
        while(num>0){
            binary=num%2+binary;
            num/=2;
        }
        System.out.println(binary);
        int left=0;
        int right=binary.length()-1;
        while (left<right){
            if(binary.charAt(left)!=binary.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
