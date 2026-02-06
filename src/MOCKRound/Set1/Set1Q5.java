package MOCKRound.Set1;

import java.util.HashMap;
import java.util.Map;

public class Set1Q5 {
    public static void main(String[] args) {
        HashMap<String,String> family=new HashMap<>();
        String str="RONALDO";
        family.put("LUKE","SHAW");
        family.put("WAYNE","ROONEY");
        family.put("ROONEY","RONALDO");
        family.put("SHAW","ROONEY");
        int ans=findGrandChildren(str,family);
        System.out.println(str+" has "+ans+" grandchildren");
    }

    private static int findGrandChildren(String GrandFather, HashMap<String, String> Map) {
        String Father="";
        int GrandChildren=0;
        for (java.util.Map.Entry<String,String> x:Map.entrySet()){
            if(x.getValue().equals(GrandFather)){
                Father=x.getKey();
                break;
            }
        }
        for (java.util.Map.Entry<String,String> x:Map.entrySet()){
            if(x.getValue().equals(Father)){
                GrandChildren++;
            }
        }
        return GrandChildren;
    }

}
