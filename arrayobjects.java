/*This java code is on the concept of array of objects where we can save multiple objects of same class in ann array.
This code gets input from the user and displays information provided.It also uses a Enhanced for loop.
Sample output:-
Enter the employee name : 
kumar
Enter the employee register number : 
234
Enter the employee Salary : 
5000
Enter the employee name : 
kurnal
Enter the employee register number : 
235
Enter the employee Salary : 
5000
234 : kumar
The Employee salary is:$5000
235 : kurnal
The Employee salary is:$5000
*/
import java.util.Scanner;
class employee{
    int regno;
    String name;
    int salary;
    public void getdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee name : ");
        name=sc.nextLine();
        System.out.println("Enter the employee register number : ");
        regno=sc.nextInt();
        System.out.println("Enter the employee Salary : ");
        salary=sc.nextInt();
    }
}
public class arrayobjects {
    public static void main(String a[]){
        employee e1=new employee();
        e1.getdetails();
        employee e2=new employee();
        e2.getdetails();
        employee em[]=new employee[2];
        em[0]=e1;
        em[1]=e2;
        for(employee e:em){                       //enhanced for loop
            System.out.println(e.regno+" : "+e.name);
            System.out.println("The Employee salary is:$"+e.salary);
        }
    }
}

