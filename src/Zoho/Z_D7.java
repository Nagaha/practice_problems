package Zoho;

import java.util.Arrays;

/*7. Print whether the version is upgraded, downgraded or not changed according to the input given.
example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded, Input : Version1 4.9.2 Version2 4.8.4 Output: downgraded*/
public class Z_D7 {
    public static void main(String[] args) {
        int ans=checkVersion1("1.0.001","1.0.1");
        if(ans==1){
            System.out.println("Upgraded");
        }
        else if(ans==2){
            System.out.println("Downgraded");
        }
        else{
            System.out.println("Original");
        }
    }

    private static int checkVersion(String v1, String v2) {
        int s1=0,s2=0;
        for(int i=0;i<Math.max(v1.length(),v2.length());i++){
            if(v1.charAt(i)!='.' && v2.charAt(i)!='.'){
                s1=(i<v1.length())?s1*10+(int)v1.charAt(i):s1*10+0;//converting the string into a number
                s2=(i<v2.length())?s2*10+(int)v2.charAt(i):s2*10+0;
                //we get the version as number compare them and return output
            }
        }

        if(s1>s2){
            return 2;
        }
        return 0;

    }
    private static int checkVersion1(String v1,String v2){
        //we can split the string based on the . and compare each digit
        String arr1[]=v1.split("\\.");
        String arr2[]=v2.split("\\.");
        int length=Math.max(arr1.length,arr2.length);
        for(int i=0;i<length;i++){
            int val1=(i<arr1.length)?Integer.parseInt(arr1[i]):0;
            int val2=(i<arr2.length)?Integer.parseInt(arr2[i]):0;
            if(val1>val2){
                return 2;
            } else if (val1<val2) {
                return 1;
            }
        }

        return 0;
    }
}
