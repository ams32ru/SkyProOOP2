package transport;

import java.util.Objects;

public abstract class Transport {
    private    String brand;
    private    String model;
    private  float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isBlank()) {
            this.model = model;
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void start();

    public abstract void finish();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }
}
