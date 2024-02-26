package Zoho;
/*6. Remove the duplicates in the String.
Testcase 1:
Input: Java1234
Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
Testcase 2:
Input: Python1223:
Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
Testcase 3:
Input: aBuzZ9900
Output: aBuzC9012
(Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String. Replace with capital C as the letter to be replaced is capital Z.
 The second 9 turns out to be zero and the zero turns out to ‘1’ and the second zero turns out to ‘2’)*/
import java.util.ArrayList;

public class Z_D6 {
    public static void main(String[] args) {
        String ans=removeDuplicates("Python1223");
        System.out.println("Python1223");
        System.out.println(ans);
    }

    private static String removeDuplicates(String str) {
        ArrayList list=new ArrayList();
        for(int i=0;i<str.length();i++){
            //Based on it is character or numeric we change the flow
                if(Character.isAlphabetic(str.charAt(i))){
                    char x=str.charAt(i);
                    while(list.contains(Character.toLowerCase(x)) || list.contains(Character.toUpperCase(x))){
                        //we check for the presence of the lowercase of it or lowercase of it
                        if(x=='z'){
                            x='a';
                            //if encounter the 'z' we change it a
                            continue;//After changing we shouldn't increase it
                        }
                        if(x=='Z'){
                            x='A';
                            continue;
                        }
                        x++;
                    }
                    list.add(x);
                }
                else{
                    int x=(int)str.charAt(i)-48;//we fetch the integer value from the character

                    int cur=x;
                    while(list.contains(cur)){
                        if(cur==9){
                            //if the number is 9 we change it to 0
                            cur=0;
                            continue;//After changing we shouldn't increase it
                        }
                        cur++;
                    }
                    list.add(cur);
                }
            }
        StringBuilder strB=new StringBuilder();
        //We change the list to string builder and then to string 
        for(Object x:list){
            strB.append(x);
        }
        return strB.toString();
        }


}
