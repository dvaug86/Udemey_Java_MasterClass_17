package CodeExercises.ce32_WallArea;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {

        System.out.println("area= " + getArea());
    }

    public void setWidth(double width) {

        this.width = width > 0 ? width : 0;

    }
    public double getWidth() {
        return width;
    }


    public void setHeight(double height) {
        this.height = height > 0 ? height : 0;
    }
    public double getHeight() {
        return height;
    }


    public double getArea() {
        double area = width * height;
        return area;
    }

}
