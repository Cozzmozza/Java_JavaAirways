package People;

public class Passenger extends Person{

    private int numBags;
    private String flightNum;
    private int seatNumber;

    public Passenger(String name, int numBags) {
        super(name);
        this.numBags = numBags;
    }

    public int getNumBags() {
        return numBags;
    }

    public String getFlight(){
        return flightNum;
    }

    public void setFlight(String flightNumber){
        flightNum = flightNumber;
    }

    public void setSeatNumber(int number){
        seatNumber = number;
    }

    public int getSeatNumber(){
        return seatNumber;
    }
}
