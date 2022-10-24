package transport;

public enum BusCapacityType {
    EXTRA_SMALL("до 10 мест"), SMALL("до 25 мест"), MEDIUM("до 40-50 мест"),
    LARGE("до 60-80 мест"), ESPECIALLY_LARGE("до 100-120 мест");
    public String busCapacity;

    BusCapacityType(String busCapacity) {
        this.busCapacity = busCapacity;
    }

    public String getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(String busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public String toString() {
        return "BusCapacityType{" +
                "busCapacity='" + busCapacity + '\'' +
                '}';
    }
}
