package pl.edu.wszib.model.car;

import pl.edu.wszib.enums.FuelType;
import pl.edu.wszib.model.car.enums.WheelSide;

public interface ICar {
    void setWheelSide(WheelSide wheelSide);
    void openNavigation();
    void fuel(FuelType fuelType);
    WheelSide getWheelSide();
}
