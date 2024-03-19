package pl.edu.wszib.core;

import pl.edu.wszib.database.CarDb;
import pl.edu.wszib.gui.GUI;
import pl.edu.wszib.model.car.ICar;
import pl.edu.wszib.model.car.tesla.TeslaFactory;
import pl.edu.wszib.model.car.toyota.ToyotaFactory;

import java.util.Optional;
import java.util.Scanner;

public class Core {
    private static final Core instance = new Core();

    public final GUI gui = GUI.getInstance();
    private Core() {
    }

    public void start(){
        this.gui.welcomingText();
        while (true){
            switch (GUI.getInstance().menu()){
                case "1" -> System.out.println(CarDb.getInstance().toString());
                case "2" -> {
                    System.out.print("model: ");
                    Optional<ICar> car = ToyotaFactory.getInstance().createCar(new Scanner(System.in).nextLine());
                    if(car.isPresent()){
                        CarDb.getInstance().addCarToDb(car.get());
                    } else {
                        System.out.println("Model doesn't exist");
                    }
                }
                case "3" -> {
                    Optional<ICar> car = TeslaFactory.getInstance().createCar(new Scanner(System.in).nextLine());
                    if(car.isPresent()){
                        CarDb.getInstance().addCarToDb(car.get());
                    } else {
                        System.out.println("Model doesn't exist");
                    }
                }
                case "4" -> System.exit(0);
            }
        }
    }

    public static Core getInstance(){
        return instance;
    }
}
