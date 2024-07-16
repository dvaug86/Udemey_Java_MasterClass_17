/*
 * Use an endless loop which:
 *      -> prompts the user to enter a number or any character to quit.
 *      -> Validates if the user-entered data really is a number.
 *              You can choose either an integer or double validation method.
 *      -> If the user-entered data is not a number, quit the loop.
 *      -> Keep track of the minimum number entered.
 *      -> Keep track of the maximum number entered.
 *      -> if the user has previously entered a set of numbers  (or even just one),
 *              display the min and max number that the user entered.
 *      
 */

package sec74_MinAndMaxChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // my try:

        // int min;
        // int max;
        // System.out.println("In order to exit enter a character or 999");
        // System.out.println("enter a number!");
        // String nextNumber = scanner.nextLine();

        // int number;
        // if ( number != 999) {
        // try {
        // number = Integer.parseInt(nextNumber);
        // min = number;
        // max = number;
        // if(number < min){
        // min = number;
        // System.out.println("the new min is: " + min);
        // }
        // if(number > max){
        // max= number;
        // System.out.println("the new max is: " + max);
        // }
        // } catch (NumberFormatException nfe) {
        // System.out.println("Goodbye");
        // }
        // }

        // answer key:
        double max = 0;
        double min = 0;
        int loopCount = 0; //only really necessary for the initiaztion.

        while (true) {
            System.out.println("In order to exit enter a character or number");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) { // checking loopcount == 0 is where i was lost. this allows us
                                                        // to set the first number enterd as min or max.
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break; // did not do this.
            }
        }
        if (loopCount > 0) {
            System.out.println("min = " +min+ ", max = " + max);
        } else{
            System.out.println("no valid data entered");
        }
        scanner.close();
    }
}
