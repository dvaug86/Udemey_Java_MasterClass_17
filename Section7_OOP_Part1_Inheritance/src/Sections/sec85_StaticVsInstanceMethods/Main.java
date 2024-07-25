package Sections.sec85_StaticVsInstanceMethods;

public class Main {
    public static void main(String[] args) {
        Calculator.printSum(5, 10);
        printHello(); //shorter form of Main.printHello

        /*
         * Static Methods are called as ClassName.methodName(); or
         * methodName(); only if in the same class which is why  method has calcultor. since its in a different class
         * and why we don't have main.printHello 
         */
          //instance methods
        Dog rex = new Dog(); //create instance
        rex.bark(); //call instance method
    
    }
    public static void printHello(){
        System.out.println("Hello");
}
        
}
