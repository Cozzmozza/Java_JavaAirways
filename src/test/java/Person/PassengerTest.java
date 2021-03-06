package Person;

import Aircraft.Plane;
import Aircraft.PlaneType;
import Flight.Flight;
import People.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Flight flight;
    private CabinCrewMember member1;
    private Pilot pilot1;
    private ArrayList<CabinCrewMember> crew;
    private Date date;
    private Plane plane;
    private Passenger passenger1;
    private String flightNum;


    @Before
    public void before(){
        passenger1 = new Passenger("Lauren", 2);
        pilot1 = new Pilot("Patricia", Rank.CAPTAIN, "E29B57");
        member1 = new CabinCrewMember("Stephen", Rank.FLIGHT_ATTENDANT);
        crew = new ArrayList<>();
        crew.add(member1);
        crew.add(pilot1);
        plane = new Plane(PlaneType.BIGPLANE99);
        date = new Date(2021, 5, 21, 16, 42);
        flightNum = "FR756";
        flight = new Flight(crew, plane, flightNum, "LDN", "ABD", date );
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Lauren", passenger1.getName());
    }

    @Test
    public void canGetPassengerNumberOfBags(){
        assertEquals(2, passenger1.getNumBags());
    }

    @Test
    public void canAssignFlightToPassenger(){
        passenger1.setFlight(flightNum);
        assertEquals("FR756", passenger1.getFlight());
    }

    @Test
    public void canGetSeatNumber(){
        assertEquals(0, passenger1.getSeatNumber());
    }

    @Test
    public void canSetSeatNumber(){
        passenger1.setSeatNumber(5);
        assertEquals(5, passenger1.getSeatNumber());
    }
}
