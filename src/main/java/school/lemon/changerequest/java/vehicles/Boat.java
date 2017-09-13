package school.lemon.changerequest.java.vehicles;

public class Boat extends Vehicle implements IBoat {
    private boolean motorized;

    public Boat(int yearManufactured, String make, String model, Boolean motorized) {
        super(yearManufactured, make, model);
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
    public boolean equals(Object obj) {
        {
            if (obj == null)
                return false;

            if (this == obj)
                return true;

            if (!(getClass() == obj.getClass()))
                return false;

            Boat temp = (Boat) obj;
            return temp.motorized == this.motorized;
        }
    }

    @Override
    public String toString() {
        String motor = "";
        if (this.motorized)
            motor = " (with motor)";
        return String.format("This boat is a %1$s %2$s %3$s%4$s.", this.getManufacturedYear(), this.getMake(), this.getModel(), motor);
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
    public String steerRight() {return "turn tiller right";}
}
