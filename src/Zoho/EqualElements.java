package Zoho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EqualElements {
    public static void main(String[] args) {
        //We have to get the minimum distance between the equal paired elements
        int minDistance=getMinimumDistance(new int[]{1,2,3,4,10});//7,1,2,3,5,1,7,1,1
        System.out.println(minDistance);
    }

    private static int getMinimumDistance(int[] arr) {
        int minDistance=Integer.MAX_VALUE;
        HashMap<Integer, ArrayList> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){//creating the map to store the indexes and the key
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }
            else{
                ArrayList temp=new ArrayList();
                temp.add(i);
                map.put(arr[i],temp);
            }
        }

        for(Map.Entry<Integer,ArrayList> entry:map.entrySet()){
            if(entry.getValue().size()>1){
                ArrayList temp=entry.getValue();
                for(int i=0;i<temp.size()-1;i++){
                  for(int j=i+1;j<temp.size();j++){
                      int distance=Math.abs((Integer) temp.get(i)-(Integer) temp.get(j));
                      minDistance=Math.min(distance,minDistance);
                  }
                }
            }
        }

         if(minDistance==Integer.MAX_VALUE){
             return -1;
         }
         else{
             return minDistance;
         }
    }
}
