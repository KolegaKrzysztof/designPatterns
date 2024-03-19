package pl.edu.wszib.gui;

import java.util.Scanner;

public class GUI {
    private static final GUI instance = new GUI();

    private final Scanner scanner = new Scanner(System.in);
    private GUI() {
    }

    public void welcomingText(){
        System.out.println("Random app which is written using design patterns");
    }

    public String menu(){
        System.out.println("""
        1. List cars
        2. Create Toyota
        3. Create Tesla
        4. Exit""");
        return this.scanner.nextLine();
    }

    public static GUI getInstance(){
        return instance;
    }
}
