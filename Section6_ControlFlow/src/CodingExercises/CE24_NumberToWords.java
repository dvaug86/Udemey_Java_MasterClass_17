/*
 * Number To Words
Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print "Invalid Value".

To print the number as words, follow these steps:

Extract the last digit of the given number using the remainder operator. 

Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. 
Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.

Remove the last digit from the number.

Repeat Steps 2 through 4 until the number is 0.

The logic above is correct, but in its current state, the words will be printed in reverse order. 
For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". 
To overcome this problem, write a second method called reverse.

The method reverse should have one int parameter and return the reversed number (int). 
For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.

Use the method reverse within the method numberToWords in order to print the words in the correct order.

Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). 
The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". 
To solve this problem, write a third method called getDigitCount. 

The method getDigitCount should have one int parameter called number and return the count of the digits in that number. 
If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

Example Input/Output - getDigitCount method

getDigitCount(0); should return 1 since there is only 1 digit

getDigitCount(123); should return 3

getDigitCount(-12); should return -1 since the parameter is negative

getDigitCount(5200); should return 4 since there are 4 digits in the number

Example Input/Output - reverse method

reverse(-121); should  return -121

reverse(1212); should return  2121

reverse(1234); should return 4321

reverse(100); should return 1

Example Input/Output - numberToWords method

numberToWords(123); should print "One Two Three".

numberToWords(1010); should print "One Zero One Zero".

numberToWords(1000); should print "One Zero Zero Zero".

numberToWords(-12); should print "Invalid Value" since the parameter is negative.



HINT: Use a for loop to print zeroes after reversing the number. 
As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the reversed number. 
 */

package CodingExercises;

public class CE24_NumberToWords {
    public static void main(String[] args) {
        // numberToWords(400);
        getDigitCount(400);
    }

    // public static int reverse(int number) {
    // int reverseNumber = 0;
    // int remainder = 0;
    // while (number > 0) {
    // remainder = number % 10;
    // reverseNumber += remainder;
    // reverseNumber = reverseNumber * 10;
    // number = number / 10;
    // }
    // return reverseNumber;
    // }

    // public static int getDigitCount(int number){
    // int count =0;

    // if (number < 0) {
    // return -1;
    // }
    // if (number ==0){
    // return 1;
    // }

    // }

    // public static void numberToWords(int number) {
    // if (number < 0) {
    // System.out.println("Invalid Value");
    // }
    // int indNum = number;
    // for (int i = number; i > 0; i /= 10) {
    // indNum = number % 10;
    // String numberWord = switch (indNum) {
    // case 0 -> "ZERO";
    // case 1 -> "ONE";
    // case 2 -> "TWO";
    // case 3 -> "THREE";
    // case 4 -> "FOUR";
    // case 5 -> "FIVE";
    // case 6 -> "SIX";
    // case 7 -> "SEVEN";
    // case 8 -> "EIGHT";
    // case 9 -> "NINE";
    // default -> "OTHER";

    // }; // remember semicolon after
    // System.out.println(numberWord);
    // }

    // I was way pretty far off on this one. I understand the answer. Instead of
    // copying and pasting the answer I am
    // typing it out so that I can really absorb it and adding my notes to it.

    public static int reverse(int number) {

        //first we need to create a reverse method. This is because if we were to dive straight in and not initially reverse the number our answer would be reversed.
        //123 by logic would be read as three two one. This is because the logic reads the number right to left.
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10); //this adds a ones tens hundreds place etc. and adds the the remainder of the number when modulus 10 is done to it.
            number /= 10; //moves removes the ones digit for each number so that we have something new to add to the new ones digit of the reverse.
        }
        return reverse;
    }


    //the digit count method is created just incase there is trailing 0s in the 
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) { 
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= number; i *= 10) {
            count++;
            //this gives you a digit count.
        }
        return count;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int reverse = reverse(number);

        //here we know how many digits the normal number has.  for instance 400 would give a count of 3 
        //but the reverse of that is 004 or just 4. this would give a count of 1 which we will apply way below. 
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        //we have this just in case the actual number is 0
        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        //here we go through each ones digit and move the decimal along until we hit the leading zeros
        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse /= 10;
        }
//once we hit the leading zeros this is where this code block below comes in.
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }

}
