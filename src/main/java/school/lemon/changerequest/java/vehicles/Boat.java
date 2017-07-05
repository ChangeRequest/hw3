package school.lemon.changerequest.java.vehicles;

/**
 * Created by akliuieva on 29.06.17.
 */
public class Boat extends Vehicle implements IBoat{
    private int DEFAULT_VALUE_FOR_HASHCODE = 11; //is used to satisfy equals+hashCode contract
    private boolean motorized;

    public Boat(int manufacturedYear, String make, String model, boolean motorized) {
        super(manufacturedYear, make, model);
        this.motorized = motorized;
    }

    @Override
    public String accelerate() {
        return "jet water";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boat)) return false;

        Boat boat = (Boat) o;

        return motorized == boat.motorized;
    }

    @Override
    public String toString() {
        if(isMotorized()){
            return "This boat is a "+getManufacturedYear()+" "+getMake()+" "+getModel()+" (with motor).";
        }
        else{
            return "This boat is a "+getManufacturedYear()+" "+getMake()+" "+getModel()+".";
        }
    }

    @Override
    public int hashCode() { return DEFAULT_VALUE_FOR_HASHCODE; }

    @Override
    public String steerLeft() {
        return "turn tiller left";
    }

    @Override
    public String steerRight() {
        return "turn tiller right";
    }

    @Override
    public boolean isMotorized() {
        return motorized;
    }

    @Override
    public void setMotorized(boolean motorized) {
        this.motorized = motorized;
    }
}
