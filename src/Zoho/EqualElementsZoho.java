package Zoho;

import java.util.HashMap;
import java.util.Map;

public class EqualElementsZoho {
    public static void main(String[] args) {
        int ans=minEqual(new int[]{7,1,3,4,1,7});
        System.out.println(ans);
        int sockPair=findPairs(new int[]{10,20,10,10,30,20,50,10,20});
        System.out.println(sockPair);
        int repeatedA=findRepeated("aba",10);
        System.out.println(repeatedA);
    }

    private static int findRepeated(String str,int N) {
        int i=0;
        int count=0;
        while(i<=N){
            if(str.charAt(i%str.length())=='a'){
                count++;
            }
            i++;
        }
        return count;
    }

    private static int findPairs(int[] arr) {
        HashMap<Integer,Integer> sock = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!sock.containsKey(arr[i]))
            {
                sock.put(arr[i],1);
            }
            else{
                int v=sock.get(arr[i]);
                sock.put(arr[i],v+1);
            }
        }


        int pairs=0;
        for(Map.Entry<Integer,Integer> e : sock.entrySet())
        {
            pairs+=(e.getValue()/2);
        }
        return pairs;
   }

    public static int minEqual(int arr[]){
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                min=Math.min(min,(i-map.get(arr[i])));
            }
            else{
                map.put(arr[i],i);
            }
        }
        return min;
    }

}
