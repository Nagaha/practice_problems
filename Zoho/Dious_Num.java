package Zoho;

public class Dious_Num {
    //A dious number is a number whose prime factors are only 2 3 and 5
    //for example the input :6 output: true
    //2 and 3 are prime factors of 6
    //for 100 it is false (2 4 5)are prime factors
    public static void main(String[] args) {
        boolean x=isDoiusNum(100);//calling the function
        System.out.println(x);
    }
  //The approach is similar to brute force where we have to check whether the dividing number is prime or not
    //And if prime we have to check whether it is 2 3 or 5 and return result based on the condition
    private static boolean isDoiusNum(int num) {
        boolean isPrime,flag=false;
        for(int i=2;i<num/2;i++){
            if(num%i==0){//Checking if the number is divisible by i
                isPrime=true;//Initial setting
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){//Checking if i is prime
                        isPrime=false;
                        break;//in case of not prime break to avoid loops
                    }
                }
                if(isPrime && i<=5){//if i is prime and less than 5 we set flag as true
                    flag=true;
                }
                //we do not return here because we have to check for all prime conditions
                else{
                    flag=false;
                }
            }
        }
        return flag;
    }
}
