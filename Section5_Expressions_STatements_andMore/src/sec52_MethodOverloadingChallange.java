/*
 * Create 2 methods with the same name: convertToCentimeters
 * The first method has 1 parameter of type int, which reps the entire height in inches. You'll convert inches to centimeters.
 *      In this method and pass back the number of centimeters as a double
 * The second method has 2 paramters of type int, one to rep height in feet and one to rep the remaining height in inches 
 *      this method will convert feet and inches to just inches then call the first method to get the number of centimeters
 *       also returning the value as a double.
 * The conversion formula from inches to centimeters is 1 inch = 2.54 cm
 */

public class sec52_MethodOverloadingChallange {
    public static void main(String[] args) {
        convertToCentimeters(68);
        convertToCentimeters(5, 5);
        convertToCentimeters(5, 0);
    }

    public static Double convertToCentimeters(int inches) {
        Double newHeight = (double) inches * 2.54; //this isn't necessary i could just do return inches * 2.54;
        System.out.println("The person's height in inches is " + inches + "inches. Their height in cms is " + newHeight
                + " centimetrs");
        return newHeight;
    }

    public static Double convertToCentimeters(int feet, int inches2) {
        int heightInInches = ((12 * feet) + inches2);
        double newHeight = convertToCentimeters(heightInInches);
        System.out.println("new height from conversion is " + newHeight);
        return newHeight;
    }
}

///efficient way to code
/*
 *  public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        // return convertToCentimeters((feet * 12) + inches);
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
 */