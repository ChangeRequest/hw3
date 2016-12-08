package school.lemon.changerequest.java.vehicles;

/**
 * Created by lera on 08.12.16.
 */
public class ICarImpl extends Vehicle implements ICar {

    private int horsepower;

    public ICarImpl(String make, int manufacturedYear, String model, int horsepower) {
        super(make, manufacturedYear, model);
        this.horsepower = horsepower;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public int getManufacturedYear() {
        return manufacturedYear;
    }

    @Override
    public void setManufacturedYear(int year) {
        this.manufacturedYear = year;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return model;
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
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ICarImpl)) return false;

        ICarImpl iCar = (ICarImpl) obj;

        return Math.abs(horsepower - iCar.horsepower) <= 10;
    }

    @Override
    public String toString() {
        return String.format("This car is a %1$d %2$s %3$s with %4$d hp.", manufacturedYear, make, model, horsepower);
    }
}
