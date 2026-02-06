package ZohoL2.src.Naga_Harish_06_02_25.L3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class GiftCardSystem {
    Scanner sc=new Scanner(System.in);

    //Lists for storing
    static HashMap<String,GiftCard> giftCardList=new HashMap<>();
    static HashMap<String,Customer> customerList =new HashMap<>();
    static HashMap<Integer,Transaction> transactionList=new HashMap<>();
    static ArrayList<GiftCard> allGiftCards=new ArrayList<>();

    //populating data
    Customer cust1=new Customer("C_1",10000);
    Customer cust2=new Customer("C_2",20000);
    Customer cust3=new Customer("C_3",30000);

    GiftCard card1=new GiftCard("Card_1",1111,cust1.balance-7500,"Active",cust1);




    public void populateData(){
        customerList.put(cust1.id, cust1);
        customerList.put(cust2.id, cust2);
        customerList.put(cust3.id, cust3);

        cust1.balance-=2500;//for prePopulated data

        giftCardList.put(card1.cardId, card1);
        allGiftCards.add(card1);
    }

    public void createCustomer(){
       try {
           System.out.println("________________________________________");
            String custId = "C_" + (customerList.size() + 1);
            System.out.println("Enter the balance amount: ");
            int balance = sc.nextInt();
            Customer newCustomer = new Customer(custId, balance);
            customerList.put(newCustomer.id, newCustomer);
           System.out.println("________________________________________");
        }
       catch(Exception e){
           System.out.println("The input does not matches!");
       }
    }
    public void printCustomerSummary(){
        System.out.println("________________________________________");
        System.out.println("*****Customer list*****");
        for(Customer temp:customerList.values()){
            System.out.println(temp.toString());
        }
        System.out.println("-------------------------");
    }
    public void createGiftCard(){
       try {
           System.out.println("________________________________________");
            String currentCustomerId = "";
            System.out.println("Enter the customer Id: ");
            currentCustomerId = sc.next();
            if (!customerList.containsKey(currentCustomerId)) {
                System.out.println("No customer found");
                return;
            }
            Customer currCustomer = customerList.get(currentCustomerId);
            String cardId = "Card_" + (allGiftCards.size() + 1);
            boolean isStrong=true;
            System.out.println("Enter the PIN for Card: ");
            int pin = sc.nextInt();
            System.out.println("Enter the card value: ");
            int cardAmount = sc.nextInt();
            if (cardAmount <= 0) {
                System.out.println("The card value can't be negative");
                return;
            }
            String status = "Active";

            if (currCustomer.balance < cardAmount) {
                System.out.println("The balance is less so no cards are created");
            } else {
                GiftCard newCard = new GiftCard(cardId, pin, cardAmount, status, currCustomer);
                currCustomer.balance -= cardAmount;//decreasing the balance
                giftCardList.put(cardId, newCard);
                allGiftCards.add(newCard);
                currCustomer.giftCardList.add(newCard);

                System.out.println("The new card added to customer " + currentCustomerId);
                System.out.println("The card is " + newCard.toString());


            }
           System.out.println("________________________________________");
        }
       catch (Exception e){
           System.out.println("The input does not matches!");
       }


    }

    public void printGiftCardSummary() {
        System.out.println("________________________________________");

        for(GiftCard temp:allGiftCards){
            System.out.println(temp.toString());
        }
        System.out.println("______________________");
    }

    public void topUpCard() {
        try{
            System.out.println("________________________________________");

            System.out.println("Enter the card id: ");
            String cardId = sc.next();

            if (!giftCardList.containsKey(cardId)) {
                System.out.println("No cards are found with this card Id");
                return;
            }
            GiftCard currCard = giftCardList.get(cardId);
            Customer currentCustomer = currCard.cardHolder;//storing the curr customer
            System.out.println("The customer is " + currentCustomer.id);
            System.out.println("Enter the amount to be debited: ");
            int amountToBeDebited = sc.nextInt();
            if(amountToBeDebited>currentCustomer.balance || currCard.status=="Blocked" || currCard.status=="Closed"){
                System.out.println("You can't make top up with this card");
                return;
            }
            currentCustomer.balance -= amountToBeDebited;
            currCard.cardBalance += amountToBeDebited;
            System.out.println("The card is updated");
            System.out.println("The card is " + currCard.toString());
            System.out.println("________________________________________");

        }
        catch (Exception e){
            System.out.println("The input does not matches!");
        }
    }

    public void closeGiftCard() {
        try{
            System.out.println("________________________________________");

            System.out.println("Enter the card id: ");
            String cardId = sc.next();
            System.out.println("Enter the pin for the card: ");
            int pin = sc.nextInt();

            if (!giftCardList.containsKey(cardId)) {
                System.out.println("No cards are found with this card Id");
                return;
            }
            GiftCard currCard = giftCardList.get(cardId);
            if (currCard.pin != pin) {
                System.out.println("The pin not matches");
                return;
            } else {
                System.out.println("The pin matches");
            }
            Customer currentCustomer = currCard.cardHolder;//storing the curr customer
            System.out.println("The customer is " + currentCustomer.id);
            currentCustomer.balance += currCard.cardBalance;
            currCard.cardBalance = 0;
            currCard.status = "Closed";
            System.out.println("The Card closed successfully");
            System.out.println("________________________________________");

        }
        catch (Exception e){
            System.out.println("The input does not matches!");
        }

    }

    public void purchaseItem() {
        try{
            System.out.println("________________________________________");

            System.out.println("Enter the card id: ");
            String cardId = sc.next();
            System.out.println("Enter the pin for the card: ");
            int pin = sc.nextInt();

            if (!giftCardList.containsKey(cardId)) {
                System.out.println("No cards are found with this card Id");
                return;
            }
            GiftCard currCard = giftCardList.get(cardId);
            if (currCard.pin != pin) {
                System.out.println("The pin not matches");
                return;
            } else {
                System.out.println("The pin matches");
            }
            Customer currentCustomer = currCard.cardHolder;//storing the curr customer
            System.out.println("The customer is " + currentCustomer.id);

            System.out.println("Enter the amount to purchase");
            int amountToPurchase=sc.nextInt();
            if(amountToPurchase>currCard.cardBalance || currCard.status=="Blocked" || currCard.status=="Closed"){
                System.out.println("You can't make purchase with this card");
                return;
            }
            currCard.cardBalance-=amountToPurchase;
            int rewardPoints=amountToPurchase/500;
            currCard.rewardPoints+=(rewardPoints*50);
            if(currCard.rewardPoints>=200){
                System.out.println("Congrats your card is updated");
                if(currCard.cardType=="Silver"){
                    currCard.cardType="Gold";
                    currCard.rewardPoints=0;
                }
                else if(currCard.cardType=="Gold"){
                    currCard.cardType="Platinum";
                    currCard.rewardPoints=0;
                }
            }
            Transaction newTransaction = new Transaction(transactionList.size()+1,cardId,amountToPurchase);
            transactionList.put(newTransaction.id, newTransaction);
            System.out.println("Transaction Successful");

            System.out.println("________________________________________");

        }
        catch (Exception e){
            System.out.println("The input does not matches!");
        }
    }

    public void printTransactionSummary() {
        System.out.println("________________________________________");

        System.out.println("Transaction Summary");
        if(transactionList.size()==0){
            System.out.println("No Transactions found");
        }
        for(Transaction temp:transactionList.values()){
            System.out.println(temp.toString());
        }
        System.out.println("______________________");
    }

    public void blockCard() {
        System.out.println("________________________________________");

        try{
            System.out.println("Enter the card id: ");
            String cardId = sc.next();
            System.out.println("Enter the pin for the card: ");
            int pin = sc.nextInt();

            if (!giftCardList.containsKey(cardId)) {
                System.out.println("No cards are found with this card Id");
                return;
            }
            GiftCard currCard = giftCardList.get(cardId);
            if (currCard.pin != pin) {
                System.out.println("The pin not matches");
                return;
            } else {
                System.out.println("The pin matches");
            }
            Customer currentCustomer = currCard.cardHolder;//storing the curr customer
            System.out.println("The customer is " + currentCustomer.id);
            System.out.println("The card was "+currCard.status);

            if(currCard.status=="Active"){
                currCard.status="Blocked";
                System.out.println("The card is now "+currCard.status);
            }
            else if(currCard.status=="Blocked"){
                System.out.println("The card is already blocked");
            }
            else{
                currCard.status="Closed";
                System.out.println("The card is now "+currCard.status);
            }

            System.out.println("________________________________________");

        }
        catch (Exception e){
            System.out.println("The input does not matches!");
        }
    }

    public void unBlockCard() {
        System.out.println("________________________________________");
        try{
            System.out.println("Enter the card id: ");
            String cardId = sc.next();
            System.out.println("Enter the pin for the card: ");
            int pin = sc.nextInt();

            if (!giftCardList.containsKey(cardId)) {
                System.out.println("No cards are found with this card Id");
                return;
            }
            GiftCard currCard = giftCardList.get(cardId);
            if (currCard.pin != pin) {
                System.out.println("The pin not matches");
                return;
            } else {
                System.out.println("The pin matches");
            }
            Customer currentCustomer = currCard.cardHolder;//storing the curr customer
            System.out.println("The customer is " + currentCustomer.id);
            System.out.println("The card was "+currCard.status);

            if(!Objects.equals(currCard.status, "Blocked")){
                System.out.println("The card is already unblocked");
            }
            else if(currCard.status.equals("Blocked")){
                currCard.status="Active";
                System.out.println("The card is unblocked");
            }


            System.out.println("____________________________________");
        }
        catch (Exception e){
            System.out.println("The input does not matches!");
        }
    }
}
