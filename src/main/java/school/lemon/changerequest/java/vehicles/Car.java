package school.lemon.changerequest.java.vehicles;

/**
 * Created by akliuieva on 29.06.17.
 */
public class Car extends Vehicle implements ICar{
    private int horsepower;

    public Car(int manufacturedYear, String make, String model, int horsepower) {
        super(manufacturedYear, make, model);
        this.horsepower = horsepower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return Math.abs(horsepower - car.horsepower) <= 10;
    }

    @Override
    public String toString() {
        return "This car is a " + getManufacturedYear() + " " + getMake() + " " + getModel() + " with " + getHorsepower() + " hp.";
    }

    @Override
    public int hashCode() {
        return horsepower;
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
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
