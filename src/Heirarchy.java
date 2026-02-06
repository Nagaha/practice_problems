import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;



public class Heirarchy {

    public static void main(String[] args) {
//        HashMap<String,String> list=new HashMap<>();
//        list.put("ronney","ronaldo");
//        list.put("ram","ronney");
//        list.put("ragu","ronney");
////        int grandChildren=getCountOfGrandChildren(list,"ronaldo");
////        System.out.println(grandChildren);
//
//        List<String[]> list1=new ArrayList<>();
//        list1.add(new String[]{"luke","shaw"});
//        list1.add(new String[]{"shaw","ronney"});
//        list1.add(new String[]{"ronney","ronaldo"});
//        list1.add(new String[]{"ram","ronney"});
//        list1.add(new String[]{"ragu","ram"});
//        list1.add(new String[]{"ragunath","ram"});
//
//
//        int grandChildren1=getCountOfGrandChildren1(list1,"ronney");
//        System.out.println(grandChildren1);
        String arr[][]={
                {"luke","shaw"},
                {"shaw","ronney"},
                {"ronney","ronaldo"},
                {"ram","ronney"},
                {"ragu","ram"},
                {"ragunath","ram"}
        };

        String Grandpa="ronney";
        int ans=getCountOfGrandChildren(arr,Grandpa);
        System.out.println(ans);


    }
    private static int getCountOfGrandChildren(String arr[][], String grandpa){
        int count=0;//to count the grandchildren
        List<String> fatherList= new ArrayList<>();//to store fathers

        for(String x[]:arr){    //traversing 2d string array to find fathers
            if (x[1].equals(grandpa)) {
                fatherList.add(x[0]);
            }
        }

        for(String x: fatherList){  //traversing fathers list to find child
            for(String y[]:arr){
                if(y[1].equals(x)){
                    count++;  //increasing the count if we got grandchildren
                }
            }
        }
        return count; //returning how many grandchildren
    }

    private static int getCountOfGrandChildren1(List<String[]> list, String grandpa) {
        int count=0;
        List<String> fatherList=new ArrayList<>();
        for(String x[]:list){
            if(x[1].equals(grandpa)){
                fatherList.add(x[0]);
            }
        }
        for(String x:fatherList){
            for(String y[]:list){
                if(y[1].equals(x)){
                    count++;
                }
            }
        }
        return count;
    }

    private static int getCountOfGrandChildren(HashMap<String, String> list,String grandpa) {
        String father="";
        for(Map.Entry x:list.entrySet()){
            if(x.getValue().equals(grandpa)){
                father= (String) x.getKey();

            }
        }
        int count=0;
        for(Map.Entry x:list.entrySet()){
            if(x.getValue().equals(father)){
                count++;
            }
        }
        return count;
    }

}
