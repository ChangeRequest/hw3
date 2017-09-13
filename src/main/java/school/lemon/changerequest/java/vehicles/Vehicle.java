package school.lemon.changerequest.java.vehicles;

public abstract class Vehicle implements IVehicle {
    private int yearManufactured;
    private String make;
    private String model;

    public Vehicle(int yearManufactured, String make, String model) {
        this.yearManufactured = yearManufactured;
        this.make = make;
        this.model = model;
    }

    public int getManufacturedYear() {
        return this.yearManufactured;
    }

    public void setManufacturedYear(int year) {
        this.yearManufactured = year;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
