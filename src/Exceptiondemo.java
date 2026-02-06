import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptiondemo {
    public Exceptiondemo() throws FileNotFoundException {
    }

    public static void main(String[] args) {
        int a=10,b=5;


        try {
            int arr[]=null;
            System.out.println(arr[1]);
//            int c = a / b;
        }
        catch(ArithmeticException e){
        System.out.println("No such element");
        }
        catch(NullPointerException s){
        System.out.println("No such element");
        };
    }
    File file=new File("abc.txt");
    FileInputStream fs= new FileInputStream(file);

}


