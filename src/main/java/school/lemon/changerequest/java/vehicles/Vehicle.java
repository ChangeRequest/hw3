package school.lemon.changerequest.java.vehicles;

/**
 * Created by lera on 06.12.16.
 */
abstract class Vehicle {
    protected int manufacturedYear;
    protected String make;
    protected String model;

    public Vehicle(String make, int manufacturedYear, String model) {
        this.make = make;
        this.manufacturedYear = manufacturedYear;
        this.model = model;
    }
}