package Aircraft;

import Aircraft.Plane;
import Aircraft.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(3, plane.getPlaneCapacityFromEnum());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(35.05, plane.getPlaneWeightFromEnum(), 0.01);
    }
}
