package school.lemon.changerequest.java.vehicles;

/**
 * Created by Yaroslav Pavlinskiy on 02.12.2016.
 */
public class Boat extends Vehicle implements IBoat {

    private boolean motorized;

    public Boat(int manufacturedYear, String make, String model, boolean motorized) {
        super(manufacturedYear, make, model);
        this.motorized = motorized;
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
            return String.format("This boat is a %1$s %2$s %3$s (with motor).", this.getManufacturedYear(), this.getMake(), this.getModel());
        return String.format("This boat is a %1$s %2$s %3$s.", this.getManufacturedYear(), this.getMake(), this.getModel());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Boat))
            return false;
        obj = (Boat) obj;
        if (this.motorized != ((Boat) obj).motorized)
            return false;
        else
            return true;
    }

    public int compareTo(Object obj) {
        obj = (Boat) obj;
        int result = obj.toString().compareTo(this.toString());
        return result;

    }

}
