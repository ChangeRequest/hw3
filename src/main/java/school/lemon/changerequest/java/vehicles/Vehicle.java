package school.lemon.changerequest.java.vehicles;

abstract class Vehicle {

    String make;
    String model;
    int manufacturedYear;

    Vehicle(int manufacturedYear, String make, String model) {
        this.manufacturedYear = manufacturedYear;
        this.make = make;
        this.model = model;
    }
}

