package pl.edu.wszib.model.car.toyota;

import pl.edu.wszib.enums.FuelType;
import pl.edu.wszib.model.car.ICar;
import pl.edu.wszib.model.car.enums.WheelSide;

public class Corolla implements ICar {

    WheelSide wheelSide = WheelSide.RIGHT;
    String model = "Corrolla";

    @Override
    public void openNavigation(){
        System.out.println("open toyota's navigation app");
    }

    @Override
    public void fuel(FuelType fuelType){
        if(fuelType == FuelType.PETROL_95 || fuelType == FuelType.PETROL_98){
            System.out.println("fueling " + fuelType);
        } else {
            throw new RuntimeException("wrong fuel type");
        }
    }

    @Override
    public void setWheelSide(WheelSide wheelSide) {
        this.wheelSide = wheelSide;
    }

    @Override
    public WheelSide getWheelSide() {
        return wheelSide;
    }

    @Override
    public String toString() {
        return new StringBuilder("Corolla{")
                .append("wheelSide=")
                .append(wheelSide)
                .append('}').toString();
    }
}
