class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
      for(int i=0;i<columnTitle.length();i++){
          sum=sum*26+(columnTitle.charAt(i)-'A'+1);
      }
      return sum;
    }
}
//in first iteration the sum is 0 so the single character is evaluated .
//for length>1 first iteration will produce aa value which will be
//multipled by 26 and added with the number for the character.
