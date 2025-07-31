import dev.lpa.ParkingLot;
import dev.lpa.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle vehicle = new Vehicle("Car","0122","Blue");
        System.out.println(vehicle);

        ParkingLot mickey = new ParkingLot("Mickey",3,5);
        System.out.println(mickey.parkVehicle("truck","6ZTF489","silver"));



    }
}