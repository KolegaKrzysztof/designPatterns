package pl.edu.wszib.model.car.toyota;

import pl.edu.wszib.model.car.ICar;
import pl.edu.wszib.model.car.ICarFactory;
import pl.edu.wszib.model.car.adapter.WheelSideAdapter;
import pl.edu.wszib.model.car.enums.WheelSide;

import java.util.Optional;

public class ToyotaFactory implements ICarFactory {

    private static final ToyotaFactory instance = new ToyotaFactory();
    private ToyotaFactory(){};
    @Override
    public Optional<ICar> createCar(String model){
        Optional<ICar> car = Optional.empty();

        if("yaris".equals(model)){
            car = Optional.of(new Yaris());
        } else if ("corolla".equals(model)) {
            car = Optional.of(new Corolla());
        }
        if (car.isPresent()) {
            WheelSideAdapter adapter = new WheelSideAdapter(car.get());
            adapter.setWheelSide(WheelSide.RIGHT);
            return Optional.of(adapter);
        } else {
            return Optional.empty();
        }
    }

    public static ToyotaFactory getInstance() {
        return instance;
    }
}
