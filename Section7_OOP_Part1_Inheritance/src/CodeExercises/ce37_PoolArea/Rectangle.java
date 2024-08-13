package CodeExercises.ce37_PoolArea;

public class Rectangle {
//fields
private double width;
private double length;


//constructors
public Rectangle(double width, double length) {
    this.width = width > 0 ? width : 0;
    this.length = length > 0 ? length : 0;
}

//methods
public double getWidth(){
    return width;
}

public double getLength(){
    return length;
}

public double getArea(){
    return length * width;
}

}
