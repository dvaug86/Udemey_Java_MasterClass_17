/*
 * DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
 */

public class CodingExercise6_DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1756, 3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        numOne = (long) (Math.round(numOne * 1000)) ;
        numTwo = (long) (Math.round(numTwo * 1000));
System.out.println(numOne);
System.out.println(numTwo);
        if ((numOne - numTwo) != 0) {
            return false;
        } else {
            return true;
        }
    }
}
