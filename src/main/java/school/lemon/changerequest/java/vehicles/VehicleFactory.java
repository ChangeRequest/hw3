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
        return new Car(manufacturedYear, make, model, horsepower) {
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
        };
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
        return new Airplane(manufacturedYear, make, model, maximumHeightFeet) {

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
        };
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
        return new Boat(manufacturedYear, make, model, motorized) {

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
        };


    }


}
