package dev.lpa;

//Parking space
public class Slot {

    //data fields
    private String type;
    private Vehicle vehicle;
    private String ticketId;

    public Slot(String type){
        this.type = type;
        this.vehicle = null;
        this.ticketId = null;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void setTicketId(String ticketId){
        this.ticketId = ticketId;
    }

    public String getType(){
        return type;
    }


    public String getTicketId(){
        return ticketId;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
}
