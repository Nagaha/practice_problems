/*1.This code prints a pyramid of numbers.
2.The number increases and if reaches the level of row it resides it will decreased until 1.
 3.The output is
       1
      121
     12321
    1234321
   123454321
  12345654321
 1234567654321
*/
public class patterns {
    public static void main(String args[]){
            int a=7;
            for(int i=1;i<=a;i++){
               //System.out.print(" ");
                for(int x=0;x<=(a-i);x++) {
                    System.out.print(" ");
                }
                    for(int j = 1; j <= a; j++) {

                        System.out.print(j);

                        if(j==i){
                            for(int y=j-16;y>0;y--) {
                                System.out.print(y);
                            }
                            break;
                        }


                    }

                System.out.println();
            }

    }
}
