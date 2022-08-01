package tms.java.lesson12.lesson13hw.task2;

import tms.java.lesson12.lesson13hw.task2.Car.AudiQ7;
import tms.java.lesson12.lesson13hw.task2.Car.BmwX7;
import tms.java.lesson12.lesson13hw.task2.Car.NissanXTrail;
import tms.java.lesson12.lesson13hw.task2.Car.RenoSandero;

public class Main {
    public static void main(String[] args) {

        BmwX7 BmwX7 = new BmwX7("BMW","X7",2020,3200,"Dizel","Black");
        AudiQ7 AudiQ7 = new AudiQ7("Audi","Q7",2012,2500,"Petrol","Red");
        NissanXTrail NissanXTrail = new NissanXTrail("Nissan", "X-Trail", 2021, 2000, "e-tronic", "White");
        RenoSandero RenoSandero = new RenoSandero("Reno", "Sandero", 2017, 1600, "Petrol", "Yellow");

        Garage myGarage = new Garage();

        myGarage.addCarToGarage(BmwX7);
        myGarage.addCarToGarage(AudiQ7);
        myGarage.addCarToGarage(NissanXTrail);
        myGarage.addCarToGarage(RenoSandero);
        myGarage.addCarToGarage(RenoSandero);

        myGarage.removeCarFromGarage(RenoSandero);
        myGarage.removeCarFromGarage(AudiQ7);

        System.out.println(RenoSandero + ": " + myGarage.getAmountCars(RenoSandero) + " in garage");
        System.out.println(BmwX7.getBrand() + BmwX7.getModel() +": " + myGarage.getAmountCars(BmwX7) + " in garage");
        System.out.println(NissanXTrail +": " + myGarage.getAmountCars(NissanXTrail) + " in garage");
        System.out.println(AudiQ7.getBrand() + AudiQ7.getModel() +": " + myGarage.getAmountCars(AudiQ7) + " in garage");
    }
}

