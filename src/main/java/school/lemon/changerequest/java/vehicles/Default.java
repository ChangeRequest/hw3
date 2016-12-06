package school.lemon.changerequest.java.vehicles;

abstract class Default {

    String make;
    String model;
    int manufacturedYear;

    Default(int manufacturedYear, String make, String model) {
        this.manufacturedYear = manufacturedYear;
        this.make = make;
        this.model = model;
    }
}

