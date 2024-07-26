package CodeExercises.ce32_WallArea;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {

        // I was wrong here
        // this wasn't supposed to be here at the time

        // System.out.println("area= " + getArea());

        // This is what should have been here
        // this was my only error. My original code wasn't wrong it just wasn't viable
        // to show the height and width for what udemey's main class was doing.

        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    // terenery was from the hints: i had the if statement originally and my code
    // was right.

    public void setWidth(double width) {
        this.width = width > 0 ? width : 0;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 0;
    }

    public double getArea() {
        // This is fine but just doing "return width * height" would have been better
        double area = width * height;
        return area;
    }

}

// solution
/*
 * public class Wall {
 * 
 * private double width;
 * private double height;
 * 
 * public Wall() {}
 * 
 * public Wall(double width, double height) {
 * setWidth(width);
 * setHeight(height);
 * }
 * 
 * public double getWidth() {
 * return width;
 * }
 * 
 * public void setWidth(double width) {
 * 
 * if (width < 0) {
 * width = 0;
 * }
 * this.width = width;
 * }
 * 
 * public double getHeight() {
 * return height;
 * }
 * 
 * public void setHeight(double height) {
 * 
 * if (height < 0) {
 * height = 0;
 * }
 * this.height = height;
 * }
 * 
 * public double getArea() {
 * return width * height;
 * }
 * }
 */