package tms.java.lesson12.lesson13hw.task2;

import tms.java.lesson12.lesson13hw.task2.Car.Car;

import java.util.HashMap;

public class Garage {

    private HashMap<Car, Integer> cars = new HashMap<>();

    public void addCarToGarage(Car carEnterGarage) {
        if (cars.containsKey(carEnterGarage)) {
            cars.put(carEnterGarage, cars.get(carEnterGarage) + 1);
        } else {
            cars.put(carEnterGarage, 1);
        }
    }

    public void removeCarFromGarage(Car carFromGarage) {
        if (!cars.containsKey(carFromGarage))
            return;
        if (cars.get(carFromGarage) == 1) {
            cars.remove(carFromGarage);
        } else {
            cars.put(carFromGarage, cars.get(carFromGarage) - 1);
        }
    }

    public int getAmountCars(Car car) {
        return cars.getOrDefault(car, 0);
    }
}
