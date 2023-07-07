/*INPUT:-
java 100
cpp 65
python 50

OUTPUT:- 
================================
java           100 
cpp            065 
python         050 
================================*/

//This code formats the input in aspecific manner and it uses concepts of String,Logical operator.
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.print(s1);
                for(int y=s1.length()+1;y<=15;y++)
                 System.out.print(" ");
                if(x<100 && x!=0){ 
                 System.out.println("0"+x); 
                }
                else if(x==0){
                  System.out.println("000");
                 }
                else
                 System.out.println(x);
            }
            System.out.println("================================");
            sc.close();
    }
}
