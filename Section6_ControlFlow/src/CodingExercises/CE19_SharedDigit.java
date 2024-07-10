/*
 * 
 * Shared Digit
Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.



EXAMPLE INPUT/OUTPUT:

hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * 
 */

package CodingExercises;

public class CE19_SharedDigit {
    public static void main(String[] args) {

        System.out.println(" the numbers 12, and 23 is: " + hasSharedDigit(12, 23));
        System.out.println(" the numbers 9, and 99 is: " + hasSharedDigit(9, 299));
        System.out.println(" the numbers 15, and 55 is: " + hasSharedDigit(15, 55));
        System.out.println(" the numbers 12, and 13 is: " + hasSharedDigit(12, 23));
        System.out.println(" the numbers 999, and 891 is: " + hasSharedDigit(999, 891));
    }

    // need to set up a while loop with in a while loop: while num 1 is running
    // through each digit
    // a second while loop takes each digit in num2 and compares to num 1

    public static boolean hasSharedDigit(int num1, int num2) {
        if (((num1 < 10) || (num1 > 9999)) || ((num2 < 10) || (num2 > 9999))) {
            return false;
        }
        while (num1 > 0) {
            int newNum1 = num1 % 10;
            while (num2 > 0) {
                int newNum2 = num2 % 10;
                if (newNum2 == newNum1) {
                    return true;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
        }
        if(num2 == num1){ //this allows me to compare the last 2 numbers if the number is larger than 2 digits;
            return true;
        }
        return false;
    }
}

/*
 * I can't see why my code here on VScode worked perfectly where as on Udemys enviroment it is coming up as
 * false when comparing 12 and 13.
 * One thing is for certain is that I was way too focused on the while loops and didn't think about the simplicity
 * of the answer they provided as seen below. it was only going to be 2 digits so finding left and right digits is simple.
 *My code however will allow numbers larger than 2 digits to be compared.
 * 
 * Below is the answer key
 * public class SharedDigit {
 
    public static boolean hasSharedDigit(int first, int second) {
        
        boolean firstValid = first > 9 && first < 100;
        boolean secondValid = second > 9 && second < 100;
 
        if (!firstValid || !secondValid) {
            return false;
        }
 
        int firstLeftDigit = first / 10;
        int firstRightDigit = first % 10;
        int secondLeftDigit = second / 10;
        int secondRightDigit = second % 10;
 
        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;
 
        return firstShared || secondShared;
    }
}

 */