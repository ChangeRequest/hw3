package school.lemon.changerequest.java.vehicles;

public final class VehicleFactory {

    private VehicleFactory() {
    }

    /**
     * Creates car
     *
     * @param manufacturedYear manufactured year
     * @param make             manufacturer
     * @param model            of car
     * @param horsepower       of car
     * @return instance of car
     */
    public static ICar createCar(int manufacturedYear, String make, String model, int horsepower) {
        ICarImpl car = new ICarImpl(make, manufacturedYear, model, horsepower);
        return car;
    }

    /**
     * Creates airplane
     *
     * @param manufacturedYear  manufactured year
     * @param make              manufacturer
     * @param model             of airplane
     * @param maximumHeightFeet of airplane
     * @return instance of airplane
     */
    public static IAirplane createAirplane(int manufacturedYear, String make, String model, int maximumHeightFeet) {
        IAirplaneImpl airplane = new IAirplaneImpl(make, manufacturedYear, model, maximumHeightFeet);
        return airplane;
    }

    /**
     * Creates boat
     *
     * @param manufacturedYear manufactured year
     * @param make             manufacturer
     * @param model            of boat
     * @param motorized        is boat motorized
     * @return instance of boat
     */
    public static IBoat createBoat(int manufacturedYear, String make, String model, boolean motorized) {
        IBoatImpl boat = new IBoatImpl(make, manufacturedYear, model, motorized);
        return boat;
    }

}
