package CodeExercises.ce32_WallArea;

public class Wall {
private double width;
private double height;

public Wall() {
}

public Wall(double width, double height) {
    this.width = width;
    this.height = height;
    if(width < 0 ){
        this.width = 0;
    }
    if(height < 0){
        this.width = 0;
    }
    System.out.println(getArea());
}

public double getWidth() {
    return width;
}

public void setWidth(double width) {
    this.width = width;
}

public double getHeight() {
    return height;
}

public void setHeight(double height) {
    this.height = height;
}
public double getArea(){
    double area = width * height;
    return area;
}

}
