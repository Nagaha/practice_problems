/*Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".*/    
public boolean backspaceCompare(String s, String t) {
      Stack<Character> s1=new Stack<Character>();
      Stack<Character> s2=new Stack<Character>();
      for(char ch:s.toCharArray()){
          if(ch=='#'){
           if(!s1.isEmpty()) s1.pop();
           continue;
          }
            s1.push(ch);
        }
        for(char ch:t.toCharArray()){
          if(ch=='#'){
           if(!s2.isEmpty()) s2.pop();
           continue;
          }
            s2.push(ch);
        }
        if(s1.equals(s2)) return true;
          else return false;
    }