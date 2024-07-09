/*
 * Number Palindrome
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false. 

Check the tips below for more info about palindromes.

Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.

Tip: Logic to check a palindrome number

Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse. 

If both are the the same then the number is a palindrome otherwise it is not.

Tip: Logic to reverse a number

Declare and initialize another variable to store the reverse of a number, for example reverse = 0. 

Extract the last digit of the given number by performing the modulo division (remainder). 
Store the last digit to some variable say lastDigit = num % 10. 
Increase the place value of reverse by one.
To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse. 
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10. 
Repeat steps until number is not equal to (or greater than) zero. 

A while loop would be good for this coding exercise.



Tip: Be careful with negative numbers. They can also be palindrome numbers.

Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).


 */

package CodingExercises;

public class CE16_NumberPalindrome {
    public static void main(String[] args) {
System.out.println("number = -1221 therefore it is" +isPalindrome(-1221));
System.out.println("number = 707 therefore it is" +isPalindrome(707));
System.out.println("number = 11212 therefore it is" +isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = number * (-1);
        }
        int reverse = 0;
        int original =number;  //i did not take into consideration that the while loop would be changing the number.
        while (original > 0) {
            reverse = reverse*10;
            int lastDigit =original % 10;
            reverse = reverse + lastDigit;
            original = original / 10;
        }
        
if(number ==reverse){
    return true;
}
return false;
    }
}

/*
 * answer key:
 * 
public class NumberPalindrome {
 
    public static boolean isPalindrome(int number) {
        
        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }
}


The isPalindrome method is designed to determine if a given number is a palindrome. 
A palindrome is a number that reads the same forwards and backwards, like 121 or 1331.


Initialization:

Declare two integer variables: reverse and original.

Initialize both variables with the given number. For example, if the number is 121, original and reverse will both start as 121.

Loop Setup:

The while loop will continue executing as long as original is not 0. 
This is because we're gradually breaking down the number into its digits during each iteration of the loop.

Loop Execution:

Inside the loop, we perform the following steps repeatedly until original becomes 0:

Extract the Last Digit:

Calculate the last digit of the original number using original % 10. 
This operation gives us the remainder when original is divided by 10, which is the last digit of the number.

Building the Reversed Number:

Multiply the current value of reverse by 10. This makes space for the next digit we're going to add.

Add the last digit obtained in the previous step to reverse. This effectively adds the last digit to the reversed number.

Update original:

Update the original number by removing its last digit. This is done by dividing original by 10 (original /= 10).

Loop Continuation:

After each iteration of the loop, original becomes smaller because its last digit has been removed.

The loop continues as long as there are digits left in the original number.

Loop Termination:

When the original number becomes 0 (all digits have been processed), the loop stops.

Comparison:

Once the loop ends, the reverse number contains the digits of the original number in reverse order.

Compare the reverse number with the original number. If they are equal, it means the number is a palindrome.

In summary, the while loop breaks down the original number into its digits, constructs the reverse of the number, 
and then compares the reversed number with the original number to determine if it's a palindrome. This process effectively checks if the number reads the same forwards and backwards.
 */