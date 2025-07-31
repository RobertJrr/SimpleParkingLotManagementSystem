package dev.lpa;

public class Vehicle {

    //data fields
    private String type;
    private String registration;
    private String color;

    public Vehicle(String type, String registration, String color){
        this.type = type;
        this.registration = registration;
        this.color = color;
    }

    @Override
    public String toString(){
        return String.format("Type: %-20sRegistration: %-20sColor: %-20s",type,registration,color);
    }

}
