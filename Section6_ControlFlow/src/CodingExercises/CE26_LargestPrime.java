// Largest Prime
// Write a method named getLargestPrime with one parameter of type int named number. 

// If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.

// The method should calculate the largest prime factor of a given number and return it.

// EXAMPLE INPUT/OUTPUT:

// getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

// getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

// getLargestPrime (0); should return -1 since 0 does not have any prime numbers

// getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

// getLargestPrime (-1); should return -1 since the parameter is negative

// HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

package CodingExercises;

public class CE26_LargestPrime {
    public static void main(String[] args) {
        getLargestPrime(20);
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int factor = -1; // we choose -1 here because that makes it false like above;

        for (int i = 2; i < (number ^ (1 / 2)); i++) {
            // int isFactor = number % i; this isn't necessary
            if (number % i != 0) {
                continue;
            }
            factor = i; // we now have a true factor which is i.
            while (number % i == 0) {
                number /= i; // here number now becomes what the number divided by the factor is.
            }
        }
        return number == 1 ? factor : number;
        // we get 1 because of the while loop.
        // in the instance of the plugged in 21
        // we get to the while loop where number(21) % i(3) ==0
        // we then have number = number(21) / i(3) =7
        //  number = 7
        // we repeat the while loop: 7 % 3 doesn't == 0 so we then move
        //      to the return statment. 
        //      since number doesn't == 1 we return the number which is 7
        // if something about this had been false factor would have given us -1 from earlier.
    }
}

// answer key:
/*
 * public static int getLargestPrime(int number) {
 * 
 * if (number < 2) {
 * return -1;
 * }
 * 
 * int factor = -1;
 * for (int i = 2; i * i <= number; i++) {
 * if (number % i != 0) {
 * continue;
 * }
 * factor = i;
 * while (number % i == 0) {
 * number /= i;
 * }
 * }
 * return number == 1 ? factor : number;
 * }
 */
