package com.directi.training.srp.exercise_refactored;
import java.util.List;


public class CarComparator {

    private CarDB carDB;

    public CarComparator() {
        this.carDB = new CarDB() ;
    }
    public Car getBestCar()
    {
        Car bestCar = null;
        List<Car> _carsDb =  carDB.getCarsDb();
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
