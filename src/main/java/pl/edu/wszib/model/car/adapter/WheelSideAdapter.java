package pl.edu.wszib.model.car.adapter;

import pl.edu.wszib.enums.FuelType;
import pl.edu.wszib.model.car.ICar;
import pl.edu.wszib.model.car.enums.WheelSide;

public class WheelSideAdapter implements ICar {
    private final ICar car;

    public WheelSideAdapter(ICar car) {
        this.car = car;
    }

    @Override
    public void setWheelSide(WheelSide wheelSide) {
        car.setWheelSide(wheelSide);
    }

    @Override
    public void openNavigation() {
        car.openNavigation();
    }

    @Override
    public void fuel(FuelType fuelType) {
        car.fuel(fuelType);
    }

    public WheelSide getWheelSide() {
        return car.getWheelSide();
    }

    public void switchWheelSide() {
        if (this.getWheelSide() == WheelSide.LEFT) {
            this.setWheelSide(WheelSide.RIGHT);
        } else {
            this.setWheelSide(WheelSide.LEFT);
        }
    }

    @Override
    public String toString() {
        return car.toString();
    }
}
