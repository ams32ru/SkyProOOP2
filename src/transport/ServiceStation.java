package transport;

import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ServiceStation <T extends Transport>  {


    private Queue<T> queueAvto = new LinkedList<>();

    public ServiceStation() {
        this.queueAvto = queueAvto;
    }

    public Queue<T> getQueueAvto() {
        return queueAvto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceStation<?> that = (ServiceStation<?>) o;
        return Objects.equals(queueAvto, that.queueAvto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueAvto);
    }

    @Override
    public String toString() {
        return "ServiceStation{" +
                "queueAvto=" + queueAvto +
                '}';
    }

    private void addAvtoQueue(T avto) {
        queueAvto.offer(avto);
    }
    public void addCar(Car car) {
        addAvtoQueue((T) car);
    }
    public void addTruck(Truck truck) {
        addAvtoQueue((T) truck);
    }

    public void carInspection() {
        if (queueAvto != null || queueAvto.isEmpty()) {
            T transport = queueAvto.poll();
            System.out.println("Проводим техосмотр " + transport.getBrand() + " " + transport.getModel());
            carInspection();
        }
    }


}
