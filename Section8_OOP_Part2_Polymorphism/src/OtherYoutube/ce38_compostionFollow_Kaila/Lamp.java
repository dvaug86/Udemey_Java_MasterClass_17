package OtherYoutube.ce38_compostionFollow_Kaila;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    // public Lamp(String style, boolean battery, int globRating){
    // //she added super. i don't think this is necessary as that is inheritance and
    // we are working on composition;
    // //super

    // }
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
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

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

}
