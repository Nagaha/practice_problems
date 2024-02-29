package Zoho;
/*11.
Seperate the odd and even terms in the string
Sample Input-
2
Hacker
Rank
Sample Output-
Hce akr
Rn ak*/
public class Z_D11 {
    
    public static void main(String[] args) {
        String ans=sepTerms("Hacker");
        System.out.println(ans);
    }

    private static String sepTerms(String str) {
        //The approach is simple we add them to different places based on the index
        String even="";//For even indexed characters
        String odd="";//For odd indexed characters
        even+=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(i%2==0){//Check for even
                even+=str.charAt(i);
            }
            else{
                odd+=str.charAt(i);
            }
        }
        return even+" "+odd;
    }
}
