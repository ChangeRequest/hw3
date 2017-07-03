package school.lemon.changerequest.java.vehicles;

/**
 * Created by akliuieva on 29.06.17.
 */
public class Airplane extends Vehicle implements IAirplane{
    private int maximumHeightFeet;

    public Airplane(int manufacturedYear, String make, String model, int maximumHeightFeet) {
        super(manufacturedYear, make, model);
        this.maximumHeightFeet = maximumHeightFeet;
    }

    @Override
    public int getMaximumHeightFeet() {
        return maximumHeightFeet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airplane airplane = (Airplane) o;

        return Math.abs(maximumHeightFeet - airplane.maximumHeightFeet) <= 1000;
    }

    @Override
    public String toString() {
        return "This airplane is a " + getManufacturedYear() + " " + getMake() + " " + getModel() + " that can reach "+getMaximumHeightFeet()+" feet.";
    }

    @Override
    public int hashCode() {
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
}
