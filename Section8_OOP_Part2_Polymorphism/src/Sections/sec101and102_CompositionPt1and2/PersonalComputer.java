package Sections.sec101and102_CompositionPt1and2;

public class PersonalComputer extends Product {

    // here we will build the computer using composition
    private ComputerCase computerCase;
    @SuppressWarnings("unused")
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

private void drawLogo(){
    monitor.drawPixelAt(1200, 50, "yellow");
}

public void powerUp(){
    computerCase.pressPowerButton();
    drawLogo();
}
//we are commenting out the getters to prevent the calling program to access those objects
//the part below directly
//this is so not just anybody can access the Monitor Motherboard or computer case directly.

    // public ComputerCase getComputerCase() {
    //     return computerCase;
    // }

    // public Motherboard getMotherboard() {
    //     return motherboard;
    // }

    // public Monitor getMonitor() {
    //     return monitor;
    // }

    
}
