package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing {

    private TruckLoadCapacity truckLoadCapacity;

    public Truck(String brand, String model, float engineVolume, TruckLoadCapacity truckLoadCapacity) {
        super(brand, model, engineVolume);
        this.truckLoadCapacity = truckLoadCapacity;
    }

    public TruckLoadCapacity getTruckLoadCapacity() {
        return truckLoadCapacity;
    }

    public void setTruckLoadCapacity(TruckLoadCapacity truckLoadCapacity) {
        this.truckLoadCapacity = truckLoadCapacity;
    }

    @Override
    public void getPitStop() {
        System.out.printf(" Truck %s %s заехал на пит-стоп", getModel(), getBrand());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 200);
    }

    @Override
    public boolean texService() {
        return Math.random()>0.5;
    }

    @Override
    public void start() {
        System.out.printf("Start %s %s", getModel(), getBrand());
    }

    @Override
    public void finish() {
        System.out.printf("Finish %s %s", getModel(), getBrand());
    }

    @Override
    public void type() {
        if (truckLoadCapacity == null) {
            System.out.println(" Недостаточно данных по   грузовику");
        } else {
            System.out.println(" Грузоподъемность " + getTruckLoadCapacity());
        }
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public float getEngineVolume() {
        return super.getEngineVolume();
    }


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


