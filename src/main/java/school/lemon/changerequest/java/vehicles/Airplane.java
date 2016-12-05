package school.lemon.changerequest.java.vehicles;

/**
 * Created by Yaroslav Pavlinskiy on 04.12.2016.
 */
public class Airplane implements IAirplane {
    private int manufacturedYear;
    private String make;
    private String model;
    private int maximumHeightFeet;

    public Airplane(int manufacturedYear, String make, String model, int maximumHeightFeet) {
        this.manufacturedYear = manufacturedYear;
        this.make = make;
        this.model = model;
        this.maximumHeightFeet = maximumHeightFeet;
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
    public int getMaximumHeightFeet() {
        return this.maximumHeightFeet;
    }

    @Override
    public void setMaximumHeightFeet(int maximumHeightFeet) {
        this.maximumHeightFeet = maximumHeightFeet;
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

    @Override
    public String toString() {
        return String.format("This airplane is a %1$d %2$s %3$s that can reach %4$d feet.", this.getManufacturedYear(), this.getMake(), this.getModel(), this.getMaximumHeightFeet());
    }

    @Override
    public boolean equals(Object obj) {
        obj = (Airplane) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (this.getMaximumHeightFeet() + 1000 != ((Airplane) obj).getMaximumHeightFeet() || this.getMaximumHeightFeet() - 1000 != ((Airplane) obj).getMaximumHeightFeet())
            return true;
        return false;
    }
}
