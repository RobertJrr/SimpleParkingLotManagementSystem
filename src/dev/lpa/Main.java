package dev.lpa;

import dev.lpa.ParkingLot;
import dev.lpa.Vehicle;
import dev.lpa.Slot;

public class Main {
    public static void main(String[] args) {

        //Testing program
        int nFloors = 4;
        int nSlotsPerFloor  = 6;
//        24 total slots
        ParkingLot parkingLot = new ParkingLot("Mickey",nFloors,nSlotsPerFloor);

        String ticket1 = parkingLot.parkVehicle("car","MH-03","red");
        String ticket2 = parkingLot.parkVehicle("car","MH-04","purple");
        parkingLot.displayedOccupiedSlots("car");

        //unparking second vehicle
        parkingLot.unpark(ticket2);
        parkingLot.displayedOccupiedSlots("car");

        //parking truck
        parkingLot.displayOpenSlots("truck");
        parkingLot.parkVehicle("truck","MH-01","black");
        parkingLot.displayedOccupiedSlots("truck");
        //Parking three more trucks and checking if space is available
        for(int i = 5; i <= 7; i++){
            parkingLot.parkVehicle("truck", "MH-0" + i, "silver");
        }
        parkingLot.displayedOccupiedSlots("truck");
        parkingLot.displayOpenSlots("truck");







    }
}