package PrivateJets;
// trying polymorphism
public class Flights {
    private int numOfSeats;
    private String modelName;
    public boolean working;
    private int fuel;

    // constructor:
    public Flights (int numOfSeats, String modelName, boolean working, int fuel) {
        setNumOfSeats(numOfSeats);
        setName(modelName);
        setWorking(working);
        setFuelAmount(fuel);
        setWorking(working);
    }
//m#1
    public void isWorking() {
        if (working) {
            System.out.println("Plane is ready for journey ");
        } else {
            System.out.println("Plane needs additional maintenance!");
        }
    }
//m#2
    public void fueling() {
        if (fuel > 100) {
            System.out.println("Overfilled.. Overfilled.. Overfilled");
        } else if (fuel < 10) {
            System.out.println("Insufficient Fuel! .... Insufficient Fuel! .... Refill Now!");
        } else if (fuel > 85 && fuel < 100) {
            System.out.println("Tank Full! .... Tank Full! .... Tank Full!");
        }
    }
//m#3
    public void describe() {
        System.out.println(getName() + " ~ Seats: " + getSeats());
    }
    public void setNumOfSeats(int seats) { this.numOfSeats = seats;}
    public void setName(String name) {this.modelName = name;}
    public void setWorking(boolean works) { this.working = works;}
    public void setFuelAmount(int fuelAmount) {this.fuel = fuelAmount;}
    public int getSeats() {return numOfSeats;}
    public String getName() {return modelName;}



}

