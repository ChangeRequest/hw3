package school.lemon.changerequest.java.vehicles;

/**
 * Created by lera on 08.12.16.
 */
public class IBoatImpl extends Vehicle implements IBoat {

    private boolean motorized;

    public IBoatImpl(String make, int manufacturedYear, String model, boolean motorized) {
        super(make, manufacturedYear, model);
        this.motorized = motorized;
    }


    @Override
    public boolean isMotorized() {
        return motorized == true;
    }

    @Override
    public void setMotorized(boolean motorized) {
        this.motorized = motorized;
    }

//    @Override
//    public int getManufacturedYear() {
//        return manufacturedYear;
//    }
//
//    @Override
//    public void setManufacturedYear(int year) {
//        this.manufacturedYear = year;
//
//    }
//
//    @Override
//    public String getMake() {
//        return make;
//    }
//
//    @Override
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    @Override
//    public String getModel() {
//        return model;
//    }
//
//    @Override
//    public void setModel(String model) {
//        this.model = model;
//    }

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

//    private String printIsMotorized() {
//        if (this.isMotorized()) return " (with motor).";
//        else return ".";
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IBoatImpl)) return false;

        IBoatImpl boat = (IBoatImpl) obj;

        return motorized == boat.motorized;

    }

    @Override
    public String toString() {
        return String.format("This boat is a %1$d %2$s %3$s%4$s", getManufacturedYear(), getMake(), getModel(), isMotorized() ? " (with motor)." : ".");
    }
}
