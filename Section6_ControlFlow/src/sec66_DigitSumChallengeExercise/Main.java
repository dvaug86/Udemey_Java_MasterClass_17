package sec66_DigitSumChallengeExercise;

/*
 * In this challenge your task is to write a method with the name sumDigits that has a single parameter named number of type int and should return an int.
 *      -> the method should only take a number that is a positive number.
 *     
 *       -> if a negative number is passed it should return a -1 meaning an invalid value was passed.
 *  
 *      -> the method should parse out each digit from the number and sum the digits up.
 * 
 *      -> so for 125 it should be 1+2+5=8
 * 
 */


public class Main {
    public static void main(String[] args) {
      System.out.println(sumDigits(125));  
    }
    public static int sumDigits(int number){
        if(number <0){
            return -1;
        }
        int sum =0;
        while(number >1){
            int digit = number %10;
            sum += digit;
        }
        return sum;
    }
}
