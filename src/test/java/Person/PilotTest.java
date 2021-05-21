package Person;

import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Patricia", Rank.CAPTAIN, "E29B57");
    }

    @Test
    public void canGetName(){
        assertEquals("Patricia", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetLicenseNum(){
        assertEquals("E29B57", pilot.getLicenseNum());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("I am flying this plane", pilot.flyPlane());
    }
}
