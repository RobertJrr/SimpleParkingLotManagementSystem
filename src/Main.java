import dev.lpa.ParkingLot;
import dev.lpa.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Car","0122","Blue");
        Vehicle vehicle2 = new Vehicle("Car","0142","Silver");
        Vehicle vehicle3 = new Vehicle("Car","0112","Red");
        System.out.println(vehicle);
        System.out.println(vehicle2);
        System.out.println(vehicle3);

        //Creating a new ParkingLot
        ParkingLot mickey = new ParkingLot("Mickey",3,5);

        System.out.println(mickey.parkVehicle("truck","6ZTF489","silver"));

    }
}