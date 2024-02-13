public class CharWithRef {
    public static void main(String[] args) {
        findCharFreq("abbb");
    }

    private static void findCharFreq(String str) {
        int count=1;
        for(int i=1;i<str.length();i++){

            if( str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                System.out.print(str.charAt(i-1)+""+count);
                count=1;
            }
        }
        System.out.print(str.charAt(str.length()-1)+""+count);
    }

}
