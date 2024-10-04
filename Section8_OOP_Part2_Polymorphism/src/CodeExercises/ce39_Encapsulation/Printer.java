package CodeExercises.ce39_Encapsulation;

public class Printer {

    // fields
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // constructors
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    // getter
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    
        
//can't see why this isn't working and can't see what was being inputed inorder to screw it up.
//this is from the answer key and i presume it might have something to do with the variables.
public int addToner(int tonerAmount) {
        
    if (tonerAmount > 0 && tonerAmount <= 100) {
        if (this.tonerLevel + tonerAmount > 100) {
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    } else {
        return -1;
    }
}
//public int addToner(int tonerAmount) {
    //     int tempAmount = tonerAmount + tonerLevel;
    //     if (tempAmount < 0 || tempAmount > 100) {
    //         return -1;
    //     }
    //     return tonerLevel += tonerAmount;
    // }

    public int printPages(int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;

        pagesPrinted += jobPages;
        return jobPages;
    }

}
