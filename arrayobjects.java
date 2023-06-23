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
        for(employee e:em){
            System.out.println(e.regno+" : "+e.name);
            System.out.println("The Employee salary is:$"+e.salary);
        }
    }
}

