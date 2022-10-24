package drivers;

import transport.Car;
import transport.Competing;

public class DriverB  extends Driver <Car> {

    public DriverB(String driverName,  int experienceYears, Car car) {
        super(driverName, "category B", experienceYears, car);
    }


    @Override
    public String getDriverName() {
        return super.getDriverName();
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public int getExperienceYears() {
        return super.getExperienceYears();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}




