package ZohoL2.src.Naga_Harish_06_02_25.L3;

import java.util.ArrayList;

public class Customer {
     String id;
     int balance;
     boolean isActive;

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Customer(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    ArrayList<GiftCard> giftCardList=new ArrayList<>();
}
