package Vaishnav;

public class Fibonaaci {
    public static void main(String[] args) {
       // printFibo(100);
         String str="aravind";
         char name[]=str.toCharArray();
         int left=0;
         int right= name.length-1;

         while(left<right){
             char temp=name[left];
             name[left]=name[right];
             name[right]=temp;

             left++;
             right--;
         }
        System.out.println(name);
    }

    private static void printFibo(int num) {
        long t1=0;
        long t2=1;
        System.out.print(t1+" "+t2);
        for(int i=0;i<num;i++){
            long t3=t1+t2;
            System.out.print(" "+t3);
            t1=t2;
            t2=t3;
        }
    }
}
