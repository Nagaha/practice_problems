import java.util.HashSet;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        String s="Hello world!";
        char[] c=s.toCharArray();
        Set ans=new HashSet();
        for(char x:c){
            if(ans.contains(x)){
                continue;
            }
            ans.add(x);
        }
        System.out.println(ans);

    }
}
