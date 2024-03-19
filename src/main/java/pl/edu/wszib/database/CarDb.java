package pl.edu.wszib.database;

import pl.edu.wszib.model.car.ICar;

import java.util.ArrayList;
import java.util.List;

public class CarDb {
    private static final CarDb instance = new CarDb();
    private CarDb() {
    }

    public List<ICar> cars = new ArrayList<>();

    public List<ICar> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return new StringBuilder("CarDb{ cars = ") //does it count as builder design pattern?
                .append(cars)
                .append(" }").toString();
    }

    public void addCarToDb(ICar car){
        try {
            cars.add(car);
        } catch (Exception e){
            throw new RuntimeException("Something went wrong while adding car to db");
        }
    }
    public static CarDb getInstance() {
        return instance;
    }
}
