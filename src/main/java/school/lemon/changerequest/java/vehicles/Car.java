package school.lemon.changerequest.java.vehicles;

/**
 * Created by Yaroslav Pavlinskiy on 02.12.2016.
 */
public class Car extends Vehicle implements ICar {

    private int horespower;

    public Car(int manufacturedYear, String make, String model, int horespower) {
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

    @Override
    public String toString() {
        return String.format("This car is a %1$s %2$s %3$s with %4$s hp.", this.getManufacturedYear(), this.getMake(), this.getModel(), this.getHorsepower());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Car))
            return false;
        obj = (Car) obj;
        if (this.getHorsepower() + 10 != ((Car) obj).getHorsepower() || this.getHorsepower() - 10 != ((Car) obj).getHorsepower())
            return true;
        return false;
    }

}
