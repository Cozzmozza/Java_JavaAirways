package Person;

import People.Passenger;
import People.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Lauren", 2);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Lauren", passenger1.getName());
    }

    @Test
    public void canGetPassengerNumberOfBags(){
        assertEquals(2, passenger1.getNumBags());
    }
}
