package Zoho_3rd_round.ParkingLot;

import Zoho_3rd_round.Ticket;

import java.util.Collections;
import java.util.Scanner;

public class TicketBooker {
    public static void main(String[] args) {
        System.out.println("***Welcome to Zoho smart ParKINGS***");
        Scanner sc=new Scanner(System.in);
        Controller c=new Controller();

        boolean isContinue=true;
        while(isContinue){
            System.out.println("----------------------------------------------------");
            System.out.println("1.Create parking lot");
            System.out.println("2.Park vehicle");
            System.out.println("3.UnPark vehicle");
            System.out.println("4.Show free count");
            System.out.println("5.Show free slots");
            System.out.println("6.Show occupied slots");
            System.out.println("7.Exit");
            System.out.println("Enter your choice: ");

            int choice=sc.nextInt();
            switch (choice){
                case 1:{

                    System.out.println("Enter the parking lot name: ");
                    String name=sc.next();
                    System.out.println("Enter the number of floors: ");
                    int floors=sc.nextInt();
                    System.out.println("Enter the number of slots per floor: ");
                    int slots=sc.nextInt();
                    c.createParkingLot(name,floors,slots);//calling the function
                    System.out.println("Created parking lot with "+floors+" floors and "+slots+" slots per floor");

                    break;
                }
                case 2:{
                    System.out.println("Enter the registration number: ");
                    String regNo=sc.next();
                    System.out.println("Enter the type: ");
                    String type=sc.next();
                    System.out.println("Enter color: ");
                    String color=sc.next();
                    String ticketId=c.parkVehicle(regNo,type,color);
                    if(ticketId!=null) System.out.println("Parked vehicle Ticket ID: "+ticketId);
                    break;
                }
                case 3:{
                    System.out.println("Enter the ticket id: ");
                    String ticket_id=sc.next();
                    boolean status=c.unparkVehicle(ticket_id);
                    if(status) System.out.println("Vehicle is un parked");
                    else System.out.println("Invalid ticket");

                    break;
                }
                case 4:{

                }
                case 5:{

                }
                case 6:{

                }
                case 7:{
                    System.out.println("Thanks for visiting :)");
                    break;
                }
                default:{
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
