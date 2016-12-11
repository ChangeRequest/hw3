package school.lemon.changerequest.java.vehicles;


public class Airplane extends Vehicle implements IAirplane {
    private int maximumHeightFeet;

    public Airplane(int maximumHeightFeet, int manufacturedYear, String model, String make) {
        super(manufacturedYear, make, model);
        this.maximumHeightFeet = maximumHeightFeet;
    }

    @Override
    public int getMaximumHeightFeet() {
        return maximumHeightFeet;
    }

    @Override
    public void setMaximumHeightFeet(int maximumHeightFeet) {
        this.maximumHeightFeet = maximumHeightFeet;
    }

    @Override
    public String accelerate() {
        return "fire engines on wings";
    }

    @Override
    public String steerLeft() {
        return "lift wing flaps to turn left";
    }

    @Override
    public String steerRight() {
        return "lift wing flaps to turn right";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this == obj) return true;

        if (!(obj instanceof Airplane)) {
            return false;
        }
        Airplane equalAir = (Airplane) obj;
        return Math.abs(equalAir.maximumHeightFeet - maximumHeightFeet) <=1000 ;
    }

    @Override
    public String toString() {

        return String.format("This airplane is a  %1$s %2$s %3$s that can reach %4$s feet.", this.getManufacturedYear(), this.getMake(), this.getModel(), this.getMaximumHeightFeet());
    }

}
