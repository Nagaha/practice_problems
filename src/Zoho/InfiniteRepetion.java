package Zoho;

public class InfiniteRepetion {
    public static void main(String[] args) {
        String s="abcac";
        int N=10;
        int ans=findAInN(s,N);
        System.out.println(ans);
    }

    private static int findAInN(String s, int n) {
        int rep=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                rep++;
            }
        }

        int noOfStrings=n/s.length();
        int noOfRep=noOfStrings*rep;

        int remainString=n%s.length();
        String temp=s.substring(0,remainString);
        int remainRep=0;
        for(int i=0;i<temp.length();i++){
            if(s.charAt(i)=='a'){
                remainRep++;
            }
        }
        return remainRep+noOfRep;
    }
}
