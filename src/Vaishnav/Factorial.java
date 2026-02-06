package Vaishnav;

public class Factorial {
    public static void main(String[] args) {
        int factorial=findFactorial(10);
        System.out.println(factorial);
    }

    private static int findFactorial(int num) {
        int total=1;
        for(int i=1;i<=num;i++){
            total*=i;
        }
        return total;
    }
}
//recursive call stack