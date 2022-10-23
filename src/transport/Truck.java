package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void getPitStop() {
        System.out.printf(" Truck %s %s заехал на пит-стоп", getModel(),getBrand());
    }

    @Override
    public int getBestLapTime() {
        return  ThreadLocalRandom.current().nextInt(1,1000 );
    }

    @Override
    public int getMaxSpeed() {
        return  ThreadLocalRandom.current().nextInt(1,200 );
    }

    @Override
    public void start() {
        System.out.printf("Start %s %s", getModel(),getBrand());
    }

    @Override
    public void finish() {
        System.out.printf("Finish %s %s", getModel(),getBrand());
    }
}
