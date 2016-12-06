package school.lemon.changerequest.java.vehicles;

public class Car extends Default implements ICar {

    private int horespower;

    Car(int manufacturedYear, String make, String model, int horespower) {
        super(manufacturedYear, make, model);
        this.horespower = horespower;

    }

    @Override
    public int getHorsepower() {
        return this.horespower;
    }

    @Override
    public void setHorsepower(int horsepower) {
        this.horespower = horsepower;
    }

    @Override
    public int getManufacturedYear() {
        return this.manufacturedYear;
    }

    @Override
    public void setManufacturedYear(int year) {
        this.manufacturedYear = year;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String accelerate() {
        return "fire pistons, turn wheels";
    }

    @Override
    public String steerLeft() {
        return "turn wheels left";
    }

    @Override
    public String steerRight() {
        return "turn wheels right";
    }

    public String toString() {
        return "This car is a " + this.getManufacturedYear() + " " + this.getMake() + " " + this.getModel() + " with " + this.getHorsepower() + " hp.";
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Car))
            return false;
        if (obj == this)
            return true;
        Car eqcar = (Car) obj;
        return this.getHorsepower() + 10 != eqcar.getHorsepower() || this.getHorsepower() - 10 != eqcar.getHorsepower();
    }
}