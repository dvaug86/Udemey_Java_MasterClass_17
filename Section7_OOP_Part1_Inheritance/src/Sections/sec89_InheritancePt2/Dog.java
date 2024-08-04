package Sections.sec89_InheritancePt2;

public class Dog extends Animal  {
    
    private String earShape;
    private String tailShape;
    
    
    public Dog(){
       super("mutt", "big", 50.0); //these are the arguments from animal class
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
         //this calls constructor with 4 args below. which calls the animal constructor ( super() ) as seen below.
    }

    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight ); //size is derived from weight
        this.earShape = earShape;
        this.tailShape = tailShape;
    }


    @Override
    //this varies from intellij. I have just modified it to be like it for now.
    public String toString() { 
        return "Dog {earShape=" + earShape + '\'' +
         ", tailShape=" + tailShape + '\'' + 
         "} " + super.toString(); //this is calling the section in animal class's toString()
    }


   public void makeNoise(){
    
   }

@Override
public void move(String speed) {
    // TODO Auto-generated method stub
    super.move(speed);
    System.out.println("Dogs walk, run and wag their tail");
}
//code above right now exectues the move method from animal like normal, it would be like not writting it at all
//however this gives us the option to modify it.  It allows us to extend or modify just like how the makeNoise
//now does nothing if the dog class is invoked

   }
