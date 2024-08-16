/*
 * Exercise instructions
 * In this challange I'll be creating an app for controlling a smart kitchen
 * the kitchen has several appliances
 *  
 * class
 * ---------
 * Smart kitchen
 * _______________
 * fields:
 * --------
 * brewMaster:CoffeeMaker
 * dishwasher: DishWasher
 * icebox: Refrigerator
 * =========================
 * methods:
 * ------------
 * addWater()
 * pourMilk()
 * loadDishwasher()
 * setKitchenState(boolean, boolean, boolean)
 * do kitchen work
 * _____________________________________________________
 * SubClasses
 * _________________________________________________________
 *          Refrigerator
 *          field: hasworkToDo: boolean
 *          method: order food
 * =======================================
 *          DishWasher
 *          field: hasWorkToDo:boolean
 *          method: doDishes()
 * =======================================
 *          CoffeeMaker
 *          field: hasWorkToDo: boolean
 *          brewCoffee()
 * _________________________________________________________________
 * 
 * addWater() will set the coffee maker's hasWorkToDo field to true
 * pourMilk() will set the Refrigerator's hasWorkTodDo to true
 * loadDishwasher() will set the hasWorkToDo flag to true for that appliance.
 * 
 * Alternately, you could have a single method called setKitchenState 
 * that takes three boolean values, which would set each appliance accordingly
 * 
 * To execute the work needed to be done by the appliances, you'll implement this in two ways:
 *      1. your application will access each appliance by using a getter and execute e amethod
 *          -The apliance methods are orderFood() on refrigerator, doDishes() on dishWasher, 
 *              and brewCoffee( ) on CoffeeMaker.
 * 
 *          -these methods should check the hasWorkToDo flag and if true, print a message out indicating what work is being done
 * 
 *      2. Second your application  won't acccess the appliances directly
 *          -It should call doKitchenWork(), which delegates the work to any of its appliances
 * 
 *      
 * 
 * 
 * 
 * 
 * 
 */


package Sections.sec103_CompositionChallange;

public class Main {
    public static void main(String[] args) {
        
    }
}
