package Zoho;
/*32. Password Strength
Find the strength of the given password string based on the conditions
Four rules were given based on the type and no. of characters in the string.
Weak – only Rule 1 is satisfied or Rule 1 is not satisfied
Medium – Two rules are satisfied
Good – Three rules satisfied
Strong – All Four rules satisfied



I/P: Qw!1        O/P: Weak
I/P: Qwertyuiop      O/P: Medium
I/P: QwertY123       O/P: Good
I/P: Qwerty@123    O/P: Strong*/
public class Z_D32 {
    public static void main(String[] args) {
        String pass="QwertY123";
        String complexity=checkStrength(pass);
        System.out.println(complexity);
    }

    private static String checkStrength(String pwd) {
        boolean eight_char1=false;
        boolean number2=false;
        boolean capital3=false;
        boolean special4=false;
        if(pwd.length()<8){
            return "Weak";
        }
        eight_char1=true;
        boolean arr[]=new boolean[4];
        int count=0;

        for(int i=0;i<pwd.length();i++){
            if(Character.isDigit(pwd.charAt(i))) number2=true;
            if(Character.isUpperCase(pwd.charAt(i))) capital3=true;
            if(!Character.isDigit(pwd.charAt(i)) && !Character.isAlphabetic(pwd.charAt(i)) && pwd.charAt(i)!=' ') special4=true;
        }
        arr[0]=eight_char1;
        arr[1]=number2;
        arr[2]=capital3;
        arr[3]=special4;

        for(boolean x:arr){
            if(x){
                count++;
            }
        }
        System.out.println(count);
        switch(count){
            case 1:{
                return "Weak";

            }
            case 2:{
                return "Medium";

            }
            case 3:{
                return "Good";

            }
            case 4:{
                return "Strong";
            }
            default:{
                return "Nothing";
            }
        }
    }
}
