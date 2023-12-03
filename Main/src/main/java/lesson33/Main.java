package lesson33;

public class Main {
    public static void main(String[] args) {
        Engine originalEngine = new Engine("V8");
        Car originalCar = new Car("Toyota", originalEngine);
        try {
            Car clonedCar = (Car) originalCar.clone();
            System.out.println(originalCar == clonedCar);
            System.out.println(originalCar.getEngine() == clonedCar.getEngine());
            clonedCar.setBrand("Honda");
            clonedCar.getEngine().setType("Electric");
            System.out.println(originalCar.getBrand());
            System.out.println(originalCar.getEngine().getType());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}