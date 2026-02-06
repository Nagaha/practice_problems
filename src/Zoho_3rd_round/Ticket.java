package Zoho_3rd_round;

import Zoho_3rd_round.ParkingLot.Vehicle;

public class Ticket {
    public String ticketId;
    Vehicle parkedVehicle;
   int slotNo;

    public Ticket(String ticketId, Vehicle parkedVehicle, int slotNo, int floorNo) {
        this.ticketId = ticketId;
        this.parkedVehicle = parkedVehicle;
        this.slotNo = slotNo;
        this.floorNo = floorNo;
    }

    int floorNo;
}
