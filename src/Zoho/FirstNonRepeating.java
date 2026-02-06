package Zoho;

import java.util.ArrayList;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String input="aaaabccbdced";
        char ans=getFirstNonRepeatingCharacter(input);
        System.out.println(ans);
    }

    private static char getFirstNonRepeatingCharacter(String str) {
        ArrayList<Character> list=new ArrayList<>();
        ArrayList<Character> nonRepeatingList=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(list.isEmpty()){
                list.add(str.charAt(i));
            }
            else if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
                nonRepeatingList.add(str.charAt(i));
            }
            else if (list.contains(str.charAt(i))) {
                Character x=str.charAt(i);
                nonRepeatingList.remove(x);

            }
        }
        return nonRepeatingList.get(0);
    }
}
