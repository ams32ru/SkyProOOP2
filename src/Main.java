import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import transport.Bus;
import transport.Car;
import transport.Competing;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("Иж", "Т900", 3.2f);
        Bus bus2 = new Bus("Иш", "Т800", 3.0f);
        Bus bus3 = new Bus("Им", "Т700", 2.8f);
        Bus bus4 = new Bus("Ир", "Т600", 2.6f);

        Car bmv = new Car("BMW", "X6", 2.8f);
        Car kia = new Car("KIA", "CEED", 1.6f);
        Car lada = new Car("Lada", "99", 1.4f);
        Car volvo = new Car("Volvo", "хс90", 2.2f);

        Truck kamaz = new Truck("КамАЗ", "4310", 10.8f);
        Truck gaz = new Truck("ГАЗ", "66", 4.2f);
        Truck zil = new Truck("ЗИЛ", "130", 6.0f);
        Truck maz = new Truck("МАЗ", "5516", 8.0f);


        Driver mike = new DriverB("Mike", 4, bmv);
        System.out.println("mike = " + mike);
        Driver sam = new DriverC("Sam", 6, zil);
        System.out.println("sam = " + sam);
        Driver jack = new DriverD("Jack", 12, bus1);
        System.out.println("jack = " + jack);


    }
}