package CodeExercises.ce37_PoolArea;

public class Cuboid extends Rectangle {

    // fields
    private double height;

    // constructors
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height > 0 ? height : 0;
    }

    

    // methods
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
