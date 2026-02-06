package ZohoL2.src.Madurai2;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="eating an apple";
        String s2="apple eating an";
        boolean isRotated=checkRotated(s1,s2);
        System.out.println(isRotated);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the string 1: ");

//        String s1=sc.next();
//        System.out.println("Enter the string 2: ");
//        String s2=sc.next();
    }

    private static boolean checkRotated(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        String str=s1+" "+s1;
        System.out.println(str);
        for(int i=0;i<str.length()-s2.length();i++){
            String temp=str.substring(i,i+s2.length());

            if(temp.equals(s2)){
                System.out.println(temp);
                return true;
            }
        }
        return false;
    }
}
