/*
 * Sum Odd
Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.

Check that number is > 0, if it is not return false.

If number is odd return true, otherwise return false.

Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.

The method should use a for loop to sum all odd numbers in that range including the end and return the sum.

It should call the method isOdd to check if each number is odd.

The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.

If those conditions are not satisfied return -1 from the method to indicate invalid input.
 */

package CodingExercises;

//My screw up here was after so many times of trying to find even I screwed up on what should have been the 
//easier part of the isOdd method.
//Need to remember festina lente

public class CE15_SumOdd {
    public static void main(String[] args) {
sumOdd(1,100);
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
    return false;
       
    // return number > 0 && number % 2 !=0;  This is a more efficient way 
    }

    public static int sumOdd(int start, int end) {
        if (((start <0) || (end < 0)) || (start > end)) {
            return -1;
        }
        int sumOfMatches = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)==true) { //having == true is unnecessary
                sumOfMatches += i;
            }
            
        }
        System.out.println(sumOfMatches);
        return sumOfMatches;
    }
}
