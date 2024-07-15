/*
 * In this challange, you'll read 5 valid numbers from the console entered by the user
 *  and print the sum of those 5 numbers.
 * 
 * You need to check that the numbers are valid integers
 *      -> If they aren't print a message that reads "Invalid number" to the console
 *           but continue looping until  you do have 5 valid numbers.
 * 
 * Before the user enters each number, prompt them with the message, " enter number #x:"
 * where x represents the count 1,2,3 etc.
 * 
 * As an example the first message would look like " Enter number #1: " 
 *      the next "Enter number #2: " and so on.
 * 
 * use a while or do while plus scanner and next line method.
 * 
 */

package sec73_ReadingUserInputChallange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        // int sum = 0;
        double sum = 0;


        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                // int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }


        System.out.println("The sum of the 5 numbers = " + sum);

    }
}

//in case i want to do it as a do while loop
/*
 *         do {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                // int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
                while(counter <= 5);
        }

        
        System.out.println("The sum of the 5 numbers = " + sum);

 */