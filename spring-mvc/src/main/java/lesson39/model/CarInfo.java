package lesson39.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Min;

public class CarInfo {
    @NotBlank(message = "Model name is required")
    private String modelName;

    @NotBlank(message = "Engine type is required")
    private String engineType;

    @Min(value = 1, message = "Horsepower must be greater than 0")
    private int horsepower;

    @Min(value = 0, message = "Acceleration must be non-negative")
    private double acceleration;

    @Min(value = 1, message = "Max speed must be greater than 0")
    private int maxSpeed;

    public CarInfo() {

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