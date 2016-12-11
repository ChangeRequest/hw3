package school.lemon.changerequest.java.vehicles;


public class Boat extends Vehicle implements IBoat {
    private boolean motorized;

    Boat(int manufacturedYear, String make, String model, boolean motorized) {
        super(manufacturedYear, make, model);
        this.motorized = motorized;
        }

    @Override
    public boolean isMotorized() {
        return motorized;
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
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this == obj) return true;

        if (!(obj instanceof Boat)) {
            return false;
        }
        Boat equalBoat = (Boat) obj;
        return equalBoat.motorized == motorized ;
    }

    @Override
    public String toString() {

        return String.format("This boat is a  %1$s %2$s %3$s with %4$s", this.getManufacturedYear(), this.getMake(), this.getModel(), isMotorized() ? "(with motor)." : ".");
    }
}
