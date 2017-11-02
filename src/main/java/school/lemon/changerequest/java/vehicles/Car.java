package school.lemon.changerequest.java.vehicles;

public class Car extends Vehicle implements ICar {

    private int horsepower;

    Car(int manufacturedYear, String make, String model, int horsepower) {
        super(manufacturedYear, make, model);
        this.horsepower = horsepower;
    }

    /**
     * Get car horsepower
     *
     * @return horsepower
     */
    public int getHorsepower() {
        return horsepower;
    }

    /**
     * Set car horsepower
     *
     * @param horsepower of the car
     */
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    /**
     * @return return string representation in the following formats
     * for cars: This car is a 1999 Toyota Corrola with 140 hp.
     * for boats: This boat is a 1980 Bayliner Extreme (with motor).
     * for airplanes: This airplane is a 1998 ABC Motors Comac that can reach 10000 feet.
     */
    public String toString() {
        String result = String.format("This car is a %d %s %s with %d hp.",
                manufacturedYear, manufacturer, model, horsepower);
        return result;
    }

    /**
     * @return for cars: "fire pistons, turn wheels"
     * for boats: "jet water"
     * for airplanes: "fire engines on wings"
     */
    public String accelerate() {
        String result = "fire pistons, turn wheels";
        return result;
    }

    /**
     * @return for cars: "turn wheels left"
     * for boats: "turn tiller left"
     * for airplanes: "lift wing flaps to turn left"
     */
    public String steerLeft() {
        String result = "turn wheels left";
        return result;
    }

    /**
     * @return for cars: "turn wheels right"
     * for boats: "turn tiller right"
     * for airplanes: "lift wing flaps to turn right"
     */
    public String steerRight() {
        String result = "turn wheels right";
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null)
            return false;

        if (!(getClass() == obj.getClass()))
            return false;
        else {
            Car tmp = (Car) obj;
            if (Math.abs(horsepower - tmp.horsepower) <= 10)
                return true;
            else
                return false;
        }
    }
}
