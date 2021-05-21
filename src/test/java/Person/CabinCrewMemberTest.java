package Person;

import People.CabinCrewMember;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember member1;

    @Before
    public void before(){
        member1 = new CabinCrewMember("Stephen", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetCrewMemberName(){
        assertEquals("Stephen", member1.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, member1.getRank());
    }

    @Test
    public void canRelayMessage(){
        String message = "Guten morning y'all";
        assertEquals(message, member1.relayMessage(message));
    }
}
