package Vaishnav;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
//        int freq=findFrequency("AFFRINBANU",'B');
//        System.out.println(freq);
        findAllFrequency("cupcake");
        findAllFrequency("ekucpca");
    }

    private static void findAllFrequency(String name) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<name.length();i++){
            if(map.containsKey(name.charAt(i))){
                int freq=map.get(name.charAt(i));
                map.put(name.charAt(i),freq+1);
            }
            else{
                map.put(name.charAt(i),1);
            }
        }

        System.out.println(map);
    }

    private static int findFrequency(String str,char target) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                count++;
            }
        }
        return count;
    }
}
