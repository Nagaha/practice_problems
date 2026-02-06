package MCA_ZOHO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TicketBook {
    static int id=1;
    public static void main(String[] args) {
        //Initial total seats
        int totalUpper=1;
        int totalMiddle=1;
        int totalLower=1;

        int totalRac=1;
        int totalWL=1;

        //for storing details
        ArrayList<Passenger> upperBerthList=new ArrayList<>();
        ArrayList<Passenger> middleBerthList=new ArrayList<>();
        ArrayList<Passenger> lowerBerthList=new ArrayList<>();

        ArrayList<Passenger> RAC=new ArrayList<>();
        ArrayList<Passenger> waitingList=new ArrayList<>();

        //total list of passengers
        HashMap<Integer,Passenger> totalList=new HashMap<>();
       

        Scanner sc=new Scanner(System.in);
        boolean cont=true;

        while(cont){
            System.out.println("Welcome to Zoho railways....");
            System.out.println("1.Book Tickets");
            System.out.println("2.Cancel Tickets");
            System.out.println("3.Print booked");
            System.out.println("4.Print available");
            System.out.println("5.Exit");

            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();

            switch(ch){
                case 1:{
                    System.out.println("Ticket booking");
                    System.out.println("Enter your name: ");
                    String name=sc.next();
                    //sc.nextLine();
                    System.out.println("Enter your age: ");
                    int age=sc.nextInt();
                    if(age<1) {
                        System.out.println("Wrong age");
                        break;
                    }
                    System.out.println("Enter your berth preference(L,M,U): ");
                    String b_p=sc.next();

                    String seat="";//to be changed later
                    if(totalLower-lowerBerthList.size()<=0 &&
                            totalUpper-upperBerthList.size()<=0 &&
                            totalMiddle-middleBerthList.size()<=0){
                        if(totalRac-RAC.size()>0){
                            seat=(RAC.size()+1)+"RAC";
                            Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                            RAC.add(p);
                            totalList.put(id,p);
                            System.out.println(p.toString());
                        }
                        else if(totalWL-waitingList.size()>0){
                            seat=(waitingList.size()+1)+"WL";
                            Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                            waitingList.add(p);
                            totalList.put(id,p);
                            System.out.println(p.toString());
                        }
                    //No seats in any of the three berths
                    else if((b_p.charAt(0)=='L' && totalLower-lowerBerthList.size()<=0) ||
                            (b_p.charAt(0)=='U' && totalUpper-upperBerthList.size()<=0) ||
                            (b_p.charAt(0)=='M' && totalMiddle-middleBerthList.size()<=0))
                    {
                        if(b_p.charAt(0)=='L'){
                            if(totalUpper-upperBerthList.size()>0){
                                seat=(upperBerthList.size()+1)+"U";
                                Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                                upperBerthList.add(p);
                                totalList.put(id,p);
                                System.out.println(p.toString());
                            }
                            else if(totalMiddle-middleBerthList.size()>0){
                                seat=(middleBerthList.size()+1)+"M";
                                Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                                middleBerthList.add(p);
                                totalList.put(id,p);
                                System.out.println(p.toString());
                            }
                        }
                        else if(b_p.charAt(0)=='M'){
                            if(totalUpper-upperBerthList.size()>0){
                                seat=(upperBerthList.size()+1)+"U";
                                Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                                upperBerthList.add(p);
                                totalList.put(id,p);
                                System.out.println(p.toString());
                            }
                            else if(totalLower-lowerBerthList.size()>0){
                                seat=(lowerBerthList.size()+1)+"L";
                                Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                                lowerBerthList.add(p);
                                totalList.put(id,p);
                                System.out.println(p.toString());
                            }
                        }
                        else if(b_p.charAt(0)=='U'){
                            if(totalMiddle-middleBerthList.size()>0){
                                seat=(middleBerthList.size()+1)+"M";
                                Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                                middleBerthList.add(p);
                                totalList.put(id,p);
                                System.out.println(p.toString());
                            }
                            else if(totalLower-lowerBerthList.size()>0){
                                seat=(lowerBerthList.size()+1)+"L";
                                Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                                lowerBerthList.add(p);
                                totalList.put(id,p);
                                System.out.println(p.toString());
                            }
                        }
                    }

                    //No seats in all berths

                        else{
                            System.out.println("No tickets available");
                        }
                    }
                    //available
                    if(b_p.charAt(0)=='L' && totalLower-lowerBerthList.size()>0){
                        seat=(lowerBerthList.size()+1)+"L";
                        Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                        lowerBerthList.add(p);
                        totalList.put(id,p);
                        System.out.println(p.toString());

                    }
                    if(b_p.charAt(0)=='M' && totalMiddle-middleBerthList.size()>0){
                        seat=(middleBerthList.size()+1)+"M";
                        Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                        middleBerthList.add(p);
                        totalList.put(id,p);
                        System.out.println(p.toString());
                    }
                    if(b_p.charAt(0)=='U' && totalUpper-upperBerthList.size()>0){
                        seat=(upperBerthList.size()+1)+"U";
                        Passenger p=new Passenger(id,age,name,b_p,seat);//object creation
                        upperBerthList.add(p);
                        totalList.put(id,p);
                        System.out.println(p.toString());
                    }
                    id++;
                    break;
                }
                case 2:{
                    System.out.println("Cancelling tickets");
                    break;
                }
                case 3:{
                    if(totalList.isEmpty()) System.out.println("No tickets booked");
                    else{
                        for(Passenger p:totalList.values()){
                            System.out.println(p.toString());
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("These tickets are available");
                    System.out.println("Upper berth:"+(totalUpper-upperBerthList.size()));
                    System.out.println("lower berth:"+(totalLower-lowerBerthList.size()));
                    System.out.println("middle berth:"+(totalMiddle-middleBerthList.size()));
                    System.out.println("RAC berth:"+(totalRac-RAC.size()));
                    System.out.println("waiting list:"+(totalWL-waitingList.size()));
                    break;
                }
                case 5:{
                    cont=false;
                    break;
                }
                default:{
                    System.out.println("Invalid option");
                }
            }

        }

        System.out.println("Thanks for visiting");



    }
}
