package Zoho_3rd_round.RailwayReservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicketBooker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Ticket booking application");
        boolean cont=true;//variable to get user choice to continue or not
        //creating the list for all three berths
        ArrayList<Passenger> upperBerth=new ArrayList<>();//21
        ArrayList<Passenger> middleBerth=new ArrayList<>();//21
        ArrayList<Passenger> lowerBerth=new ArrayList<>();//21

        //creating list for RAC and waiting list
        ArrayList<Passenger> RAC=new ArrayList<>();//18
        ArrayList<Passenger> waitingList=new ArrayList<>();//10

        //creating variables to maintain the total seats
        int totalUpper=1;
        int totalMiddle=1;
        int totalLower=1;
        int totalRAC=1;
        int totalWaiting=1;

        //creating variables to maintain passenger id
        int passengerID=1;

        //list to maintain passenger details
        ArrayList<Passenger> passengerList=new ArrayList<>();

        while(cont){
            System.out.println("1.Book");
            System.out.println("2.Cancel");
            System.out.println("3.Print Booked Tickets");
            System.out.println("4.Pint Available Tickets");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();//variable to store choice of the user

            switch(choice){
                case 1:{
                    System.out.println("Ticket booking");
                    System.out.println("Enter your name: ");
                    String name=sc.next();
                    sc.nextLine();
                    System.out.println("Enter your age: ");
                    int age=sc.nextInt();
                    if(age<1) {
                        System.out.println("Wrong age");
                        break;
                    }
                    System.out.println("Enter your berth preference(L,M,U): ");
                    char berth_preference=sc.next().charAt(0);
                    //creating a new passenger
                    Passenger new_passenger=new Passenger(name,age,berth_preference);
                    new_passenger.id = passengerID;
                    passengerID++;
                    //check if all berths are filled
                    if(totalUpper-upperBerth.size()<=0 && totalLower-lowerBerth.size()<=0 && totalMiddle-middleBerth.size()<=0){
                        if(totalRAC- RAC.size()>0){//Alloting in RAC
                            new_passenger.status=String.valueOf(RAC.size()+1)+"RAC";
                            RAC.add(new_passenger);
                        } else if (totalRAC- RAC.size()<=0 && totalWaiting-waitingList.size()>0) {//Alloting in waiting list
                            new_passenger.status=String.valueOf(waitingList.size()+1)+'W';
                            waitingList.add(new_passenger);
                        } else if (totalRAC- RAC.size()<=0 && totalWaiting-waitingList.size()<=0) {
                            System.out.println("No tickets available");//No tickets available
                            System.out.println("--------------------------------------------------");
                            continue;
                        }
                    }
                    //alloting berth lower
                    if(berth_preference=='L' && totalLower-lowerBerth.size()<=0){
                        if(totalMiddle-middleBerth.size()>0){
                            new_passenger.status=String.valueOf( middleBerth.size()+1)+'M';
                            middleBerth.add(new_passenger);
                        } else if (totalUpper-upperBerth.size()>0) {
                            new_passenger.status=String.valueOf( upperBerth.size()+1)+'U';
                            upperBerth.add(new_passenger);
                        }
                    }
                    else if(berth_preference=='L'){
                        new_passenger.status=String.valueOf( lowerBerth.size()+1)+'L';
                        lowerBerth.add(new_passenger);
                    }

                    //alloting berth middle
                    if(berth_preference=='M' && totalMiddle-middleBerth.size()<=0){
                        if(totalUpper-upperBerth.size()>0){
                            new_passenger.status=String.valueOf(upperBerth.size()+1)+'U';
                            upperBerth.add(new_passenger);
                        }
                        else if(totalLower-lowerBerth.size()>0){
                            new_passenger.status=String.valueOf( lowerBerth.size()+1)+'L';
                            lowerBerth.add(new_passenger);
                        }
                    } else if (berth_preference=='M')
                    {
                        new_passenger.status=String.valueOf( middleBerth.size()+1)+'M';
                        middleBerth.add(new_passenger);
                    }

                    //alloting upper berth
                    if(berth_preference=='U' && totalUpper-upperBerth.size()<=0){
                        if(totalLower-lowerBerth.size()>0){
                            new_passenger.status=String.valueOf( lowerBerth.size()+1)+'L';
                            lowerBerth.add(new_passenger);
                        }
                        else if(totalMiddle-middleBerth.size()>0){
                            new_passenger.status=String.valueOf( middleBerth.size()+1)+'M';
                            middleBerth.add(new_passenger);
                        }
                    } else if (berth_preference=='U') {
                        new_passenger.status=String.valueOf(upperBerth.size()+1)+'U';
                        upperBerth.add(new_passenger);
                    }
                    passengerList.add(new_passenger);
                    //print berth
                    System.out.println(new_passenger.toString());
                    System.out.println("--------------------------------------------------");
                    break;
                }
                case 2:{
                    System.out.println("Ticket cancelling");
                    System.out.println("Enter your id: ");
                    int id=sc.nextInt();
                    //check for passenger in passenger list
                    for(Passenger x:passengerList){
                        if(x.id==id){
                            if(x.status.length()==2 && x.status.charAt(1)=='U'){
                                upperBerth.remove(x);
                                System.out.println("Removed from upper");
                                if(RAC.size()>0) {
                                   String temp=RAC.get(0).status;
                                    RAC.get(0).status = x.status;
                                    upperBerth.add(RAC.get(0));
                                    RAC.remove(0);
                                    if(waitingList.size()>0){
                                        waitingList.get(0).status= temp;
                                        RAC.add(waitingList.get(0));
                                        waitingList.remove(0);
                                    }
                                }
                            }
                            if(x.status.length()==2 && x.status.charAt(1)=='M'){
                                middleBerth.remove(x);
                                System.out.println("Removed from middle");
                                if(RAC.size()>0) {
                                    String temp=RAC.get(0).status;
                                    RAC.get(0).status = x.status;
                                    middleBerth.add(RAC.get(0));
                                    RAC.remove(0);
                                    if(waitingList.size()>0){
                                        waitingList.get(0).status= temp;
                                        RAC.add(waitingList.get(0));
                                        waitingList.remove(0);
                                    }
                                }
                            }
                            if(x.status.length()==2 && x.status.charAt(1)=='L'){
                                lowerBerth.remove(x);
                                System.out.println("Removed from lower");
                                if(RAC.size()>0) {
                                    String temp=RAC.get(0).status;
                                    RAC.get(0).status = x.status;
                                    lowerBerth.add(RAC.get(0));
                                    RAC.remove(0);
                                    if(waitingList.size()>0){
                                        waitingList.get(0).status= temp;
                                        RAC.add(waitingList.get(0));
                                        waitingList.remove(0);
                                    }
                                }
                            }
                            if(x.status.length()==4){
                                RAC.remove(x);
                                System.out.println("Removed from RAC");
                                if(waitingList.size()>0){
                                    waitingList.get(0).status=x.status;
                                    RAC.add(waitingList.get(0));
                                    waitingList.remove(0);
                                }
                            }
                            if(x.status.length()==2 && x.status.charAt(1)=='W'){
                                waitingList.remove(x);
                                System.out.println("Removed from waiting list");
                            }
                            passengerList.remove(x);
                            break;
                        }

                    }

                    System.out.println("Ticket canceled successfully");
                    System.out.println("--------------------------------------------------");
                    break;
                }
                case 3:{
                    System.out.println("Printing booked tickets");
                    for(Passenger x:passengerList){
                        System.out.println(x.toString());
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                }
                case 4:{
                    System.out.println("Printing available tickets");
                    System.out.println("Upper Berth: "+(totalUpper-upperBerth.size()));
                    System.out.println("Middle Berth: "+(totalMiddle-middleBerth.size()));
                    System.out.println("Lower Berth: "+(totalLower-lowerBerth.size()));
                    System.out.println("RAC: "+(totalRAC-RAC.size()));
                    System.out.println("Waiting list: "+(totalWaiting-waitingList.size()));
                    System.out.println("-------------------------------------------------------------");
                    break;
                }
                case 5:{
                    cont=false;
                    System.out.println("Thank you visit again :)");
                    break;
                }
                default:{
                    System.out.println("Wrong choice");
                }
            }

        }


    }
}
