/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true*/
public boolean isIsomorphic(String a, String b) {
        boolean y = false;
        char s[]=a.toCharArray();
        char t[]=b.toCharArray();
        if (s.length != t.length) {
            y = false;
        }
        else if(s.length==1 && t.length==1){
            y=true;
        
            
        } else {
            for (int i = 0; i <= s.length; i++) {
                for (int j = i+1; j< s.length; j++) {
                    
                    if (s[i] == s[j]) {
                        if (t[i] == t[j]) {
                            y = true;
                        } else{
                            return false;
                        }
                    } else {
                        if (s[i] != s[j]) {
                            if (t[i] != t[j]) {
                                y = true;
                            } else {
                                return false;
                            }

                        }
                    }
                

                }
                
               
            }
        }
        return y;
    }