package Sections.sec106_EncapsulationChallenge;

public class Printer {

    // fields
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // constructors
    public Printer(int tonerLevel, boolean duplex) {
        // if (tonerLevel < 0 || tonerLevel > 100) {
        // this.tonerLevel = -1;
        // } else {
        // this.tonerLevel = tonerLevel;
        // }
        // better more efficient to use turnery operator, however the if-else statement
        // above is viable
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 0) ? tonerLevel : -1;
        // this.pagesPrinted = pagesPrinted;
        // we leave pages printed out of the constructor since it is only going to be
        // used in this class
        // we also don't need to set it to 0 because that is the default value. but can
        // be specified for clarity.
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    // methods:
    public int addToner(int tonerAmount) {
        // need this tempAmount in order to accomadate any errors from adding say 15% to
        // 90% below.
        // however i don't think this is realistic in terms of a real world example.
        // there should be another function for adding
        // toner.

        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 0 || tempAmount < 0) {
            return -1;
        }
        return tonerLevel += tonerAmount;
    }

    public int printPages(int pages) {
        // this was on the right path but a turnery operator would be more efficient
        // if (duplex) {
        // System.out.println("This is a duplex printer");
        // pagesPrinted = pages / 2;
        // System.out.println("The number of pages printed is: " + pagesPrinted);
        // } else {
        // pagesPrinted = pages;
        // System.out.println("The number of pages printed is: " + pagesPrinted);
        // }

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages; // need the pages %2 because if its an odd number
                                                                     // there will be an additional page
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
