package drivers;

import transport.Car;
import transport.Truck;
public class DriverC extends Driver<Truck>{
    public DriverC(String driverName,  int experienceYears, Truck truck) {
        super(driverName, "category C", experienceYears, truck);
    }
}
