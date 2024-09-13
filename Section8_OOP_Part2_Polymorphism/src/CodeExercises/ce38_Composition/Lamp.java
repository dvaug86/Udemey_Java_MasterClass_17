package CodeExercises.ce38_Composition;

public class Lamp {

    // fields
    private String style;
    private boolean battery;
    private int globRating;

    // constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // methods
    // getters
    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    // other methods
    public void turnOn() {
        System.out.println("Lamp is being turned on");
    }

    public boolean isBattery() {
        return battery;
    }
}
