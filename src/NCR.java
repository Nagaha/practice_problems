import java.util.*;
public class NCR {
    public static void main(String[] args) {
         long ans=findNCR(21,20);
//        printPascalRow(6);
//        List<List<Integer>> ans=printPascalTriangle(6);
//        for(List<Integer> x:ans){
//            System.out.println(x);
//        }
        System.out.println(ans);
    }

//    private static List<List<Integer>> printPascalTriangle(int row) {
//        List<List<Integer>> ansList=new ArrayList<>();
//        for(int i=2;i<row;i++){
//            List<Integer> tempList=new ArrayList<>();
//            for(int j=0;j<i;j++){
//                tempList.add(findNCR(row-1,j));
//            }
//        }
//        return ansList;
//    }

    private static void printPascalRow(int row) {

        for(int i=0;i<row;i++){
            System.out.println(findNCR(row-1,i));
        }
    }

    private static long findNCR(int n, int r) {
         long numerator=1;
         long denominator=1;

        for(int i=0;i<r;i++){
            numerator=numerator*(n-i);
            denominator=denominator*(i+1);
        }
        return numerator/denominator;
    }
}
