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
        int slotsOpen = parkingLot.totalOpenSlots("car");
        System.out.println("Slots currently open: " + slotsOpen); //12 because first 3 slots on each floor are truck,bike,bike


        String ticket1 = parkingLot.parkVehicle("car","MH-03","red");
        String ticket2 = parkingLot.parkVehicle("car","MH-04","purple");
        String ticket3 = parkingLot.parkVehicle("car","MH-05","blue");

        parkingLot.displayedOccupiedSlots("car");

        //unparking second vehicle
        parkingLot.unpark(ticket2);

        parkingLot.displayedOccupiedSlots("car");







    }
}