package school.lemon.changerequest.java.vehicles;

public class Airplane extends Default implements IAirplane {

    private int maximumHeightFeet;

    Airplane(int manufacturedYear, String make, String model, int maximumHeightFeet) {
        super(manufacturedYear, make, model);
        this.maximumHeightFeet = maximumHeightFeet;
    }

    @Override
    public int getManufacturedYear() {
        return this.manufacturedYear;
    }

    @Override
    public void setManufacturedYear(int year) {
        this.manufacturedYear = year;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return this.model;
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
    public String toString() {
        return "This airplane is a " + getManufacturedYear() + " " + this.getMake() + " " + this.getModel() + " that can reach " +
                this.getMaximumHeightFeet() + " feet.";

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Airplane))
            return false;
        Airplane eqair = (Airplane) obj;
        return this.getMaximumHeightFeet() + 1000 > eqair.getMaximumHeightFeet() || this.getMaximumHeightFeet() - 1000 < eqair.getMaximumHeightFeet();
    }
}
