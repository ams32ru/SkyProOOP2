import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import transport.*;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("Иж", "Т900", 3.2f, BusCapacityType.LARGE);
        Bus bus2 = new Bus("Иш", "Т800", 3.0f, BusCapacityType.MEDIUM);
        Bus bus3 = new Bus("Им", "Т700", 2.8f, BusCapacityType.MEDIUM);
        Bus bus4 = new Bus("Ир", "Т600", 2.6f, BusCapacityType.EXTRA_SMALL);

        Car bmv = new Car("BMW", "X6", 2.8f, BodyType.COUPE);
        Car kia = new Car("KIA", "CEED", 1.6f,BodyType.HATCHBACK);
        Car lada = new Car("Lada", "99", 1.4f,BodyType.SEDAN);
        Car volvo = new Car("Volvo", "хс90", 2.2f,BodyType.CROSSOVER);

        Truck kamaz = new Truck("КамАЗ", "4310", 10.8f, TruckLoadCapacity.N3);
        Truck gaz = new Truck("ГАЗ", "66", 4.2f, TruckLoadCapacity.N1);
        Truck zil = new Truck("ЗИЛ", "130", 6.0f, TruckLoadCapacity.N2);
        Truck maz = new Truck("МАЗ", "5516", 8.0f, TruckLoadCapacity.N2);


        Driver mike = new DriverB("Mike", 4, bmv);
        System.out.println("mike = " + mike);
        Driver sam = new DriverC("Sam", 6, zil);
        System.out.println("sam = " + sam);
        Driver jack = new DriverD("Jack", 12, bus1);
        System.out.println("jack = " + jack);

        System.out.println("gaz.toString() = " + gaz.toString());
        System.out.println("lada.toString() = " + lada.toString());

        maz.type();
        bus2.type();
        volvo.type();

    }
}