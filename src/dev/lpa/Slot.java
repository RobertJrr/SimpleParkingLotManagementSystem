package dev.lpa;

public class Slot {

    //data fields
    private String type;
    private Vehicle vehicle;
    private String ticketId;

    public Slot(String type, Vehicle vehicle, String ticketId){
        this.type = type;
        this.vehicle = vehicle;
        this.ticketId = ticketId;
    }
}
