package drivers;

import transport.Bus;
import transport.Car;

public class DriverD extends Driver <Bus> {
    public DriverD(String driverName, int experienceYears, Bus bus) {
        super(driverName, "category D", experienceYears, bus);
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
