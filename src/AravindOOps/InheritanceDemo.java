package AravindOOps;

public class InheritanceDemo {
    //Inheritance is the concept of using the variables and methods of the class in another class

    public static void main(String[] args) {
        B obj = new B();

        obj.printMyParentDetails();
    }
}
class A{
    String name = "Aravind";
    int age = 20;

    void printMyDetails(){
        System.out.println("Hi all my name is "+this.name);
        System.out.println("Hi my age is "+this.age);
    }
}

class B extends A{
    String name = "Anu";
    int age = 30;

    void printMyParentDetails(){
        System.out.println("Hi all my name is "+super.name);
        System.out.println("Hi my age is "+super.age);
    }
}
/**
 * Types of Inheritance in java
 * Class B extends Class A - Single Inheritance
 * */