package drivers;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String driverName;
    private  String category;
    private final int experienceYears;

    private final T car;


    public Driver(String driverName, String category, int experienceYears, T car) {
        this.driverName = driverName;
        this.experienceYears = experienceYears;
        this.car = car;
        setCategory(category);
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

    public void setCategory(String category) {
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        } else {
            this.category = category;
        }
    }

    @Override
    public java.lang.String toString() {
        return java.lang.String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                getDriverName(), car.getBrand(), car.getModel());
    }

}

