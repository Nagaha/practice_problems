import java.util.ArrayList;
import java.util.Stack;

public class Substring {
    public static void main(String[] args) {
//        String ans = findSimilar1(new String[]{"hello", "hey", "yellow"}, "hell");
//        System.out.println(ans);
        int ans=longestValid1("(()))((()))");
        System.out.println(ans);
    }

    private static int longestValid1(String str) {
        //Step 1 if( push ) pop
        int maxCount=0;//to maintain maximum length
        Stack<Character> stack=new Stack<>();
        int count=0;//changable
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push('(');
            }
            else if(!stack.isEmpty() && str.charAt(i)==')'){
                stack.pop();
                count+=2;

            }
            else{
                count=0;
            }
            maxCount=Math.max(maxCount,count);
        }

        return maxCount;
    }

    private static String findSimilar1(String[] S, String Q) {
        //Step1 seprate Q into 2 grams
        ArrayList<String> list=new ArrayList<>();
        //hell -> he el ll
        for(int i=0;i<Q.length()-1;i++){//01 12 23 34
            String word=""+Q.charAt(i)+Q.charAt(i+1);
            list.add(word);
        }

        //Step 2 check and count similar
        int maxCount=0;
        String maxWord="";
        for(int i=0;i<S.length;i++){
            int count=0;
            String str=S[i];//hello
            for(int j=0;j<str.length()-1;j++){// he el ll lo -> 3  hey -> 1  yellow -> 2
                String word=""+str.charAt(j)+str.charAt(j+1);
                if(list.contains(word)){
                    count++;
                }
            }
            if(maxCount<count){
                maxWord=str;
                maxCount=count;
            }
        }
       return maxWord;
    }
}
