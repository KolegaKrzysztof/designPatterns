package pl.edu.wszib.model.car.tesla;

import pl.edu.wszib.enums.FuelType;
import pl.edu.wszib.model.car.ICar;
import pl.edu.wszib.model.car.enums.WheelSide;

public class ModelY implements ICar {

    WheelSide wheelSide;

    @Override
    public void openNavigation() {
        System.out.println("open google maps ");
    }

    @Override
    public void fuel(FuelType fuelType) {
        if(fuelType == FuelType.ElECTRIC){
            System.out.println("charging...");
        } else {
            throw new RuntimeException("Wrong fuel type");
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
        return new StringBuilder("Tesla Y{")
                .append("wheelSide=")
                .append(wheelSide)
                .append('}').toString();
    }
}
