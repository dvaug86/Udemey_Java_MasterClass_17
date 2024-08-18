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

public String getStyle() {
    return style;
}

public boolean isBattery() {
    return battery;
}

public int getGlobRating() {
    return globRating;
}


}
