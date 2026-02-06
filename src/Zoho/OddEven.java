package Zoho;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,3},{2,3},{3,1}};
       int ans=findJudge(3,arr);
        System.out.println(ans);
    }
    public static boolean checkPossibility(int[] nums) {
        int count=0;
        int p1=0;
        int p2=1;
        while(count<=1 && p2<nums.length){
            if(nums[p1]>nums[p2]){
                p2++;
                count++;
            }
            else{
                p1++;
                p2++;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }


        public static int findJudge(int n, int[][] trust) {
            ArrayList<Integer> people=new ArrayList<>();
            ArrayList<Integer> judge=new ArrayList<>();

            for(int i=0;i<trust.length;i++){
                if(people.isEmpty()){
                    people.add(trust[i][0]);
                    judge.add(trust[i][1]);
                }
                else{
                    if(judge.contains(trust[i][0]) && !judge.isEmpty()){
                        Integer x=trust[i][0];
                        judge.remove(x);
                    }
                    else{
                        people.add(trust[i][0]);
                    }
                    if(people.contains(trust[i][1])){
                        Integer x=trust[i][1];
                        judge.remove(x);
                    }
                    else if(!judge.contains(trust[i][1])){
                        judge.add(trust[i][1]);
                    }
                }
            }
            if(judge.isEmpty()) return -1;
            int ans=judge.get(0);
            return ans;
        }


    private static void sortOddEven(int arr[]) {
        int len=arr.length;
        int arr1[]=new int[(len/2)+1];
        int arr2[]=new int[(len/2)+1];
        int arr1P=0;
        int arr2P=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                arr2[arr2P]=arr[i];
                arr2P++;
            }
            else{
                arr1[arr1P]=arr[i];
                arr1P++;
            }
        }
        arr2P--;
        int x=0;
        int y=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.print(arr2[arr2P]+" ");
                arr2P--;

            }
            else{
                System.out.print(arr1[y]+" ");
                y++;
            }
        }
    }
}
