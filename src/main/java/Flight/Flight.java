package Flight;

import Aircraft.Plane;
import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;

public class Flight {

//    private Pilot pilot;
        // Do I want to take in a pilot here, or with the array list of cabin crew when we instance in the test?
        // Since I've made Pilot inherit from CabinCrew, it makes sense to have the cabinCrew list contain the pilot
        // Also allows us to add a second pilot easily
    private ArrayList<CabinCrewMember> cabinCrew;
    private Plane plane;
    private String flightNum;
    private String airportDestination;
    private String airportDeparture;
    private String timeDeparture;
    private ArrayList<Passenger> passengers; // Default is empty
//    private ArrayList<Passenger> seats;

    public Flight(ArrayList<CabinCrewMember> cabinCrew, Plane plane, String flightNum, String airportDestination, String airportDeparture, String timeDeparture) {
        this.cabinCrew = cabinCrew;
        this.plane = plane;
        this.flightNum = flightNum;
        this.airportDestination = airportDestination;
        this.airportDeparture = airportDeparture;
        this.timeDeparture = timeDeparture;
        this.passengers = new ArrayList<>();
//        this.seats = new ArrayList<>();
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public int getCrewCount() {
        return cabinCrew.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getAirportDestination() {
        return airportDestination;
    }

    public String getAirportDeparture() {
        return airportDeparture;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getPassengerCount(){
        return passengers.size();
    }

    public int getAvailableSeatsCount() {
        int totalCapacity = plane.getPlaneCapacityFromEnum();
        int numPassengers = getPassengerCount();
        return totalCapacity - numPassengers;
    }

    public void addPassengerToFlight(Passenger passenger) {
        if (!passengers.contains(passenger)) {
            passengers.add(passenger);
        }
    }

    public void removePassengerFromFlight(Passenger passenger) {
        if (passengers.contains(passenger)){
            passengers.remove(passenger);
        }
    }
}
