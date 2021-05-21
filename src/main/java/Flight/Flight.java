package Flight;

import Aircraft.Plane;
import People.CabinCrewMember;
import People.Passenger;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Flight {

    private ArrayList<CabinCrewMember> cabinCrew; // Pilot is included in cabin crew
    private Plane plane;
    private String flightNum;
    private String airportDestination;
    private String airportDeparture;
    private Date timeDeparture;
    private ArrayList<Passenger> passengers; // Default is empty
    private HashMap<Integer, Passenger> planeSeats;

    public Flight(ArrayList<CabinCrewMember> cabinCrew, Plane plane, String flightNum, String airportDestination, String airportDeparture, Date timeDeparture) {
        this.cabinCrew = cabinCrew;
        this.plane = plane;
        this.flightNum = flightNum;
        this.airportDestination = airportDestination;
        this.airportDeparture = airportDeparture;
        this.timeDeparture = timeDeparture;
        this.passengers = new ArrayList<>();
        this.planeSeats = new HashMap<>();

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

    public Date getTimeDeparture() {
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

    public void setSeatsFromPlane(){
        for (int i=0; i <= plane.getPlaneCapacityFromEnum(); i++){
            planeSeats.put(i+1, null);
            System.out.println("In for loop");
        }
    }

    public HashMap getSeats(){
        return planeSeats;
    }

    public void assignPassengerToSeat(Passenger passenger){
        for (int i=0; i<=planeSeats.size(); i++) {
            System.out.println("Loop starting");
            if (planeSeats.containsValue(null)){
                System.out.println("contains null");
                planeSeats.replace(i+1, passenger);
                return;
            }
        }
    }

    public void addPassengerToFlight(Passenger passenger) {
        if (!passengers.contains(passenger)) {
            if (getAvailableSeatsCount() >= 1) {
                passengers.add(passenger);
                passenger.setFlight(flightNum);
                assignPassengerToSeat(passenger);
            }
        }
    }

    public void removePassengerFromFlight(Passenger passenger) {
        if (passengers.contains(passenger)){
            passengers.remove(passenger);
        }
    }

    public ArrayList getPassengers(){
        return passengers;
    }
}
