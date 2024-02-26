package Zoho;
/*7. Print whether the version is upgraded, downgraded or not changed according to the input given.
example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded, Input : Version1 4.9.2 Version2 4.8.4 Output: downgraded*/
public class Z_D7 {
    public static void main(String[] args) {
        boolean ans=checkVersion("4.8.2","4.9.4");
        if(ans){
            System.out.println("Upgraded");
        }
        else{
            System.out.println("Downgraded");
        }
    }

    private static boolean checkVersion(String v1, String v2) {
        int s1=0,s2=0;
        for(int i=0;i<v1.length();i++){
            if(v1.charAt(i)!='.' && v2.charAt(i)!='.'){
                s1=s1*10+(int)v1.charAt(i);
                s2=s2*10+(int)v2.charAt(i);
                //we get the version as number compare them and return output
            }
        }

        if(s1>s2){
            return false;
        }
        return true;

    }
}
