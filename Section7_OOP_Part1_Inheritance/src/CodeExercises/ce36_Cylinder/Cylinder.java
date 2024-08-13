package CodeExercises.ce36_Cylinder;

public class Cylinder extends Circle {

    // fields
    private double height;

    // constructor
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height > 0 ? height : 0;
    }
    
    //methods
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }

}
