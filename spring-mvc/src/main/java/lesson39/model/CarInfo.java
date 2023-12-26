package lesson39.model;

public class CarInfo {
    private String modelName;
    private String engineType;
    private int horsepower;
    private double acceleration;
    private int maxSpeed;

    public CarInfo() {
        // Пустой конструктор для Spring MVC
    }

    public CarInfo(String modelName, String engineType, int horsepower, double acceleration, int maxSpeed) {
        this.modelName = modelName;
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}