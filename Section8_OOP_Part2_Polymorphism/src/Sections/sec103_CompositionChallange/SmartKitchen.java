package Sections.sec103_CompositionChallange;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;
}

class CoffeeMaker {
    // fields
    private boolean hasWorkTodDo;

    public void setHasWorkTodDo(boolean hasWorkTodDo) {
        this.hasWorkTodDo = hasWorkTodDo;
    }

    public void brewCoffee() {
        if (hasWorkTodDo) {
            System.out.println("Brewing Coffee");
            hasWorkTodDo = false;
        }
    }

    class Refrigerator {
        // fields
        private boolean hasWorkTodDo;

        public void setHasWorkTodDo(boolean hasWorkTodDo) {
            this.hasWorkTodDo = hasWorkTodDo;
        }

        public void orderFood() {
            if (hasWorkTodDo) {
                System.out.println("Ordering Food");
                hasWorkTodDo = false;
            }
        }

    }

    class DishWasher {
        // fields
        private boolean hasWorkTodDo;

        public void setHasWorkTodDo(boolean hasWorkTodDo) {
            this.hasWorkTodDo = hasWorkTodDo;
        }

        public void doDishes() {
            if (hasWorkTodDo) {
                System.out.println("Washing Dishes");
                hasWorkTodDo = false;
            }
        }
    }
}