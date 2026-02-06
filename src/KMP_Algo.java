import java.util.ArrayList;
import java.util.HashMap;

public class KMP_Algo {
    public static void main(String[] args) {
        boolean ans=isPresent("ababcabcabaababd","ababd");
        System.out.println(ans);
    }

    private static boolean isPresent(String str1, String str2) {
        int arr[]=new int[str2.length()+1];
        arr[0]=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                arr[i+1]=map.get(str2.charAt(i));
            }
            else{
                map.put(str2.charAt(i),i+1);
                arr[i+1]=0;
            }
        }
        
        boolean flag=true;
        int j=0;
        int i=0;
       while(j<arr.length){
           if(str2.charAt(j+1)==str1.charAt(i)){
               j++;
               i++;
               flag=true;
           }
           else{
               j=arr[j];
               flag=false;
           }
       }
        return flag;
    }
}
