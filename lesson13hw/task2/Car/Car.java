package tms.java.lesson12.lesson13hw.task2.Car;

import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private int yearOfIssue;
    private int engineVolume;
    private String fuelType;
    private String carColor;

    public Car() {
    }

    public Car(String brand, String model, int yearOfIssue, int engineVolume, String fuelType, String carColor) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
        this.carColor = carColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfIssue == car.yearOfIssue && engineVolume == car.engineVolume && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(fuelType, car.fuelType) && Objects.equals(carColor, car.carColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfIssue, engineVolume, fuelType, carColor);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", engineVolume=" + engineVolume +
                ", fuelType='" + fuelType + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getCarColor() {
        return carColor;
    }
}
