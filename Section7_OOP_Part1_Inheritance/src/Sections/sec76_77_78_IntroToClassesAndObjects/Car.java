package Sections.sec76_77_78_IntroToClassesAndObjects;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;
    // These are fields because they are defined in the class's code block and not
    // in a method.

    public String getMake(){  //can do this quick by hitting alt + insert
        return make;
    }
    

    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }


    public int getDoors() {
        return doors;
    }


    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        this.make = make; //need to be specifc which we do so by using "this"
    }


    public void setModel(String model) {
        this.model = model;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void setDoors(int doors) {
        this.doors = doors;
    }


    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


    public void describeCar() {
        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
