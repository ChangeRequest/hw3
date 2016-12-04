package school.lemon.changerequest.java.vehicles;

/**
 * Created by Yaroslav Pavlinskiy on 02.12.2016.
 */
public class Boat implements IBoat {
    private int manufacturedYears;
    private String make;
    private String model;
    private boolean motorized;

    public Boat(int manufacturedYears, String make, String model, boolean motorized) {
        this.manufacturedYears = manufacturedYears;
        this.make = make;
        this.model = model;
        this.motorized = motorized;
    }

    @Override
    public int getManufacturedYear() {
        return this.manufacturedYears;
    }

    @Override
    public void setManufacturedYear(int year) {
        this.manufacturedYears = year;
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
    public boolean isMotorized() {
        return this.motorized;
    }

    @Override
    public void setMotorized(boolean motorized) {
        this.motorized = motorized;
    }

    @Override
    public String accelerate() {
        return "jet water";
    }

    @Override
    public String steerLeft() {
        return "turn tiller left";
    }

    @Override
    public String steerRight() {
        return "turn tiller right";
    }

    @Override
    public String toString() {
        if (this.motorized)
            return "This boat is a " + this.getManufacturedYear() + " " + this.getMake() + " " + this.getModel() + " (with motor).";
        return "This boat is a " + this.getManufacturedYear() + " " + this.getMake() + " " + this.getModel() + ".";
    }

    @Override
    public boolean equals(Object obj) {
        obj = (Boat) obj;
        if (this.toString() == obj.toString())
            return true;
        return false;
    }

    public int compareTo(Object obj) {
        obj = (Boat) obj;
        int result = obj.toString().compareTo(this.toString());
        return result;

    }

}
