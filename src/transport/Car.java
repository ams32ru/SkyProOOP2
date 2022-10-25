package transport;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    private BodyType bodyType;

    public Car(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public boolean texService() {
        return Math.random()> 0.5;
    }

    @Override
    public void start() {
        System.out.printf("Start %s %s", getModel(), getBrand());
    }

    @Override
    public void finish() {
        System.out.printf("Finish %s %s ",
                getBrand(), getModel());
    }

    @Override
    public void type() {
        if (bodyType == null) {
            System.out.println(" Данных по авто недостаточно");
        } else {
            System.out.println(" Тип кузова автомобиля " + bodyType);
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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
        return super.toString() + " Тип кузова: "
                + getBodyType();
    }

    @Override
    public void getPitStop() {
        System.out.printf(" Car %s %S заехал на пит-стоп", getBrand(), getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(60, 300);
    }

}




