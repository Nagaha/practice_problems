package ZohoL2.src.Naga_Harish_06_02_25.L2;

import java.util.ArrayList;
import java.util.Arrays;

public class Denomination {
    public static void main(String[] args) {
        int n=5;
        int arr[]={100,200,500};
        int value=1000;
        int possibleWays=finPossibleWays(arr,n,value);
        System.out.println("The possible ways are: "+possibleWays);
    }

    private static int finPossibleWays(int[] arr, int n,int val) {
        int notes[]=new int[arr.length*n];//creating an array to store all available notes
        int idx=0;

        for(int i=0;i<arr.length;i++){//adding the notes to array notes
            for(int j=0;j<n;j++){
                notes[idx]=arr[i];
                idx++;
            }
        }

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int count=0;
        int sum=0;
        for(int i=0;i<notes.length;i++){
            ArrayList<Integer> tempList=new ArrayList<>();
            for(int j=i;j< notes.length;j++) {
                if (sum == val && !list.contains(tempList)) {
                    count++;
                    list.add(tempList);
                    tempList.clear();
                    sum = 0;
                    continue;
                }
                if (val - sum < notes[j]) {
                    continue;
                }
                sum += notes[j];
                tempList.add(notes[j]);
            }
        }
        System.out.println(Arrays.toString(notes));
        return count;
    }
}
