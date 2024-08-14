package Sections.sec101_CompositionPt1;

public class PersonalComputer extends Product {

    // here we will build the computer using composition
    private ComputerCase computerCase;
    private Motherboard motherboard;
    private Monitor monitor;

    // constructor(s)
    public PersonalComputer(String model, String manufacturer,
            ComputerCase computerCase, Monitor monitor,
            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // methods
        // getters

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    
}
