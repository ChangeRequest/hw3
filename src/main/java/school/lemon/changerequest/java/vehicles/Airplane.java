package school.lemon.changerequest.java.vehicles;

public class Airplane extends Vehicle implements IAirplane {

    private int maximumHeightFeet;

    Airplane(int manufacturedYear, String make, String model, int maximumHeightFeet) {
        super(manufacturedYear, make, model);
        this.maximumHeightFeet = maximumHeightFeet;
    }

    /**
     * Get airplane maximum height
     *
     * @return airplane maximum height
     */
    public int getMaximumHeightFeet() {
        return maximumHeightFeet;
    }

    /**
     * Set airplane maximum height
     *
     * @param maximumHeightFeet maximum height of the airplane
     */
    public void setMaximumHeightFeet(int maximumHeightFeet) {
        this.maximumHeightFeet = maximumHeightFeet;
    }

    /**
     * @return return string representation in the following formats
     * for cars: This car is a 1999 Toyota Corrola with 140 hp.
     * for boats: This boat is a 1980 Bayliner Extreme (with motor).
     * for airplanes: This airplane is a 1998 ABC Motors Comac that can reach 10000 feet.
     */
    public String toString() {
        String result = String.format("This airplane is a %d %s %s that can reach %d feet.",
                manufacturedYear, manufacturer, model, maximumHeightFeet);
        return result;
    }

    /**
     * @return for airplanes: "fire engines on wings"
     */
    public String accelerate() {
        String result = "fire engines on wings";
        return result;
    }

    /**
     * @return for airplanes: "lift wing flaps to turn left"
     */
    public String steerLeft() {
        String result = "lift wing flaps to turn left";
        return result;
    }

    /**
     * @return for airplanes: "lift wing flaps to turn right"
     */
    public String steerRight() {
        String result = "lift wing flaps to turn right";
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
            Airplane tmp = (Airplane) obj;
            if (Math.abs(maximumHeightFeet - tmp.maximumHeightFeet) <= 1000)
                return true;
            else
                return false;
        }
    }
}
