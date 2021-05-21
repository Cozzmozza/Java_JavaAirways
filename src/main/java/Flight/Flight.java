package Flight;

import Aircraft.Plane;
import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;

public class Flight {


    private ArrayList<CabinCrewMember> cabinCrew; // Pilot is included in cabin crew
    private Plane plane;
    private String flightNum;
    private String airportDestination;
    private String airportDeparture;
    private String timeDeparture;
    private ArrayList<Passenger> passengers; // Default is empty

    public Flight(ArrayList<CabinCrewMember> cabinCrew, Plane plane, String flightNum, String airportDestination, String airportDeparture, String timeDeparture) {
        this.cabinCrew = cabinCrew;
        this.plane = plane;
        this.flightNum = flightNum;
        this.airportDestination = airportDestination;
        this.airportDeparture = airportDeparture;
        this.timeDeparture = timeDeparture;
        this.passengers = new ArrayList<>();
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
            if (getAvailableSeatsCount() >= 1) {
                passengers.add(passenger);
            }
        }
    }

    public void removePassengerFromFlight(Passenger passenger) {
        if (passengers.contains(passenger)){
            passengers.remove(passenger);
        }
    }
}
