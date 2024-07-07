/* a prime number is a number that can't be broken down by other whole numbers i.e. 2, 3, 5 and 7
 * 
 * new challange 
 * create a prime number counter variable that will keep count of how many prime numbers were found
 * create a for statement using any range of numbers where the max number is <=1000
 * 
 * for each number in the range:
 *  -> check to see if it's a prime number using the isPrime method
 *  -> if the number is prime, print out and increment prime number counter variable.
 *  -> once the prime number counter equals 3 exit the loop (hint use the break statement to exit.)
 * 
*/

package sec61_TheForStatementChallange;

public class Main {
    public static void main(String[] args) {

        // System.out.println("0 is" + (isPrime(0) ? "" : " NOT") + " a prime number");
        // System.out.println("0 is" + (isPrime(1) ? "" : " NOT") + " a prime number");
        // System.out.println("0 is" + (isPrime(2) ? "" : " NOT") + " a prime number");
        // System.out.println("0 is" + (isPrime(3) ? "" : " NOT") + " a prime number");

        // System.out.println("8 is" + (isPrime(8) ? "" : " NOT") + " a prime number");
        // System.out.println("17 is" + (isPrime(17) ? "" : " NOT") + " a prime
        // number");

        // my incorrect code but after the first line the video showed me I saw the
        // error of my ways.

        // for (int i = 1; i < 10; i++) {
        // int primeCounter = 1;
        // isPrime(i);
        // if (primeCounter == 3) {
        // break;
        // }
        // if (isPrime(i) == true) {
        // System.out.println(i + " is a prime number");
        // System.out.println("prime counter is: " + primeCounter);

        // }

        // correct code basic:
        int count = 0;
        // for (int i = 10; i <= 50; i++) {
        //     if (isPrime(i)) {
        //         System.out.println("number " + i + " is a prime number");
        //         count++;
        //         if(count == 3) {
        //             System.out.println("Found 3 primes - exitint for loop");
        //             break;
        //         }
        //     }
        // }
//more efficient code: 
for (int i = 10; count < 3 && i <=50; i++){
    if(isPrime(i)){
        System.out.println("number " +i+ " is a prime number");
        count++;
    }
}
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) { // we divide by 2 because if half the whole
                                                                       // number can be divided by 2 then the whole
                                                                       // number will also be divisible by 2...
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;

    }
}
