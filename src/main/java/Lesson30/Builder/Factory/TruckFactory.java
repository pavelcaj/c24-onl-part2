package Lesson30.Builder.Factory;

public class TruckFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
