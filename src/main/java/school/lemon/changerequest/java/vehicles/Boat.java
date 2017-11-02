package school.lemon.changerequest.java.vehicles;

public class Boat extends Vehicle implements IBoat {

    private boolean motorized;

    Boat(int manufacturedYear, String make, String model, boolean motorized) {
        super(manufacturedYear, make, model);
        this.motorized = motorized;
    }

    /**
     * Is boat motorized
     *
     * @return true if motorized, false - otherwise
     */
    public boolean isMotorized() {
        return motorized;
    }

    /**
     * Specify whether boat is motorized
     *
     * @param motorized whether boat is motorized or not
     */
    public void setMotorized(boolean motorized) {
        this.motorized = motorized;
    }


    /**
     * @return return string representation in the following formats
     * for cars: This car is a 1999 Toyota Corrola with 140 hp.
     * for boats: This boat is a 1980 Bayliner Extreme (with motor).
     * for airplanes: This airplane is a 1998 ABC Motors Comac that can reach 10000 feet.
     */
    public String toString() {
        String result = String.format("This boat is a %d %s %s",
                manufacturedYear, manufacturer, model);
        if (motorized)
            result += " (with motor).";
        else
            result += ".";
        return result;
    }

    /**
     * @return for cars: "fire pistons, turn wheels"
     * for boats: "jet water"
     * for airplanes: "fire engines on wings"
     */
    public String accelerate() {
        String result = "jet water";
        return result;
    }

    /**
     * @return for cars: "turn wheels left"
     * for boats: "turn tiller left"
     * for airplanes: "lift wing flaps to turn left"
     */
    public String steerLeft() {
        String result = "turn tiller left";
        return result;
    }

    /**
     * @return for cars: "turn wheels right"
     * for boats: "turn tiller right"
     * for airplanes: "lift wing flaps to turn right"
     */
    public String steerRight() {
        String result = "turn tiller right";
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
            Boat tmp = (Boat) obj;
            if (motorized == tmp.motorized)
                return true;
            else
                return false;
        }
    }
}
