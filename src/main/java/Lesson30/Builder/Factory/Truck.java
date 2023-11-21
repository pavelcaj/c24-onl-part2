package Lesson30.Builder.Factory;
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Грузовик доставляет груз");
    }
}