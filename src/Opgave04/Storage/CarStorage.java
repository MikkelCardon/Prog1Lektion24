package Opgave04.Storage;

import Opgave04.Models.Car;

import java.util.ArrayList;

public class CarStorage {
    private static ArrayList<Car> cars = new ArrayList<Car>();

    public CarStorage() {
        cars.add(new Car("Renault", "Clio", 222));
        cars.add(new Car("Skoda", "Fabia", 193));
        cars.add(new Car("Tesla", "Model Y", 250));
        cars.add(new Car("Tesla", "Model S", 261));
        cars.add(new Car("Polestar", "2", 160));
        cars.add(new Car("Mercedes", "CLE Coupé", 250));
        cars.add(new Car("Mercedes", "EQE", 210));
    }



    public static Car fastestCar(int topSpeed){
        for (Car car : cars) {
            if (car.getTopSpeed() > topSpeed){
                System.out.println("TEST");
                return car;
            }
        }
        return null;
    }

    public static Car carBrand(String brand){
        for (Car car : cars) {
            if (car.getBrand().equals(brand) ){
                return car;
            }
        }
        return null;
    }


}
