package school.lemon.changerequest.java.vehicles;

/**
 * Created by Yaroslav Pavlinskiy on 05.12.2016.
 */
public abstract class Vehicle {
    protected int manufacturedYear;
    protected String make;
    protected String model;

    public Vehicle(int manufacturedYear, String make, String model) {
        this.manufacturedYear = manufacturedYear;
        this.make = make;
        this.model = model;
    }
}
