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
        int min;
        int max;
        System.out.println("In order to exit enter a character or 999");
        System.out.println("enter a number!");
        String nextNumber = scanner.nextLine();

        int number;
        if (  number != 999) {
            try {
                number = Integer.parseInt(nextNumber);
               min = number;
               max = number;
               if(number < min){
                min = number;
                System.out.println("the new min is: " + min);
               }
               if(number > max){
                max= number;
                System.out.println("the new max is: " + max);
               }
            } catch (NumberFormatException nfe) {
                System.out.println("Goodbye");
            }
        }
    }
}
