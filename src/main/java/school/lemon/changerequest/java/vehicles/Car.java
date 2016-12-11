package school.lemon.changerequest.java.vehicles;


public class Car extends Vehicle implements ICar{
    private int horsepower;


    Car(int manufacturedYear, String make, String model, int horsepower) {
        super(manufacturedYear, make, model);
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
        if (obj == null) return false;

        if (this == obj) return true;

        if (!(obj instanceof Car)) {
            return false;
        }
            Car equalCar = (Car) obj;
           return Math.abs(equalCar.horsepower - horsepower) <=10 ;
    }

    @Override
    public String toString() {

        return String.format("This car is a  %1$s %2$s %3$s with %4$s hp.", this.getManufacturedYear(), this.getMake(), this.getModel(), this.getHorsepower());
    }

}
