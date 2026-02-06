package Zoho_3rd_round.ParkingLot;

import Zoho_3rd_round.Ticket;

public class Vehicle {
    String type;


    String regNo;
    String color;
    Ticket ticket;

    public Vehicle() {

    }

    public Vehicle(String type, String regNo, String color) {
        this.type = type;
        this.regNo = regNo;
        this.color = color;
    }

}
