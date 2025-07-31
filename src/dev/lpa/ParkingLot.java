package dev.lpa;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {


    //data fields
    private String parkingLotId;
    //List of all slots in parking lot (list of lists, to represent multiple floors)
    private List<List<Slot>> slots;

    public ParkingLot(String parkingLotId, int floors, int parkingSpaces){
        this.parkingLotId = parkingLotId;
        this.slots = new ArrayList<>();

         //intialize all slots on each floor, first slot goes to truck and bike and bike
        for(int i = 0; i < floors; i++){
            //adding new list ot each floor
            slots.add(new ArrayList<>());
            //returning a list (floor)
            //each list(floor)
            List<Slot> floorSlots = slots.get(i);
            floorSlots.add(new Slot("truck"));
            floorSlots.add(new Slot("bike"));
            floorSlots.add(new Slot("bike"));
            //rest of the slots are cars, starting at index 3
            for(int j = 3; j < parkingSpaces; j++){
                floorSlots.add(new Slot("car"));
            }
        }
    }

    // add vehicle to first empty space and return ticket id number for this car
    public String parkVehicle(String type, String regNo, String color){
        //get a floor with available space
        //getting a floor
        for(int i = 0; i < slots.size(); i++){
            //get a floor
            List<Slot> floor = slots.get(i);
            for(int j = 0; j < floor.size(); j++){
                //find empty space to add (if any)
                Slot space = floor.get(j);
                //if empty, add the space
                if(space.getType().equals(type) && space.getVehicle() == null){
                    Vehicle newVehicle = new Vehicle(type,regNo,color);
                    space.setVehicle(newVehicle);
                    space.setTicketId(generateTicketId(i + 1, j + 1));
                    return space.getTicketId();
                }
            }
        }
        //doesnt add any vehicle, no space available
        System.out.println("NO SPACE AVAILABLE");
        return null;
    }

    private String generateTicketId(int floorNumber, int spaceNumber){
        return  parkingLotId + ": " + floorNumber + "_" + spaceNumber;
    }





}
