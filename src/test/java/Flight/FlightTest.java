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

import static org.junit.Assert.assertEquals;

public class FlightTest {

//        this.flightNum = flightNum;
//        this.airportDestination = airportDestination;
//        this.airportDeparture = airportDeparture;
//        this.timeDeparture = timeDeparture;

    private CabinCrewMember member1;
    private Pilot pilot1;
    private Pilot pilot2;
    private ArrayList<CabinCrewMember> crew;


    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;

    private Flight flight;

    @Before
    public void before(){
//        Make two pilots, 1 crew, and add them to our crew array that we feed into the Flight class
        pilot1 = new Pilot("Patricia", Rank.CAPTAIN, "E29B57");
        pilot2 = new Pilot("Cheesey", Rank.FIRST_OFFICER, "G18C17");
        member1 = new CabinCrewMember("Stephen", Rank.FLIGHT_ATTENDANT);
        crew = new ArrayList<>();
        crew.add(member1);
        crew.add(pilot1);
        crew.add(pilot2);
        passenger1 = new Passenger("Bob", 2);
        passenger2 = new Passenger("Lauren", 2);
        passenger3 = new Passenger("Maxi", 3);
        passenger4 = new Passenger("Yogi", 1);

        plane = new Plane(PlaneType.BIGPLANE99);

        flight = new Flight(crew, plane, "FR756", "LDN", "ABD", "08:00" );
    }

//    METHOD tests
    // can get count of passengers currently booked onto the flight, getPassengerCount() - DONE
    // can return available seats count - DONE
    // can add passenger to flight, check available seat count - DONE
    // cannot add the same passenger twice - DONE
    // can add 2 different passengers
    // can remove passenger to flight, check available seat count - DONE
    // can only remove passenger to flight if they exist on flight - DONE

    @Test
    public void canGetPassengerCount(){
        assertEquals(0, flight.getPassengerCount());
    }
    @Test
    public void canGetAvailableSeatsCount(){
        assertEquals(4, flight.getAvailableSeatsCount());
    }
    @Test
    public void canAddPassengerToFlightPassengers(){
        flight.addPassengerToFlight(passenger1);
        assertEquals(3, flight.getAvailableSeatsCount());
    }
    @Test
    public void cannotAddSamePassengerTwice(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger1);
        assertEquals(3, flight.getAvailableSeatsCount());
    }
    @Test
    public void canAddTwoPassengers(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        assertEquals(2, flight.getAvailableSeatsCount());
    }

    @Test
    public void canRemovePassengerFromFlightPassengers(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.removePassengerFromFlight(passenger1);
        assertEquals(3, flight.getAvailableSeatsCount());
    }
    @Test
    public void cannotRemovePassengerThatDoesNotExistOnFlight(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.removePassengerFromFlight(passenger3);
        assertEquals(2, flight.getAvailableSeatsCount());
    }


//    @Test
//    public void bookedPassengerCount(){
//        assertEquals([passenger1], flight.getPassengers());
//    }



//       GETTER tests
    // can get flight num - DONE
    // can get destination - DONE
    // can get departure airport - DONE
    // can get departure time - DONE
    // can get plane - DONE
    // can get crew list - DONE
    // can get crew count - DONE
    // can get count of booked in passengers

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNum());
    }
    @Test
    public void canGetAirportDestination(){
        assertEquals("LDN", flight.getAirportDestination());
    }
    @Test
    public void canGetAirportDeparture(){
        assertEquals("ABD", flight.getAirportDeparture());
    }
    @Test
    public void canGetDepartureTime(){
        assertEquals("08:00", flight.getTimeDeparture());
    }
    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }
    @Test
    public void canGetCrewList(){
        assertEquals(crew, flight.getCabinCrew());
    }
    @Test
    public void getCrewCount(){
        assertEquals(3, flight.getCrewCount());
    }
}
