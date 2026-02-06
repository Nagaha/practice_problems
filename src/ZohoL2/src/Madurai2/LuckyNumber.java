package ZohoL2.src.Madurai2;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int lucky=sc.nextInt();
        System.out.println(getLuckyNumber(lucky));
    }

    private static int getLuckyNumber(int num) {
        int count=0;
        for(int i=3;i<Integer.MAX_VALUE;i++){
           if(isLucky(i)){
               count++;
               if(count==num) return i;
           }
        }
        return -1;
    }

    private static boolean isLucky(int num) {
        while (num>0){
            if(num%10==3 || num%10==4){
                return true;
            }
            num/=10;
        }
        return false;
    }

}
