package Zoho_3rd_round.TaxiBooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Controller {
    static ArrayList<Driver> driverList=new ArrayList<>();
    static ArrayList<Customer> customerList=new ArrayList<>();
    static ArrayList<Trip> tripList=new ArrayList<>();

    static HashMap<String,Integer> locationList=new HashMap<>();
    public static void main(String[] args) {
        populateData();
        Scanner sc=new Scanner(System.in);
        boolean loop=true;
        int choice;
        while(loop){
            System.out.println("Welcome to ZULA!");
            System.out.println("1.Cab driver login");
            System.out.println("2.Customer Login");
            System.out.println("3.I am a new Customer");
            System.out.println("4.Administrator Login");
            System.out.println("5.Quit");
            choice=sc.nextInt();
            switch(choice){
                case 1:{
                    driverLogin();
                    break;
                }
                case 2:{
                    customerLogin();
                    break;
                }
                case 3:
                {
                    addNewCustomer();
                    break;
                }
                case 4:{
                    adminLogin();
                    break;
                }
                case 5:{
                    System.out.println("Thank you :D");
                    loop=false;
                    break;
                }
                default:{
                    System.out.println("Invalid Input");
                }
            }
        }



    }

    private static void populateData() {
        Driver d1=new Driver(1,"aaa",111,25,"D");
        Driver d2=new Driver(2,"bbb",222,36,"G");
        Driver d3=new Driver(3,"ccc",333,31,"H");
        Driver d4=new Driver(4,"ddd",444,28,"A");

        Customer c1=new Customer(1,"WW",55,25);
        Customer c2=new Customer(2,"XX",66,36);
        Customer c3=new Customer(3,"YY",77,31);
        Customer c4=new Customer(4,"ZZ",88,28);

        locationList.put("A",0);
        locationList.put("C",4);
        locationList.put("D",7);
        locationList.put("F",9);
        locationList.put("B",15);
        locationList.put("G",18);
        locationList.put("H",20);
        locationList.put("E",23);


        driverList.add(d1);
        driverList.add(d2);
        driverList.add(d3);
        driverList.add(d4);


        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
    }

    private static void adminLogin() {
       for(int i=1;i<=4;i++){
           int trips=0;
           int fareCollected=0;
           int commision=0;
           ArrayList<Trip> newList=new ArrayList<>();
           for(Trip x:tripList){
               if(x.getDriverId()==i){
                   trips++;
                   fareCollected+=x.getFare();
                   commision+=x.getCommison();
                   newList.add(x);

               }
           }
           System.out.println("Cab id: "+i);
           System.out.println("Total trips: "+trips);
           System.out.println("Total fare collected: "+fareCollected);
           System.out.println("Total ZULA commission: "+commision);
           if(newList.isEmpty()){
               System.out.println("No summary found");
               continue;
           }
           for(Trip x:newList){
               System.out.println(x.toString());
           }
       }


    }

    private static void customerLogin() {
        Scanner sc = new Scanner(System.in);
        String name="";
        int password=0;
        Customer currCustomer=new Customer();
        int custId=0;

        try {
            System.out.println("Enter the username: ");
            name = sc.nextLine();

            System.out.println("Enter the password: ");
            password = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }
        boolean found=false;

        for(Customer x:customerList){
            if(x.getName().equals(name) && x.getPassword()==password){
                currCustomer=x;
                custId=x.getId();
                System.out.println("Successfull login");
                found=true;
                break;
            }
        }
        sc.nextLine();
        if(!found){
            System.out.println("Wrong username or password");
            return;
        }
        else{
            System.out.println("Enter the source: ");
            String src=sc.nextLine();
            System.out.println("Enter the destination: ");
            String des=sc.nextLine();
            System.out.println("Your source is: "+src+" Your destination is: "+des);
           int srcFromOrigin=locationList.get(src);
           int desFromOrigin=locationList.get(des);
           int fare=Math.abs(srcFromOrigin-desFromOrigin)*10;
           Driver bookedDriver=driverList.get(0);
           int min=100;
           int curr=0;
           int accept=0;
           int earned= (fare-(int) (fare*0.3));
           int commision= (int) (fare*0.3);


           for(Driver x:driverList){
               min=Math.abs(locationList.get(x.getLoc())-locationList.get(src));
               curr=Math.abs(locationList.get(bookedDriver.getLoc())-locationList.get(src));

               if(curr==min && !x.isRest()){
                   bookedDriver=(bookedDriver.getEarnings()<x.getEarnings())?  bookedDriver : x;
               }
               else if(curr>min && !x.isRest()){
                   bookedDriver=x;
               }
           }
           for(Driver x:driverList){
               System.out.println(x.getId()+" "+x.getLoc());
           }
           System.out.println("Booked driver id: "+(bookedDriver.getId()));
           System.out.println("Your fare is: "+fare);
           System.out.println("Do you accept (0/1):");
           accept=sc.nextInt();
           if(accept==1){
               for(Driver x:driverList){
                   if(x==bookedDriver){
                       x.setLoc(des);
                       x.setEarnings(x.getEarnings()+earned);
                       Trip newTrip=new Trip(src,des,custId,commision,fare,x.getId());
                       tripList.add(newTrip);
                       System.out.println(newTrip.toCString());
                       x.setRest(true);
                   }
                   else{
                       x.setRest(false);
                   }
               }
           }
        }
        int choice=0;
        System.out.println("Do you want to see your summary: (0/1): ");
        choice=sc.nextInt();
        if(choice==1){
            for (Trip x:tripList){
                if(x.getCustomerId()==custId) {
                    System.out.println(x.toCString());
                }

            }
        }

    }
    private static void addNewCustomer(){
        Scanner sc = new Scanner(System.in);
        String name="";
        int password=0;
        int age=0;

        try {
            System.out.println("Enter the username: ");
            name = sc.nextLine();

            System.out.println("Enter the password: ");
            password = sc.nextInt();

            System.out.println("Enter your age: ");
            age=sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }
        Customer newCustomer=new Customer(++Customer.currentCustomerId,name,password,age);
        customerList.add(newCustomer);
        System.out.println("Your username is: "+name);
        System.out.println("Your password is: "+password);

    }

    private static void driverLogin() {
        Scanner sc = new Scanner(System.in);
        String name="";
        int password=0;

       try {
            System.out.println("Enter the username: ");
             name = sc.nextLine();

            System.out.println("Enter the password: ");
             password = sc.nextInt();

        }
       catch(Exception e){
           System.out.println("Invalid Input");
       }
        boolean found=false;

       for(Driver x:driverList){
           if(x.getName().equals(name) && x.getPassword()==password){
               System.out.println("Successfull login");
               found=true;
               ArrayList<Trip> newList=new ArrayList<>();
               for(Trip y:tripList){
                   if(y.getDriverId()==x.getId()){
                      newList.add(y);
                   }
               }
               if(newList.isEmpty()){
                   System.out.println("No summary found");
                   return;
               }
               else{
                   for(Trip y:newList){
                       System.out.println(y.toString());
                   }
               }
           }
       }
        if(!found){
            System.out.println("Wrong username or password");
        }

    }
}
