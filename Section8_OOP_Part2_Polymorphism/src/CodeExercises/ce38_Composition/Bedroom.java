package CodeExercises.ce38_Composition;

public class BedRoom {

    // fields
    private String name;

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    // constructors
    public BedRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp; // i originally had return lamp. it needs to be this.lamp because it is this
                          // lamp .
    }

    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }

    // including the getters is what resolved the warning alert;
    // we need the getter for wall for instance so that we can get the wall info for
    // the bedroom
    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

}
