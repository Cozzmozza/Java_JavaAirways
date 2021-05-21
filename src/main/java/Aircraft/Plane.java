package Aircraft;

public class Plane {

    PlaneType plane;

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
}
