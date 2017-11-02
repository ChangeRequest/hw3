package school.lemon.changerequest.java.vehicles;

public abstract class Vehicle implements IVehicle {

    protected int manufacturedYear;
    protected String manufacturer;
    protected String model;

    Vehicle(int manufacturedYear, String make, String model) {
        this.manufacturedYear = manufacturedYear;
        this.manufacturer = make;
        this.model = model;
    }

    /**
     * Get vehicle manufactured year
     *
     * @return manufactured year
     */
    public int getManufacturedYear() {
        return manufacturedYear;
    }

    /**
     * Set vehicle manufactured year
     *
     * @param year manufactured year
     */
    public void setManufacturedYear(int year) {
        manufacturedYear = year;
    }

    /**
     * Get vehicle manufacturer
     *
     * @return manufacturer
     */
    public String getMake() {
        return manufacturer;
    }

    /**
     * Set vehicle manufactured year
     *
     * @param make manufacturer
     */
    public void setMake(String make) {
        manufacturer = make;
    }

    /**
     * Get vehicle model
     *
     * @return vehicle model
     */
    public String getModel() {
        return model;
    }

    /**
     * Set vehicle model
     *
     * @param model of vehicle
     */
    public void setModel(String model) {
        this.model = model;
    }

}
