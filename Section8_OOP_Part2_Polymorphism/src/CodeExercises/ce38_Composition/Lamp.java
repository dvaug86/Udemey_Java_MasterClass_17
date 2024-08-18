package CodeExercises.ce38_Composition;

public class Lamp {

//fields
private String style;
private boolean battery;
private int globRating;


//constructors
public Lamp(String style, boolean battery, int globRating) {
    this.style = style;
    this.battery = battery;
    this.globRating = globRating;
   
}

//methods
public void turnOn(){
    System.out.println("lamp is being turned on");
}

public String getStyle(String style){
    return style;
}

public boolean isBattery(boolean battery){
    return battery;
}

public int globRating(int globRating){
    return globRating;
}


}
