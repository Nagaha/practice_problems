package DesignPatterns;
/**
 * If we want to create an object we can use "Creational" design patterns
 * If we want an object to use another object then we use "Structural" design patterns
 * If we want only the communication between two objects we can use "Behavioural" design patterns*/

public class SingletonDemo {
    public static void main(String[] args) {
//        SDemo obj1=SDemo.getInstance();//Whenever we do this it is the same object
//        SDemo obj2=SDemo.getInstance();//As the getInstance() is static we can call it through class name

//        LDemo obj3=LDemo.getInstance();
//        LDemo obj4=LDemo.getInstance();
//
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                LDemo obj=LDemo.getInstance();
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                LDemo obj=LDemo.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}
/**
 * Singleton class:-
 * There should be only one instance of the class
 * This design can be used during the logging
 */
class SDemo{//Normal way to create singleton class(eagerly creation)
    static SDemo obj=new SDemo();//We are creating an object(static because used in main mthd)
    private SDemo(){
        System.out.println("Object Created");
        //we are creating a private constructor which in return
        //not allows the other classes to create object instances through public constructor
        //instead we can create the function to return object
        //SDemo obj=new SDemo(); this is not possible
    }
    public static SDemo getInstance(){//Through this method we can return the object
        return obj;//This is static because we are going to use it in main method
    }
}
/**
 * Problems in eagerly creation method:-
 * The object crated if not used by main() then its waste of memory and power
 * We can overcome this by creating object only at time of need
 * This is called lazy creation method*/

class LDemo{
    private static LDemo obj;//creation of object without initializing 0 memory
    private LDemo(){
        System.out.println("Instance Created");
    };//private constructor
    public static synchronized LDemo getInstance(){
        if (obj==null){
            obj=new LDemo();//Here we are actually creating object when needed
        }
        return obj;
        //We use the if because
        //For the first call we can give an new object but with if clause
        // for the second call we will create one more new object which is out of Singleton
        //So we check whether the object is created or not if created we directly return else we create and return
    }
}
/**
 * Problems in lazy creation method:-
 * The main() is the single thread so it executes one by one so no problem
 * If we have two threads which access the getInstance() method same time we will have two objects
 * That is out of singleton
 */

class TDemo{
    private static TDemo obj;//creation of object without initializing 0 memory
    private TDemo(){
        System.out.println("Instance Created from TDEMO");
    };//private constructor
    public static  TDemo getInstance(){//We use synchronized but it consumes more time
        if (obj==null){
            synchronized (TDemo.class){//Double checking method
                if(obj==null) obj=new TDemo();//Here we are actually creating object when needed
            }
        }
        return obj;
    }
}