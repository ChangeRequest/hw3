package school.lemon.changerequest.java.vehicles;

public abstract class Boat extends Vehicle implements IBoat {

    private boolean motorized;

    //пишет, что нужно package-private
    Boat(int manufacturedYear, String make, String model, boolean motorized) {
        super(manufacturedYear, make, model);
        this.motorized = motorized;
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
        return obj != null && (this == obj || obj instanceof Boat && this.motorized == ((Boat) obj).motorized);
    }

}
