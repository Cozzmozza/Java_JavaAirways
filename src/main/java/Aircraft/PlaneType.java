package Aircraft;

public enum PlaneType {

//    A plane type has a capacity (int) and a weight (double)
//    We need to be able to get these

    BOEING747(3, 35.05),
    BIGPLANE99(4, 50.00);

    private final int passengerCapacity;
    private final double weight;

    PlaneType(int passengerCapacity, double weight) {
        this.passengerCapacity = passengerCapacity;
        this.weight = weight;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getWeight() {
        return weight;
    }
}
