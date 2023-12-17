package lesson33;
import org.apache.log4j.Logger;
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        Engine originalEngine = new Engine("V8");
        Car originalCar = new Car("Toyota", originalEngine);
        try {
            Car clonedCar = (Car) originalCar.clone();
            logger.info("Являются ли originalCar и clonedCar одним и тем же объектом? " + (originalCar == clonedCar));
            logger.info("Являются ли engine у originalCar и engine у clonedCar одним и тем же объектом? " +
                    (originalCar.getEngine() == clonedCar.getEngine()));
            clonedCar.setBrand("Honda");
            clonedCar.getEngine().setType("Electric");
            logger.info("Марка оригинального автомобиля: " + originalCar.getBrand());
            logger.info("Тип двигателя оригинального автомобиля: " + originalCar.getEngine().getType());
        } catch (CloneNotSupportedException e) {
            logger.error("Ошибка клонирования:", e);
        }
    }
}