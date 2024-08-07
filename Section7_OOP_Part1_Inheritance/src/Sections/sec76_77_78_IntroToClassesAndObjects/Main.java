package Sections.sec76_77_78_IntroToClassesAndObjects;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Maserati"); // can't use these like this because of private. have to use getter and setter
                                // methods
        car.setModel("Carrera");
        car.setColor("purple");
        car.setDoors(4);
        car.setConvertible(true);


        // How to get indidual info:
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();

        Car targa = new Car ();
        targa.setMake("Porsche"); 
        targa.setModel("Carrera");
        targa.setDoors(2);
        targa.setConvertible(true);
        targa.setColor("black");
    }
}
