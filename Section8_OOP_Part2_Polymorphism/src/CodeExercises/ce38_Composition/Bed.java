package CodeExercises.ce38_Composition;

public class Bed {

    // fields
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    // constructor
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    // methods
    public void make() {
        System.out.println("Bed is being made");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public String getStyle() {
        return style;
    }

}
