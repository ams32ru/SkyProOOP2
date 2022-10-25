package transport;

public enum TruckLoadCapacity {
    N1("Масса до 3,5 тонн"), N2("Масса от 3,5 до 12 тонн"), N3("Масса свывше 12 тонн");
    public String truckCapacity;

    TruckLoadCapacity(String truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    public String getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(String truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    @Override
    public String toString() {
        return "TruckLoadCapacity{" +
                "truckCapacity='" + truckCapacity + '\'' +
                '}';
    }
}
