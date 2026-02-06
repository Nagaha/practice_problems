package Zoho;

public class Z_105 {
    public static void main(String[] args) {
        char arr[][]=new char[][]{
                {'a','z' ,'o' ,'l'},
                {'n','x','h','o'},
                {'v','y','i','v'},
                {'o','r','s','e'},
        };

        String searchData[]={"azo","zoho","is","love","are"};

        findMatching(arr,searchData);
    }

    private static void findMatching(char[][] arr, String[] Data) {
        for (String x : Data) {
            int pointer=0;
            int row=0;
            int col=0;
            int p1=0;
            int p2=0;
           while(pointer<x.length()){
                if(x.charAt(pointer)==arr[p1][p2] && pointer+1<x.length()){
                    if(x.charAt(pointer+1)==arr[p1][p2+1]){
                        pointer++;
                        p2++;
                    }
                    else if(x.charAt(pointer+1)==arr[p1+1][p2]){
                        pointer++;
                        p1++;
                    }
                }
                else {
                    break;
                }
                if(row< arr.length && col<arr[row].length){
                    col++;
                }
                if(col== arr.length-1){
                    row++;
               }

           }
           if(pointer==x.length()){
               System.out.println(x);
           }
        }
    }
}
