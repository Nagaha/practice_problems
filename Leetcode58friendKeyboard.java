/*Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 

Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.*/
public boolean isLongPressedName(String name, String typed) {
        int m=name.length(), n=typed.length();
        int i=0,j=0;
        while(i<m && j<n){
            char c1=name.charAt(i),c2=typed.charAt(j);
            if(c1!=c2) return false;
            int count1=0;
            while(i<m && name.charAt(i)==c1){
                count1++;
                i++;
            }
            int count2=0;
            while(j<n && typed.charAt(j)==c2){
                count2++;
                j++;
            }
            if(count2<count1) return false;
        }
        return (i==m && j==n);
    }