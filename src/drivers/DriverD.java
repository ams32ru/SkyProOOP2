package drivers;

import transport.Bus;
import transport.Car;

public class DriverD extends Driver <Bus> {
    public DriverD(String driverName, int experienceYears, Bus bus) {
        super(driverName, "category D", experienceYears, bus);
    }
}
