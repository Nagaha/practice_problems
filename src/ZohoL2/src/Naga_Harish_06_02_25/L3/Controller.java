package ZohoL2.src.Naga_Harish_06_02_25.L3;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        GiftCardSystem g=new GiftCardSystem();
        g.populateData();

        Scanner sc=new Scanner(System.in);
        boolean cont=true;
       try {
            while (cont) {
                System.out.println("****Welcome to VGifts****");
                System.out.println("1.Create Customer");
                System.out.println("2.Print customer summary");
                System.out.println("3.Create Gift Card");
                System.out.println("4.Print Gift card summary");
                System.out.println("5.Top up gift card");
                System.out.println("6.Close Gift card");
                System.out.println("7.Purchase Item");
                System.out.println("8.Print transaction Summary");
                System.out.println("9.Block the card");
                System.out.println("10.Unblock the card");
                System.out.println("11.Exit");
                System.out.println("Enter your option");
                int option = sc.nextInt();
                switch (option) {
                    case 1: {
                        g.createCustomer();//task1
                        break;
                    }
                    case 2: {
                        g.printCustomerSummary();
                        break;
                    }
                    case 3: {
                        g.createGiftCard();
                        break;
                    }
                    case 4: {
                        g.printGiftCardSummary();
                        break;
                    }
                    case 5: {
                        g.topUpCard();
                        break;
                    }
                    case 6: {
                        g.closeGiftCard();
                        break;
                    }
                    case 7:{
                        g.purchaseItem();
                        break;
                    }
                    case 8:{
                        g.printTransactionSummary();
                        break;
                    }
                    case 9:{
                        g.blockCard();
                        break;
                    }
                    case 10:{
                        g.unBlockCard();
                        break;
                    }
                    case 11: {
                        cont = false;
                        System.out.println("Thank you for visiting");
                        break;
                    }
                    default: {
                        System.out.println("Invalid input");
                    }
                }
            }
        }
       catch (Exception e){
           System.out.println("The input does not matches!");
       }
    }
}
