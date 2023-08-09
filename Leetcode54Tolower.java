/*Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"*/
public String toLowerCase(String s) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>64 && (int)s.charAt(i)<91){
                s1.append((char)(s.charAt(i)+32));
            }
            else s1.append(s.charAt(i));
        }
        return s1.toString();
    }