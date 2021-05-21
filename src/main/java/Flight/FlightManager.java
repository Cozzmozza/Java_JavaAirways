package Flight;

import Aircraft.Plane;
import People.Passenger;

import java.util.ArrayList;

public class FlightManager {

    private Flight flight;
    private Plane plane;
    private double bagWeight;
    private ArrayList<Passenger> passengers;
    double maxBaggageWeight;


    public FlightManager(Flight flight) {
        this.flight = flight;
        this.plane = flight.getPlane();
        this.bagWeight = 2000;
        this.passengers = flight.getPassengers();
        this.maxBaggageWeight = plane.calculateTotalBaggageAllowanceInKg();
    }

    public Flight getFlight() {
        return flight;
    }

    public double passengerBaggageWeightAllocation(){
        int capacity = plane.getPlaneCapacityFromEnum();
        double allowancePerPassenger = maxBaggageWeight / capacity;
        return allowancePerPassenger;
    }

    public int getTotalNumberOfBags(){
        int totalNumBags = 0;
        for(Passenger passenger : passengers){
            totalNumBags += passenger.getNumBags();
        }
        return totalNumBags;
    }

    public double calculateTotalBaggageWeight() {
        return this.bagWeight * getTotalNumberOfBags();
    }

    public double calculateRemainingBaggageCapacity() {
        return maxBaggageWeight - calculateTotalBaggageWeight();
    }
}
