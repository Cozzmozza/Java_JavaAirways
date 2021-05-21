package People;

import Flight.Flight;

public class Passenger extends Person{

    private int numBags;
    private Flight flight;

    public Passenger(String name, int numBags) {
        super(name);
        this.numBags = numBags;
    }

    public int getNumBags() {
        return numBags;
    }

    public Flight getFlight(){
        return flight;
    }

    public void setFlight(Flight newFlight){
        flight = newFlight;
    }
}
