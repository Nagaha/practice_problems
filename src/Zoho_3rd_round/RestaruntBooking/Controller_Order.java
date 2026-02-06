package Zoho_3rd_round.RestaruntBooking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Controller_Order {
    static  User u1=new User("Ram",'M',456,"MMS");
    static ArrayList<String> serviceAreas=new ArrayList<>();

    static Restarunt res1=new Restarunt("SS",serviceAreas,"Dosa",250,100);

    public static ArrayList<User> userList=new ArrayList<>();
    public static ArrayList<Restarunt> restaruntlist=new ArrayList<>();
    public static HashMap<Long,User> map=new HashMap<>();
    public static HashMap<String,Restarunt> rsmap=new HashMap<>();
    static User current_user;

    public static void main(String[] args) {

        serviceAreas.add("MMS");
        serviceAreas.add("HMS");
        userList.add(u1);
        map.put(u1.phoneNumber,u1);
        rsmap.put(res1.name,res1);
        restaruntlist.add(res1);
        Scanner sc=new Scanner(System.in);

        boolean cont=true;
        System.out.println("***Welcome to FOODKART***");

        while(cont){
            System.out.println("*******************************************");
            System.out.println("1.Register user");
            System.out.println("2.Register restaurant");
            System.out.println("3.Login user");
            System.out.println("4.Login restaurant owner");
            System.out.println("5.Exit");
            System.out.println("6.Show DB");
            System.out.println("Enter your choice: ");

            int choice=sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("Enter your name: ");
                    String name=sc.next();
//                    sc.next();
                    System.out.println("Enter your phone number: ");
                    long number=sc.nextLong();
                    sc.nextLine();
                    System.out.println("Enter your gender(M,F): ");
                    char gender=sc.nextLine().charAt(0);
                    System.out.println("Enter your pincode: ");
                    String pincode=sc.nextLine();

                    //creating a new user
                    User user=new User(name,gender,number,pincode);
                    userList.add(user);
                    map.put(number,user);
                    System.out.println("Your login id(phone number): "+number);
                    System.out.println("Your data is stored successfully");
                    break;
                }
                case 2:{
                    System.out.println("Enter the restaurant name:");
                    String res_name=sc.next();
                    sc.nextLine();
                    boolean con=true;
                    ArrayList<String> pincodes=new ArrayList<>();
                    while(con){
                        System.out.println("Enter the  pincodes servicable: ");
                        String pin=sc.nextLine();
                        pincodes.add(pin);
                        System.out.println("Do you want to add more:(Y/N) ");
                        char ch=sc.nextLine().charAt(0);
                        if(ch!='Y') con=false;
                    }
                    System.out.println("Enter the dish name: ");
                    String dish_name=sc.nextLine();
                    System.out.println("Enter the price: ");
                    int price=sc.nextInt();
                    System.out.println("Enter initial quantity: ");
                    int initial=sc.nextInt();

                    Restarunt restarunt=new Restarunt(res_name,pincodes,dish_name,initial,price);
                    restaruntlist.add(restarunt);

                    System.out.println("Restaurant added successfully");
                    rsmap.put(restarunt.name,restarunt);
                    break;
                }
                case 3:{
                    System.out.println("Enter the phone number: ");
                    long num=sc.nextLong();
                    current_user=map.get(num);
                    if(current_user==null) {
                        System.out.println("Please register user");
                        break;
                    }
                    System.out.println("1.See order history");
                    System.out.println("2.place order");
                    System.out.println("3.Give ratings");
                    System.out.println("Enter your choice: ");
                    int user_choice=sc.nextInt();
                    if(user_choice==2){
                        ArrayList<Restarunt> eligibleList=new ArrayList<>();
//                        System.out.println(restaruntlist);
                        for(Restarunt res:restaruntlist){
                            if(res.serviceAreas.contains(current_user.pincode)){
                                eligibleList.add(res);
                            }

                        }
//                        System.out.println(eligibleList);
                        if(eligibleList.size()==0){
                            System.out.println("Your location is not serviceable");
                            break;
                        }
                        Collections.sort(eligibleList,(o1,o2)->o2.price- o1.price);
                        for(int i=0;i<eligibleList.size();i++){
                            System.out.println((i+1)+" "+eligibleList.get(i).dishName+" "+eligibleList.get(i).name+" "+eligibleList.get(i).price);
                        }
                        System.out.println("Enter your option: ");
                        int sno=sc.nextInt();
                        System.out.println("Enter the quantity: ");
                        int quan=sc.nextInt();
                        if(quan<eligibleList.get(sno-1).initialQuantity){
                            Restarunt curr_res=eligibleList.get(sno-1);
                            System.out.println("Your order is placed and price is "+curr_res.price*quan);
                            current_user.orderHistory.add(new Order(curr_res.name,quan, curr_res.dishName, curr_res.price*quan));
                            curr_res.initialQuantity-=quan;
                        }
                        else{
                            System.out.println("The given quantity is not available");
                            break;
                        }
                    }
                    else if(user_choice==1){
                        System.out.println("Here is your order history");
                        for(Order x: current_user.orderHistory){
                            System.out.println(x.toString());
                        }
                    }
                    else if(user_choice==3){
                        System.out.println("Enter the restarunt name: ");
                        String res_name_rating=sc.nextLine();
                        Restarunt res_to_rate=rsmap.get(res_name_rating);
                        if(res_to_rate==null){
                            System.out.println("No such restaturnt exists");
                        }
                        else{
                            System.out.println("Enter your rating out of 5: ");
                            double ratings=sc.nextDouble();
                            res_to_rate.ratings=(res_to_rate.ratings+ratings)/2;
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("Enter your restarunt name: ");
                    String res_name=sc.next();
                    System.out.println(res_name);
                    Restarunt curr_res=rsmap.get(res_name);
                    if(curr_res==null){
                        System.out.println("Please register restarunt");
                        break;
                    }
                    else{
                        System.out.println(curr_res.toString());
                    }
                    System.out.println("Do you want to change the quantity(Y/N): ");
                    sc.nextLine();
                    char res_owner_ch=sc.nextLine().charAt(0);
                    if(res_owner_ch=='Y'){
                        System.out.println("Enter the quantity: ");
                        int newQuan=sc.nextInt();
                        curr_res.initialQuantity+=newQuan;
                        System.out.println("Quantity updated");
                    }
                    //can't hard code ne res

                    break;
                }
                case 5:{
                    System.out.println("Thanks for visiting :)");
                    cont=false;
                    break;
                }
                case 6:{
                  for(User user:userList){
                      System.out.println(user.toString());
                  }
                    System.out.println("*************************");
                  for(Restarunt res:restaruntlist){
                      System.out.println(res.toString());
                  }

                  break;
                }
                default:{
                    System.out.println("Invalid input");
                }

            }
        }

    }
}
