package Zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Tasks {
    public static void main(String[] args) {
        String ans=findSimilar(new String[]{"hello","hey","yellow"},"hell");
       // int ans=longestValid("((()))((()");
        System.out.println(ans);
        int[][] array = { {1,0,3}, {2,0,4}, {3,0,5}, {4,0,6}};
        int[] com = combineArray(array);
        System.out.println(Arrays.toString(com));
    }

    private static int[] combineArray(int[][] array) {
        int ans[] = new int[array.length + array[0].length -1];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                ans[i+j] += array[i][j];
            }
        }
        return ans;
    }

    private static int longestValid(String str) {
        int count=0;
        int maxCount=0;
        Stack<Character> stack=new Stack<>();
        for(char x:str.toCharArray()){
            if(x=='('){
                stack.push('(');
            }
            else if(!stack.isEmpty() && x==')'){
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

    private static String findSimilar(String[] set, String target) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<target.length()-1;i++){
            String word=""+target.charAt(i)+target.charAt(i+1);
            list.add(word);
        }

        int maxCount=0;
        String maxWord="";
        for(String x:set){
            int count=0;
            String word="";
            for(int i=0;i<x.length()-1;i++){
                word=""+x.charAt(i)+x.charAt(i+1);

                if(list.contains(word)){
                    count++;
                }
            }
            if(maxCount<count){
                maxWord=x;
                maxCount=count;
            }
        }
        return maxWord;
    }
}
//(()))((()
//()()()