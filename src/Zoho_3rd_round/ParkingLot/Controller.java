package Zoho_3rd_round.ParkingLot;

import Zoho_3rd_round.Ticket;

public class Controller {
   static ParkingLot parkingLot;

    public void createParkingLot(String name, int floors, int slots) {
        parkingLot=new ParkingLot(name,floors,slots);

        for(int i=1;i<=floors;i++){//adding floors
            Floor floor=new Floor(i,slots);
            parkingLot.floorList.add(floor);
        }
    }

    public String parkVehicle(String regNo, String type, String color) {
        Vehicle vehicle=new Vehicle(regNo,type,color);
        Ticket ticket = null;
        String ticketId=null;
        for(Floor floor: parkingLot.floorList){
            if(type.equals("Car") && floor.carSlots.size()<3){
              Slot slot=new Slot(4+floor.carSlots.size(),vehicle);
              floor.carSlots.add(slot);
              ticketId=parkingLot.name+"_"+floor.floorNumber+"_"+slot.slotNumber;
              ticket=new Ticket(ticketId,vehicle, slot.slotNumber, floor.floorNumber);
              break;
            }
            else if(type.equals("Truck") && floor.truckSlots.size()<1){
                Slot slot=new Slot(1+floor.truckSlots.size(),vehicle);
                floor.truckSlots.add(slot);
                ticketId=parkingLot.name+"_"+floor.floorNumber+"_"+slot.slotNumber;
                ticket=new Ticket(ticketId,vehicle, slot.slotNumber, floor.floorNumber);
                break;
            }
            else if(type.equals("Bike") && floor.bikeSlots.size()<2){
                Slot slot=new Slot(2+floor.bikeSlots.size(),vehicle);
                floor.bikeSlots.add(slot);
                ticketId=parkingLot.name+"_"+floor.floorNumber+"_"+slot.slotNumber;
                ticket=new Ticket(ticketId,vehicle, slot.slotNumber, floor.floorNumber);
                break;
            }
        }
        if (ticket==null){
            System.out.println("Parking is full :(");
            return "";
        }
        parkingLot.ticketList.put(ticketId,ticket);
        return ticketId;
    }

    public boolean unparkVehicle(String ticketId) {
        if(!parkingLot.ticketList.containsKey(ticketId)){
            return false;
        }
        else{
            Ticket t=parkingLot.ticketList.get(ticketId);
            int floorNumber=t.ticketId.charAt(7);
            int slot=t.ticketId.charAt(9);
            parkingLot.floorList.get(floorNumber-1).slots.get(slot).isOccupied=false;
            parkingLot.floorList.get(floorNumber-1).slots.remove(slot);//removed from slots

        }
       return true;
    }
}
