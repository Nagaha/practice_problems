package Zoho;
/*13.Print the word with odd letters – PROGRAM
Sample Output-
P      P
 R    R
  O  O
   G
  R  R
 A    A
M      M
*/
public class Z_D13 {
    //We first identify the relation ship between the letters where they are being printed
    public static void main(String[] args) {
        String s="PROGRAM";
        for(int i=0;i<s.length();i++){
            for (int j=0;j<s.length();j++){
                if(j==i || j==s.length()-1-i){
                    //if we encounter the above condition based indices we print the specified chracter
                    System.out.print(s.charAt(i));
                }
                System.out.print(" ");
                //Otherwise we print empty space
            }
            System.out.println();
            //for a new line after printing
        }
    }
}
