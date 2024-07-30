package CodeExercises.ce34_CarpetCostCalc;

public class Floor {
private double width;
private double length;


public Floor(double width, double length) {
    // setWidth(width);
    // setLength(length);
    this.width = width > 0 ? width : 0;
    this.length = length > 0 ? length : 0;
}

// So my code ended up being right I just didn't need to have all the gettters and setters. All I needed to do was to 
// combine the setters in the Floor constructor.
// Udemey answer key for each class at the bottom of each class.

// public double getWidth() {
//     return width;
// }


// public void setWidth(double width) {
//     this.width = width > 0 ? width : 0;
// }


// public double getLength() {
//     return length;
// }


// public void setLength(double length) {
//     this.length = length > 0 ? length : 0;
// }

public double getArea(){
    return (width * length);
}

}

/*
 * // Floor.java
public class Floor {
 
    private double width;
    private double length;
 
    public Floor(double width, double length) {
        
        if (width < 0) {
            width = 0;
        }
 
        if (length < 0) {
            length = 0;
        }
 
        this.width = width;
        this.length = length;
    }
 
    public double getArea() {
        return width * length;
    }
}
 */
