package Sections.sec76_IntroToClassesAndObjects;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;
    // These are fields because they are defined in the class's code block and not
    // in a method.

    public void describeCar() {
        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
