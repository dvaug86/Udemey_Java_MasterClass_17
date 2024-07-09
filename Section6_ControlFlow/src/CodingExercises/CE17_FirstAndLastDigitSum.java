


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
        int lastDigit = number /10;
        int firstDigit = 0;
        
        while(number > 9){
            firstDigit = number /10;
        }
return  firstDigit+ lastDigit;
        
    }
}
