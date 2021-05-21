package Flight;

import Aircraft.Plane;
import Aircraft.PlaneType;
import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private CabinCrewMember member1;
    private Pilot pilot1;
    private ArrayList<CabinCrewMember> crew;
    private Date date;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;

    private Flight flight;



    @Before
    public void before(){
//        Below info taken from FlightTest
        pilot1 = new Pilot("Patricia", Rank.CAPTAIN, "E29B57");
        member1 = new CabinCrewMember("Stephen", Rank.FLIGHT_ATTENDANT);
        crew = new ArrayList<>();
        crew.add(member1);
        crew.add(pilot1);
        passenger1 = new Passenger("Bob", 2);
        passenger2 = new Passenger("Lauren", 2);
        passenger3 = new Passenger("Maxi", 3);
        passenger4 = new Passenger("Yogi", 1);
        plane = new Plane(PlaneType.BIGPLANE99);
        date = new Date(2021, 5, 21, 16, 42);
        flight = new Flight(crew, plane, "FR756", "LDN", "ABD", date );

        flightManager = new FlightManager(flight);
    }

    @Test
    public void canGetFlight(){
        assertEquals(flight, flightManager.getFlight());
    }
    @Test
    public void canCalculateCustomerBaggageWeightAllowance(){
        assertEquals(6250, flightManager.passengerBaggageWeightAllocation(), 1);
    }
    @Test
    public void canCalculateTotalNumberOfBags(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        flight.addPassengerToFlight(passenger4);
        assertEquals(8, flightManager.getTotalNumberOfBags());
    }
    @Test
    public void canCalculateTotalBaggageWeightBooked(){
        flight.addPassengerToFlight(passenger1);
        assertEquals(4000, flightManager.calculateTotalBaggageWeight(),1);
    }
    @Test
    public void canCalculateRemainingWeightCapacity(){
        flight.addPassengerToFlight(passenger1);
        assertEquals(21000, flightManager.calculateRemainingBaggageCapacity(), 1);
    }

}
