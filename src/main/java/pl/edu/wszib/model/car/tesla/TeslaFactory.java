package pl.edu.wszib.model.car.tesla;

import pl.edu.wszib.model.car.ICar;
import pl.edu.wszib.model.car.ICarFactory;
import pl.edu.wszib.model.car.adapter.WheelSideAdapter;
import pl.edu.wszib.model.car.enums.WheelSide;
import pl.edu.wszib.model.car.toyota.Yaris;

import java.util.Optional;

public class TeslaFactory implements ICarFactory {

    private static final TeslaFactory instance = new TeslaFactory();

    private TeslaFactory() {
    }

    @Override
    public Optional<ICar> createCar(String model) {
        Optional<ICar> car = Optional.empty();

        if("y".equals(model)){
            car = Optional.of(new ModelY());
        }

        if (car.isPresent()) {
            WheelSideAdapter adapter = new WheelSideAdapter(car.get());
            adapter.setWheelSide(WheelSide.LEFT);
            return Optional.of(adapter);
        } else {
            return Optional.empty();
        }
    }

    public static TeslaFactory getInstance() {
        return instance;
    }
}
