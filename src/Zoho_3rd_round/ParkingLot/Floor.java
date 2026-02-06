package Zoho_3rd_round.ParkingLot;

import java.util.ArrayList;

public class Floor {
    int floorNumber;
    int noOfSlots;

    public Floor() {
    }

    public Floor(int floorNumber, int noOfSlots) {
        this.floorNumber = floorNumber;
        this.noOfSlots = noOfSlots;
    }


    ArrayList<Slot> slots=new ArrayList<Slot>();
    ArrayList<Slot> carSlots=new ArrayList<Slot>();
    ArrayList<Slot> truckSlots=new ArrayList<Slot>();
    ArrayList<Slot> bikeSlots=new ArrayList<Slot>();
}
