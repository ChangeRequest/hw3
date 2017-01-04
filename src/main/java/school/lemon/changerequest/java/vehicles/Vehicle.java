package school.lemon.changerequest.java.vehicles;

abstract class Vehicle {

    private String make;
    private String model;
    private int manufacturedYear;

    Vehicle(int manufacturedYear, String make, String model) {
        this.manufacturedYear = manufacturedYear;
        this.make = make;
        this.model = model;
    }

    public int getManufacturedYear() {
        return this.manufacturedYear;
    }

    public void setManufacturedYear(int year) {
        this.manufacturedYear = year;
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

