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
      System.out.println(sumDigits(1234));  
      System.out.println(sumDigits(-125));  
      System.out.println(sumDigits(4));  
      System.out.println(sumDigits(32123));  
    }
    public static int sumDigits(int number){
        if(number <0){
            return -1;
        }
        int sum =0;
        while(number >9){  //we do this so that when it is more than 1 digit. if it is a single digit it skips the while loop
             sum += number %10;
            number = number /10; 
            //forgot about the fact that number/10is will take off the last digit each time.
            //  this will make it 125/10 = 12.5 rounded to 12 then 12/10 = 1.2 thus 1 .
        }
        sum+= number; // this adds the final number to the sum if it is more than 1 digit. or it just takes the final digit.
        return sum;
    }
}
