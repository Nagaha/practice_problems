 /*International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.

 

Example 1:

Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".
Example 2:

Input: words = ["a"]
Output: 1*/
public int uniqueMorseRepresentations(String[] words) {
        String []ans=new String[words.length];
        int a=0;
        int ans1=1;
         HashSet<String> set = new HashSet<>();
        if(words.length<=1) return 1;
        for(String n:words){
            for(int i=0;i<n.length();i++){
                switch(n.charAt(i)){
                    case 'a':
                    ans[a]+=".-";
                    break;
                    case 'b':
                    ans[a]+="-...";
                    break;
                    case 'c':
                    ans[a]+="-.-.";
                    break;
                    case 'd':
                    ans[a]+="-..";
                    break;
                    case 'e':
                    ans[a]+=".";
                    break;
                    case 'f':
                    ans[a]+="..-.";
                    break;
                    case 'g':
                    ans[a]+="--.";
                    break;
                    case 'h':
                    ans[a]+="....";
                    break;
                    case 'i':
                    ans[a]+="..";
                    break;
                    case 'j':
                    ans[a]+=".---";
                    break;
                    case 'k':
                    ans[a]+="-.-";
                    break;
                    case 'l':
                    ans[a]+=".-..";
                    break;
                    case 'm':
                    ans[a]+="--";
                    break;
                    case 'n':
                    ans[a]+="-.";
                    break;
                    case 'o':
                    ans[a]+="---";
                    break;
                    case 'p':
                    ans[a]+=".--.";
                    break;
                    case 'q':
                    ans[a]+="--.-";
                    break;
                    case 'r':
                    ans[a]+=".-.";
                    break;
                    case 's':
                    ans[a]+="...";
                    break;
                    case 't':
                    ans[a]+="-";
                    break;
                    case 'u':
                    ans[a]+="..-";
                    break;
                    case 'v':
                    ans[a]+="...-";
                    break;
                    case 'w':
                    ans[a]+=".--";
                    break;
                    case 'x':
                    ans[a]+="-..-";
                    break;
                    case 'y':
                    ans[a]+="-.--";
                    break;
                    case 'z':
                    ans[a]+="--..";
                    break;


                }
            }
            a++;
        }
    for(String d:ans){
        set.add(d);
    }
    ans1=set.size();
    
       return ans1; 
    }