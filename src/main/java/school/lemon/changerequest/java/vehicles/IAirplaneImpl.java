package school.lemon.changerequest.java.vehicles;

/**
 * Created by lera on 07.12.16.
 */
public class IAirplaneImpl extends Vehicle implements IAirplane {

    private int maximumHeightFeet;

    public IAirplaneImpl(String make, int manufacturedYear, String model, int maximumHeightFeet) {
        super(make, manufacturedYear, model);
        this.maximumHeightFeet = maximumHeightFeet;
    }

    @Override
    public int getManufacturedYear() {
        return manufacturedYear;
    }

    @Override
    public void setManufacturedYear(int year) {
        this.manufacturedYear = year;

    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
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
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof IAirplaneImpl)) return false;

        IAirplaneImpl iAirplane = (IAirplaneImpl) obj;

        return Math.abs(maximumHeightFeet - iAirplane.maximumHeightFeet) <= 1000;

    }

    @Override
    public String toString() {
        return String.format("This airplane is a %1$d %2$s %3$s that can reach %4$d feet.", manufacturedYear, make, model, maximumHeightFeet);
    }
}
