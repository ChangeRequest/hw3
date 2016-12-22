package school.lemon.changerequest.java.vehicles;

public abstract class Airplane extends Vehicle implements IAirplane {

    private int maximumHeightFeet;

    Airplane(int manufacturedYear, String make, String model, int maximumHeightFeet) {
        super(manufacturedYear, make, model);
        this.maximumHeightFeet = maximumHeightFeet;
    }

    @Override
    public int getMaximumHeightFeet() {
        return this.maximumHeightFeet;
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
    public String toString() {
        return String.format("This airplane is a %1$d %2$s %3$s that can reach %4$d feet.", this.getManufacturedYear(), this.getMake(), this.getModel(), this.getMaximumHeightFeet());
    }

    @Override
    public boolean equals(Object obj) {
    if (obj == null || !(obj instanceof Airplane)) return false;

    Airplane iAirplane = (Airplane) obj;

        return Math.abs(maximumHeightFeet - iAirplane.maximumHeightFeet) <= 1000;
}}
