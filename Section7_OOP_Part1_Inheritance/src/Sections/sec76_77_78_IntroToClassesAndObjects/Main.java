package Sections.sec76_77_78_IntroToClassesAndObjects;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche"); // can't use these like this because of private. have to use getter and setter
                                // methods
        car.setModel("Carrera");
        car.setColor("red");

        // How to get indidual info:
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();

    }
}
