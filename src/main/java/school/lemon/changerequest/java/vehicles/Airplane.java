package school.lemon.changerequest.java.vehicles;

public class Airplane extends Vehicle implements IAirplane {
    private int maximumHeightFeet;

    public Airplane(int yearManufactured, String make, String model, int maximumHeightFeet) {
        super(yearManufactured, make, model);
        this.maximumHeightFeet = maximumHeightFeet;
    }

    @Override
    public int getMaximumHeightFeet() {
        return this.maximumHeightFeet;
    }

    @Override
    public void setMaximumHeightFeet(int maximumHeightFeet) {
        this.maximumHeightFeet = maximumHeightFeet;
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

            Airplane temp = (Airplane) obj;
            return Math.abs(temp.maximumHeightFeet - this.maximumHeightFeet) <= 1000;
        }
    }

    @Override
    public String toString() {
        return String.format("This airplane is a %1$s %2$s %3$s that can reach %4$s feet.", this.getManufacturedYear(), this.getMake(), this.getModel(), this.getMaximumHeightFeet());
    }

    @Override
    public String accelerate() {
        return "fire engines on wings";
    }

    @Override
    public String steerLeft() {
        return "lift wing flaps to turn left";
    }

    @Override
    public String steerRight() {
        return "lift wing flaps to turn right";
    }
}
