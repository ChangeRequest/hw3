package school.lemon.changerequest.java.vehicles;


public abstract class Vehicle implements IVehicle{
    private int manufacturedYear;
    private String make;
    private String model;

    public Vehicle(int manufacturedYear, String make, String model) {
        this.manufacturedYear = manufacturedYear;
        this.make = make;
        this.model = model;

    }


    public int getManufacturedYear() {

        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {

        this.manufacturedYear = manufacturedYear;
    }

    public String getMake() {

        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
