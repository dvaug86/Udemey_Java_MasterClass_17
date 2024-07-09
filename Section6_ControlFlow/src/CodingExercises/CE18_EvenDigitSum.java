/*
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * 
 * The method should return the sum of the even digits within the number.
 * 
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * 
 * EXAMPLE INPUT/OUTPUT:
 * 
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * 
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * 
 * getEvenDigitSum(-22); → should return -1 since the number is negative
 * 
  */

package CodingExercises;

public class CE18_EvenDigitSum {
    public static void main(String[] args) {
       System.out.println("the sum of even numbers for 123456789 = " + getEvenDigitSum(123456789)); 
       System.out.println("the sum of even numbers for 252 = " + getEvenDigitSum(252)); 
       System.out.println("the sum of even numbers for -22 = " + getEvenDigitSum(-22)); 
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while( number > 0){
            int newNumber = number % 10;
            if(newNumber % 2 == 0){
                sum +=newNumber;
            }
            number = number/10;
        }
        return sum;
    }

}


/*
Answer key 


 * public class EvenDigitSum {
 
    public static int getEvenDigitSum(int number) {
        
        if (number < 0) {
            return -1;
        }
 
        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }
 
        // == alternative using while loop ==
        // while (number > 0) {
        //     int lastDigit = number % 10;
        //     if (lastDigit % 2 == 0) {
        //         sum += lastDigit;
        //     }
        //     number /= 10;
        // }
        
        return sum;
    }
}
 */