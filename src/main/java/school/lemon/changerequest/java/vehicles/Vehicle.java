package school.lemon.changerequest.java.vehicles;

/**
 * Created by lera on 06.12.16.
 */
public class Vehicle implements IVehicle {
    private int manufacturedYear;
    private String make;
    private String model;

    public Vehicle(String make, int manufacturedYear, String model) {
        this.make = make;
        this.manufacturedYear = manufacturedYear;
        this.model = model;
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
    public String accelerate() {
        return null;
    }

    @Override
    public String steerLeft() {
        return null;
    }

    @Override
    public String steerRight() {
        return null;
    }
}