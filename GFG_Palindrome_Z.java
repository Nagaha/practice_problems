class Solution {
    int isPalindrome(String S) {
        
        int left=0;//Left poiter starts from begining
        int right=S.length()-1;//Right pointer starts from end
        while(left<right){
            if(S.charAt(left)!=S.charAt(right)){
                return 0;//If we encounter a unfavourable condition retur from the function
            }
            left++;//we check for next characters in case of favorable conditions
            right--;
        }
        return 1;
    }
}
