package Sections.sec101and102_CompositionPt1and2;

public class Product {

    // fields
    @SuppressWarnings("unused")
    private String model;
    @SuppressWarnings("unused")
    private String manufacturer;
    // private int width;
    // private int height;
    // private int depth;

    // constructor
    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product {
    // fields
    @SuppressWarnings("unused")
    private int size;
    @SuppressWarnings("unused")
    private String resolution;

    // constructor(s)
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    // Methods
    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format("Drawing pixel at %d,%d in color %s ", x, y, color));
    }

}

class Motherboard extends Product {
    // fields
    @SuppressWarnings("unused")
    private int ramSlots;
    @SuppressWarnings("unused")
    private int cardSlots;
    @SuppressWarnings("unused")
    private String bios;

    // constructor(s)
    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    // Methods
    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

}

class ComputerCase extends Product {
    // fields
    @SuppressWarnings("unused")
    private String powerSupply;

    // constructor(s)
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    // Methods
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
