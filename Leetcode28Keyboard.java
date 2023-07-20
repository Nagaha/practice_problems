/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

 

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]*/
 public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM"; 
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int count1=0,count2=0,count3=0,len=words[i].length();
            for(int j=0;j<len;j++){
                if(s1.contains(Character.toString(words[i].charAt(j))))
                    count1++;
                else if(s2.contains(Character.toString(words[i].charAt(j))))
                    count2++;
                else if(s3.contains(Character.toString(words[i].charAt(j))))
                    count3++;
                if(count1==len || count2==len || count3==len)
                    list.add(words[i]);
            }
        }
        String ans[] = new String[list.size()];
        list.toArray(ans);
        return ans;
    }