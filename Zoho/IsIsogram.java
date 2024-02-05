package Zoho;

import java.util.ArrayList;
import java.util.HashMap;

public class IsIsogram {
    public static boolean IsanIsogram(String str){
        ArrayList<Character> arrayList=new ArrayList<>();
        //We have an arraylist to maintain the available characters in the string
        for(int i=0;i<str.length();i++){
            if(arrayList.contains(str.charAt(i))){
                return false;
                //If it encounters a repeated character return false
            }
            else{
                arrayList.add(str.charAt(i));
                //Add it to the arraylist if it is new visited character
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean ans=IsanIsogram("Machine");
        System.out.println(ans);
    }
}
/*This program takes a string as an input and checks whether it is an isogram or not
An string is called as an isogram only if it contains the unique letters.
This program is case-sensitive
 */
