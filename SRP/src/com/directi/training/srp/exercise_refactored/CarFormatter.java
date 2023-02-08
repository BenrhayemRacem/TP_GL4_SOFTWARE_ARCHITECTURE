package com.directi.training.srp.exercise_refactored;


import java.util.List;

public class CarFormatter
{
    private CarDB carDB;

   public CarFormatter() {
       this.carDB = new CarDB() ;
    }
    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        List<Car> _carsDb =  carDB.getCarsDb();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    
}
