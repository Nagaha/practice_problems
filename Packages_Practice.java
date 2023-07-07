
/*OUTPUT:-
Inside the A parameterized constructor: 5
Inside the A constructor
Inside the B constructor
Inside the B parameterized constructor: 7
Inside the A constructor
Inside the B constructor
 */
//This code helps to understand the flow of control while using the packages and constructors.

import tools.A;
import tools.B;
public class Packages_Practice {
 public static void main(String args[]){
     A obj=new A(5);//Creates the object and the parameterized constructor of A gets executed.
     B obj1=new B(7);//Creates the object and the parameterized constructor of A gets executed.
     B obj2=new B();///Creates the object and the constructor of B gets executed.
 }
}
