package pl.edu.wszib.model.car;

import java.util.Optional;

public interface ICarFactory {
    Optional<ICar> createCar(String model);
}
