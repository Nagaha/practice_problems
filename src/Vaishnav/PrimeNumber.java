package Vaishnav;

public class PrimeNumber {
    public static void main(String[] args) {
//        int num=37;
//        boolean isPrime=checkPrime(num);
//        System.out.println(isPrime);

//        printPrimes(10,100);

        int countOfPrime=printPrimes(100);
        System.out.println(countOfPrime);
    }

    private static int printPrimes(int limit) {
        int count=0;
        for(int num=2;num<limit;num++){//running from limit
            boolean isPrime=true;//initial

            for(int i=2;i<num;i++){//checks for prime number
                if(num%i==0){//check if prime
                    isPrime=false;//if composite
                    break;//break
                }
            }

            if(isPrime == true){

               count++;
            }
        }
        System.out.println(count);
        return count;
    }

    private static void printPrimes(int start,int end) {
        for(int num=start;num<end;num++){//running from limit
            boolean isPrime=true;//initial

            for(int i=2;i<num;i++){//checks for prime number
                if(num%i==0){//check if prime
                    isPrime=false;//if composite
                    break;//break
                }
            }

            if(isPrime == true){
                System.out.println(num);//prime number
            }
        }
    }
//    private static void printPrimes(int limit) {
//
//        for(int num=2;num<limit;num++){//running from limit
//            boolean isPrime=true;//initial
//
//            for(int i=2;i<num;i++){//checks for prime number
//                if(num%i==0){//check if prime
//                   isPrime=false;//if composite
//                   break;//break
//                }
//            }
//
//            if(isPrime == true){
//                System.out.println(num);//prime number
//            }
//        }
//    }

    private static boolean checkPrime(int num) {
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


}
