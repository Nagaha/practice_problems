import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Exception_Demo  {
    public static void main(String[] args){
//        int arr[]={2,5,6,7,8,9,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int x = sc.nextInt();
//            System.out.println(arr[arr.length]);
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
        finally {
            System.out.println("In finally block");
        }
    }
}
