package lesson33;

class Car implements Cloneable {
    private String brand;
    private Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        clonedCar.engine = (Engine) engine.clone();
        return clonedCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}