package Lesson30.Builder.Factory;

public class Ship implements Transport{
 @Override
    public void deliver() {
        System.out.println("Корабль доставляет груз морским путем");
    }
}
