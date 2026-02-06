package Zoho_3rd_round.RestaruntBooking;

import java.util.ArrayList;

public class Restarunt {
    String name;
    ArrayList<String> serviceAreas=new ArrayList<>();
    String dishName;
    int initialQuantity;
    int price;

    public Restarunt(String name, ArrayList<String> serviceAreas, String dishName, int initialQuantity, int price) {
        this.name = name;
        this.serviceAreas = serviceAreas;
        this.dishName = dishName;
        this.initialQuantity = initialQuantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restarunt{" +
                "name='" + name + '\'' +
                ", serviceAreas=" + serviceAreas +
                ", dishName='" + dishName + '\'' +
                ", initialQuantity=" + initialQuantity +
                ", price=" + price +
                ", ratings=" + ratings +
                ", comments=" + comments +
                '}';
    }

    double ratings;
    ArrayList<String> comments=new ArrayList<>();
}
