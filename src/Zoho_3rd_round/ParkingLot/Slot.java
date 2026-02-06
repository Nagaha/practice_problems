package Zoho_3rd_round.ParkingLot;

public class Slot {
    int slotNumber;
    String type;
    boolean isOccupied=false;
    Vehicle parkedvehicle;

    public Slot() {
    }

    public Slot(int slotNumber, Vehicle vehicle) {
        this.slotNumber=slotNumber;
        this.parkedvehicle=vehicle;
        isOccupied=true;
    }
}
