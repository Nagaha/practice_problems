package Zoho_3rd_round.ParkingLot;

import Zoho_3rd_round.Ticket;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLot {
    String name;
    int noOfFloors;
    int nOfSlots;
    ArrayList<Floor> floorList=new ArrayList<Floor>();
    HashMap<String, Ticket> ticketList=new HashMap<>();

    public ParkingLot() {
    }

    public ParkingLot(String name, int noOfFloors, int nOfSlots) {
        this.name = name;
        this.noOfFloors = noOfFloors;
        this.nOfSlots = nOfSlots;
    }
}
