package drivers;

import transport.Car;
import transport.Competing;

public class DriverB  extends Driver <Car> {

    public DriverB(String driverName,  int experienceYears, Car car) {
        super(driverName, "category B", experienceYears, car);
    }
}




