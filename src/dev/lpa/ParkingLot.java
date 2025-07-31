package dev.lpa;
import java.util.List;

public class ParkingLot {

    //data fields
    private String parkingLotId;
    //List of all slots in parking lot (list of lists, to represent multiple floors)
    private List<List<Slot>> slots;

    public ParkingLot(String parkingLotId, int floors, int slotsPerFloor){
        this.parkingLotId = parkingLotId;


    }


}
