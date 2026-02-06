package Vaishnav;

public class Palindrome {
    public static void main(String[] args) {
        String str="Aravind";//1234321
        boolean isPalindrome = checkIsPalindrome(str);
        System.out.println(isPalindrome);
    }

    private static boolean checkIsPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
// M A D A M
//A R A V I N D