


package CodingExercises;

public class CE17_FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println("the  first and last digit sum of 252 is " + sumFirstAndLastDigit(252));
        System.out.println("the  first and last digit sum of 257 is " + sumFirstAndLastDigit(257));
        System.out.println("the  first and last digit sum of 0 is " + sumFirstAndLastDigit(0));
        System.out.println("the  first and last digit sum of 5 is " + sumFirstAndLastDigit(5));
        System.out.println("the  first and last digit sum of -10 is " + sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        int lastDigit = number % 10;
        int firstDigit =number;
        if(number < 0){
            return -1;
        }
       
        
        while(firstDigit > 9){
            // firstDigit = firstDigit% 10;
            firstDigit =firstDigit /10;
            
        }
        System.out.println("last digit = " + lastDigit + " first digit = " +firstDigit);
return  firstDigit + lastDigit;
        
    }
}

/*
 * answer key
 * public class FirstLastDigitSum {
 
    public static int sumFirstAndLastDigit(int number) {
        
        if (number < 0) {
            return -1;
        }
 
        int lastDigit = number % 10;  // use % 10 to get last digit in a number.
        while (number >= 10) {
            number /= 10;  // divide with 10 until there is 1 digit left (< 10) to get first digit.  This is also equivalent to number = number / 10.
        }
 
        int firstDigit = number; // this is not necessary, but this makes it clear that number is now the first digit.
        return firstDigit + lastDigit;
    }
}
 */