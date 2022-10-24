package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {
    public BusCapacityType busCapacityType;

    public Bus(String brand, String model, float engineVolume, BusCapacityType busCapacityType) {
        super(brand, model, engineVolume);
        this.busCapacityType = busCapacityType;
    }

    public BusCapacityType getBusCapacityType() {
        return busCapacityType;
    }

    public void setBusCapacityType(BusCapacityType busCapacityType) {
        this.busCapacityType = busCapacityType;
    }

    @Override
    public void getPitStop() {
        System.out.printf("Bus %s %s заехал на пит стоп", getModel(), getBrand());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(10, 180);
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
        if (busCapacityType == null) {
            System.out.println(" Данных по автобусу недостаточно");
        } else {
            System.out.println(" Вместимость автобуса " + getBusCapacityType());
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
