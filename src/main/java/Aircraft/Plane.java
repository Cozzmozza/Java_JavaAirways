package Aircraft;

import java.util.ArrayList;

public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane) {
        this.plane = plane;
    }

    public PlaneType getPlaneType() {
        return plane;
    }

    public int getPlaneCapacityFromEnum() {
        return plane.getPassengerCapacity();
    }

    public double getPlaneWeightFromEnum() {
        return plane.getWeight();
    }

    public double calculateTotalBaggageAllowanceInKg() {
//        baggage allowance is equal to 50% of the aircraft weight
//        Converting to kg from tonne, for relative ease during later calculations
        return plane.getWeight() * 0.5 * 1000;
    }

}
