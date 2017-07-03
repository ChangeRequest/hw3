package school.lemon.changerequest.java.vehicles;

/**
 * Created by akliuieva on 29.06.17.
 */
public abstract class Vehicle implements IVehicle {

    private int manufacturedYear;
    private String make;
    private String model;

    public Vehicle(int manufacturedYear, String make, String model) {
        this.manufacturedYear = manufacturedYear;
        this.make = make;
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
}
