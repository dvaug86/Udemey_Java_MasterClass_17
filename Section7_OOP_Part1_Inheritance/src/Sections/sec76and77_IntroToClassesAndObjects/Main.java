package Sections.sec76and77_IntroToClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        // car.make = "Porsche"; //can't use these like this because of private. have to use getter and setter methods
        // car.model= "Carrera";
        // car.color = "Red";
        // System.out.println("make = " + car.make);
        // System.out.println("model = " + car.model);
//How to get indidual info:

System.out.println("make = " + car.getMake());
System.out.println("model = " + car.getModel());

        car.describeCar();

    }
}
