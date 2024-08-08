package Sections.sec94_ThisVsSuper;

public class Shape {
private int x;
private int y;

public Shape(int x, int y){
    this.x = x;
    this.y =y;
}
}
class Rectangle extends Shape{
    private int width;
    private int height;

    //1st constructor
    public Rectangle(int x, int y){
        this(x, y, 0, 0); //calls second constructor
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    //2nd constructor 
    
}
