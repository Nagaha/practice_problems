package tools;
public class B extends A{
    int B;
    public B(){
        super();//Calls the parent class constructor A().
        System.out.println("Inside the B constructor");
    }
    public B(int B){
        this();//Calls the constructor of the same class B().
        System.out.println("Inside the B parameterized constructor: "+B);
    }
}