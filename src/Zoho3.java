public class Zoho3 {
    public static void main(String[] args) {
        String para="((()";
        int long_valid=countLong(para);
        System.out.println("The long valid parentheses is: "+long_valid);
    }

    private static int countLong(String p) {
        int sum=0;//temp sum
        int count=0;//length of valid string
        int max_count=0;
        for (int i=0;i<p.length();i++){
            if(p.charAt(i)=='('){
                count+=1;
                sum+=1;
            }
            if(p.charAt(i)==')'){
                count+=1;
                sum-=1;
            }
            if(i==p.length()-1 && sum>0){
                count= count-1;
            }
            if(i==p.length()-1 && sum<0){
                count= count+1;
            }
            if(sum<0) {
                count-=1;
                max_count = Math.max(max_count, count);
                count=0;
                sum=0;

            }
        }
        return Math.max(max_count, count);
    }
}
