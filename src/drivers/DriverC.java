package drivers;

import transport.Car;
import transport.Truck;
public class DriverC extends Driver<Truck>{
    public DriverC(String driverName,  int experienceYears, Truck truck) {
        super(driverName, "category C", experienceYears, truck);
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
