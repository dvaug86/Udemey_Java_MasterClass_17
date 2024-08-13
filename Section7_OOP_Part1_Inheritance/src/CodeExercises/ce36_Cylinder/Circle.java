package CodeExercises.ce36_Cylinder;

public class Circle {

    //fields
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }

    //methods
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return (radius * radius * Math.PI);
    }


    

}
