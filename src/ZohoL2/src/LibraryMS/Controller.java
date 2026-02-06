package ZohoL2.src.LibraryMS;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Library l=new Library();
        l.populateData();//to populate Initial data

        Scanner sc=new Scanner(System.in);

        System.out.println("-----***Welcome to ZohoLibs***-----");
        boolean cont=true;
        while(cont){
            System.out.println("---------------------------------------------------------------");
            System.out.println("1.Add book");
            System.out.println("2.Add member");
            System.out.println("3.Remove book");
            System.out.println("4.Remove member");
            System.out.println("5.Search book");
            System.out.println("6.Return book");
            System.out.println("7.Generate reports");
            System.out.println("8.Exit");
            System.out.println("9.Borrowed books");
            System.out.println("10.Print Revenue");


            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1:{
                    l.addBook();
                    break;
                }
                case 2:{
                    l.addMember();
                    break;
                }
                case 3:{
                    l.removeBook();
                    break;
                }
                case 4:{
                    l.removeMember();
                    break;
                }
                case 5:{
                    l.searchBook();
                    break;
                }
                case 6:{
                    l.returnBook();
                    break;
                }
                case 7:{
                    l.generateReports();
                    break;
                }
                case 8:{
                    System.out.println("Thanks for visiting ZOHO-LIBS :)");
                    cont=false;
                    break;
                }
                case 10:{
                    l.printRevenue();
                    break;
                }
                case 9:{
                    l.printBorrowBooks();
                    break;
                }
                default:{
                    System.out.println("Invalid choice");
                }
            }

        }
    }
}
