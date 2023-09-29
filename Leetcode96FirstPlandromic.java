class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        
        for (String word : words) {
            int p1 = 0;
            int p2 = word.length() - 1;
            boolean flag = true;
            
            while (p2 > p1) {
                if (word.charAt(p1) != word.charAt(p2)) {
                    flag = false;
                    break;
                }
                p1++;
                p2--;
            }
            
            if (flag) {
                ans = word;
                break;
            }
        }
        
        return ans;
    }
}
