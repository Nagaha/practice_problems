package Zoho_3rd_round.RestaruntBooking;

import java.util.ArrayList;

public class User {
    String name;
    char gender;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", phoneNumber=" + phoneNumber +
                ", pincode='" + pincode + '\'' +
                ", orderHistory=" + orderHistory +
                '}';
    }

    long phoneNumber;
    String pincode;

    public User(String name, char gender, long phoneNumber, String pincode) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.pincode = pincode;
    }

    ArrayList<Order> orderHistory=new ArrayList<>();
}
