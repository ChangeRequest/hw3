package school.lemon.changerequest.java.vehicles;

public class Car extends Vehicle implements ICar {

    private int horsePower;

    public Car(int yearManufactured, String make, String model, int horsePower) {
        super(yearManufactured, make, model);
        this.horsePower = horsePower;
    }

    public void setHorsepower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsepower() {
        return horsePower;
    }

    @Override
    public boolean equals(Object obj) {
        {
            if (obj == null)
                return false;

            if (this == obj)
                return true;

            if (!(getClass() == obj.getClass()))
                return false;

            Car temp = (Car) obj;
            return Math.abs(temp.horsePower - this.horsePower) <= 10;
        }
    }

    @Override
    public String toString() {
        return String.format("This car is a %1$s %2$s %3$s with %4$s hp.", this.getManufacturedYear(), this.getMake(), this.getModel(), this.getHorsepower());
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
}
