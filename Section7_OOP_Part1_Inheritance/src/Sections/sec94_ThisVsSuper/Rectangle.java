package Sections.sec94_ThisVsSuper;

public class Rectangle {


    //Example of bad code
   /*  private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle( int width, int height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
*/
   //Good code
   private int x;
   private int y;
   private int width;
   private int height;
   
   //first constructor
   public Rectangle(){
    this(0, 0 ); //calls 2nd constructor
   }

   //second constructor
   public Rectangle(int width, int height){
    this(0,0, width, height); //calls 3rd constructor
   }

public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
}

   //3rd constructor
   
}
