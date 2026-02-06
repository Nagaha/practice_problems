public class ReverseStringOccurence {
    public static void main(String[] args) {
//        String s1="This is a test String only";
//        String s2="st";
//        String ans=getReveredString(s1,s2);
//        System.out.println(ans);
        String ans=getChractersBetwwen("abcccccbba ");
        System.out.println(ans);
    }

    private static String getChractersBetwwen(String str) {
        int firstIndex=0;
        int lastIndex=0;
        int max=0;
        for(int i=0;i<str.length();i++){
            if(str.lastIndexOf(str.charAt(i))-str.indexOf(str.charAt(i))>max){
                max=str.lastIndexOf(str.charAt(i))-str.indexOf(str.charAt(i));
                firstIndex=str.indexOf(str.charAt(i));
                lastIndex=str.lastIndexOf(str.charAt(i));
            }
        }
        return str.substring(firstIndex+1,lastIndex);
    }

    private static String getReveredString(String s1, String s2) {
        String arr[]=s1.split(" ");
        String normal="";
        String rev="";
        boolean flag=false;
        for(String x:arr){

            for(int i=0;i<=x.length()-s2.length();i++){
                if(x.substring(i,i+s2.length()).equals(s2) || flag){
                    rev=x+" "+rev;
                    flag=true;
                    break;
                }

            }
            if(!flag){
                normal+=x+" ";
            }

        }
        return normal+rev;
    }
}
/**
 * Reverse the words in the given String1 from the first occurrence of String2 in String1 by maintaining white Spaces.
 * example: String1 = Input: This is a test String only String2 = st Output: This is a only String test*/