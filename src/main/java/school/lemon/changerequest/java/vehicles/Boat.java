package school.lemon.changerequest.java.vehicles;

public class Boat extends Default implements IBoat {

    private boolean motorized;

    Boat(int manufacturedYear, String make, String model, boolean motorized) {
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
            return "This boat is a " + this.getManufacturedYear() + " " + this.getMake() + " " + this.getModel() + " (with motor).";
        return "This boat is a " + this.getManufacturedYear() + " " + this.getMake() + " " + this.getModel() + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Boat))
            return false;
        Boat bobj = (Boat) obj;
        if (!(bobj.motorized))
            return false;
        return false;
    }

    public int compareTo(Object obj) {
        return obj.toString().compareTo(this.toString());

    }

}
