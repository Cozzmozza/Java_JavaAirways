package People;

public class Passenger extends Person{

    private int numBags;

    public Passenger(String name, int numBags) {
        super(name);
        this.numBags = numBags;
    }

    public int getNumBags() {
        return numBags;
    }
}
