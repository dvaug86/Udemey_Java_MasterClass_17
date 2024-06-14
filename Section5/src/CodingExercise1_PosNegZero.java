/*Write a method called checkNumber with an int parameter named number.
    The method should not return any value and it needs to print out:
    the mthod should not return any value and needs to print out:
     positive  if the number is >0
     negative if the parameter is <0
     zero if the number is = 0

*/
public class CodingExercise1_PosNegZero {

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

}
// another more effecient code is as follows:

/*
 * public class CodingExercise1_PosNegZero {
 * 
 * public static void checkNumber(int number) {
 * System.out.println((number>0) ? "positive" : ((nmber<0) ? "negative" :
 * "zero"))
 * }
 * }
 */