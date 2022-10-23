package drivers;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String driverName;
    private final String category;
    private final int experienceYears;

    private final T car;


    public Driver(String driverName, String category, int experienceYears, T car) {
        this.driverName = driverName;
        this.category = category;
        this.experienceYears = experienceYears;
        this.car = car;
    }

    public  void startUp() {
        System.out.printf("Driver %s started moving", getDriverName());
        this.car.start();
    }

    public void  stop() {
        System.out.printf("Driver %s stopped moving", getDriverName());
        this.car.finish();
    }

    public void  refuelCar() {
        System.out.printf("Driver %s refuel %s %s", getDriverName(), car.getBrand(), car.getModel());
    }

    public String getDriverName() {
        return driverName;
    }

    public String getCategory() {
        return category;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                getDriverName(), car.getBrand(), car.getModel());
    }
}

