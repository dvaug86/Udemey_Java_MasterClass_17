/*
 * DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
 */

public class CodingExercise6_DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1756, 3.175);
    }
//failed first attempt
//     public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
//         numOne = (long) (Math.round(numOne * 1000)) ;
//         numTwo = (long) (Math.round(numTwo * 1000));
// System.out.println(numOne);
// System.out.println(numTwo);
//         if ((numOne - numTwo) != 0) {
//             return false;
//         } else {
//             return true;
//         }
//     }



public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
    long numOneB = (long) (numOne* 1000);
    long numTwoB = (long) (numTwo * 1000);

     return numOneB ==numTwoB;
 }
//this guy works because it is converting an decimal into an integer. it is either going to move the double's decimal
//three places down or add 0s for the remainder and get rid of whatever remaining decimal places are left.
//this saves us from doing the math.round and the complexities that come from that.

}
