import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {


        Sponsor coccaColla = new Sponsor("Cocca Colla", 3_000_000);
        Sponsor ferrary = new Sponsor("Ferrary ", 5_000_000);
        Sponsor redbyll = new Sponsor("Red Byll", 2_000_000);
        Sponsor twics = new Sponsor("Twics", 1_000_000);

        Mechanic petr = new Mechanic("Петр петров", "БМЗ");
        Mechanic semen = new Mechanic("Семен Семеныч", "Стройлон");
        Mechanic<Truck> oksana = new Mechanic("Оксана Петровна", "Лукойл");
        Mechanic sergey = new Mechanic("Сергей Романов", "ООО Рога и копыта");



        Bus bus1 = new Bus("Иж", "Т900", 3.2f, BusCapacityType.LARGE);
        bus1.addDriver(new DriverD("Foyks", 23, bus1));
        bus1.addMechanic(petr,semen);
        bus1.addSponsor(twics,coccaColla);
        Bus bus2 = new Bus("Иш", "Т800", 3.0f, BusCapacityType.MEDIUM);
        Bus bus3 = new Bus("Им", "Т700", 2.8f, BusCapacityType.MEDIUM);
        Bus bus4 = new Bus("Ир", "Т600", 2.6f, BusCapacityType.EXTRA_SMALL);

        Car bmv = new Car("BMW", "X6", 2.8f, BodyType.COUPE);
        bmv.addDriver(new DriverB("Alex", 32, bmv));
        bmv.addMechanic(new Mechanic<Car>("Иванов Иван", "Энергосети"));
        bmv.addSponsor(coccaColla);

        Car kia = new Car("KIA", "CEED", 1.6f, BodyType.HATCHBACK);
        kia.addDriver(new DriverB("Nina", 11, kia));
        Car lada = new Car("Lada", "99", 1.4f, BodyType.SEDAN);
        lada.addDriver(new DriverB("Tosya", 3, lada));
        Car volvo = new Car("Volvo", "хс90", 2.2f, BodyType.CROSSOVER);
        volvo.addDriver(new DriverB("Olga", 8, volvo));

        Truck kamaz = new Truck("КамАЗ", "4310", 10.8f, TruckLoadCapacity.N3);
        kamaz.addDriver(new DriverC("Саня", 2, kamaz));
        kamaz.addMechanic(semen,oksana);
        kamaz.addSponsor(redbyll);
        Truck gaz = new Truck("ГАЗ", "66", 4.2f, TruckLoadCapacity.N1);
        Truck zil = new Truck("ЗИЛ", "130", 6.0f, TruckLoadCapacity.N2);
        Truck maz = new Truck("МАЗ", "5516", 8.0f, TruckLoadCapacity.N2);

        List<Transport> transports = List.of(bmv, kia, lada, volvo,
                kamaz, gaz, zil, maz,
                bus1, bus2, bus3, bus4)
                ;
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new DriverB("Володя", 22, lada));
        drivers.add(new DriverD("Tamara", 5, bus1));
        drivers.add(new DriverC("Vovka", 9, zil));

        List<Sponsor> sponsors = List.of(coccaColla, ferrary, redbyll, twics);
        List<Mechanic> mechanics = List.of(petr, semen, sergey, oksana);

        for (Transport transport : transports) {
            printInfo(transport);
        }

        ServiceStation<Transport> serviceStation = new ServiceStation<>();
        serviceStation.addCar(bmv);
        serviceStation.addCar(lada);
        serviceStation.addTruck(kamaz);
//        serviceStation.carInspection();




//        servis(
//                bmv, kia, lada, volvo,
//                kamaz, gaz, zil, maz,
//                bus1, bus2, bus3, bus4
//        );
//
//        Driver mike = new DriverB("Mike", 4, bmv);
//        System.out.println("mike = " + mike);
//        DriverC sam = new DriverC("Sam", 6, zil);
//        System.out.println("sam = " + sam);
//        Driver jack = new DriverD("Jack", 12, bus1);
//        System.out.println("jack = " + jack);
//
//        System.out.println("gaz.toString() = " + gaz.toString());
//        System.out.println("lada.toString() = " + lada.toString());

//        maz.type();
//        bus2.type();
//        volvo.type();
//
//       Data.inputLog();
//        servis();

        Queue<String> cashier1 = new ArrayDeque<>();
        Queue<String> cashier2 = new ArrayDeque<>();
       randomFilling(cashier1);
       randomFilling(cashier2);
        System.out.println("Очередь 1" + cashier1);
        System.out.println("Очередь 2" + cashier2);

        addPeople("Сеня", cashier1,cashier2);
        System.out.println("Очередь 1" + cashier1);
        System.out.println("Очередь 2" + cashier2);
        removePeople(cashier1,cashier2);
        System.out.println("Очередь 1" + cashier1);
        System.out.println("Очередь 2" + cashier2);

        example();
    }

    // задача по супермаркету

    private static final List<String> PEOPLE =  List.of("Человек1","Человек2","Человек3","Человек4","Человек5","Человек6","Человек7","Человек8" );

    public static final Random RANDOM = new Random();

    public static void addPeople(String people, Queue<String> cashier1, Queue<String> cashier2) {
        if (cashier1.size() < cashier2.size()) {
            cashier1.offer(people);
        } else if (cashier2.size() < cashier1.size()) {
            cashier2.offer(people);
        } else {
            System.out.println( "Галллляяя");
        }
    }

    public static void removePeople(Queue<String> cashier1, Queue<String> cashier2) {
        if (RANDOM.nextBoolean()) {
            cashier1.poll();
        } else {
            cashier2.poll();
        }
    }

    public static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(PEOPLE.get(RANDOM.nextInt(PEOPLE.size())));
        }
    }





    public static void servis(Transport... transports) {
        for (Transport transport : transports) {
            servisPrintExpention(transport);
        }
    }

    public static void servisPrintExpention(Transport transports) {
        try {
            if (!transports.texService()) {
                throw new RuntimeException(transports.getBrand() + "" + transports.getModel() + " Не прошшел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printInfo(Transport transport) {
        System.out.println("Информация по афтомобилю: "+ transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители:");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getDriverName());
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getSponsorName());
        }
        System.out.println("Механики: ");
        for (Mechanic<?> mechanic: transport.getMechanics()){
            System.out.println(mechanic.getFullNameMech() +" из компании " + mechanic.getCompany());
        }
    }
    public static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, (i+j)%2==1?"●":"◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}

