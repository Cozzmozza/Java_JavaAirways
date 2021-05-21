package People;

public class Pilot extends CabinCrewMember{

    private String licenseNum;

    public Pilot(String name, Rank rank, String licenseNum) {
        super(name, rank);
        this.licenseNum = licenseNum;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public String flyPlane(){
        return "I am flying this plane";
    }
}
