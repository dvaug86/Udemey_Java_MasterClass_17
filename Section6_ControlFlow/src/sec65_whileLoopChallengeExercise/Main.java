package sec65_whileLoopChallengeExercise;

/*
* Step 1
 * create a method called isEvenNumber that has a parameter type int
 * its purpose is to determine if the argument passed to the method is an even number or not
 * return true if the method if its an even number
 * next use a while loop to test a range of numbers from 5 to including 20 but print out only the even numbers
 * 
 * Step 2
 * Modify the while code
 * Make it also record the total number of even numbers it has found
 * Break out of the loop once 5 even numbers are found
 * Finally display the total number of odd and even numbers found.
 */

public class Main {
    public static void main(String[] args) {
       
       //my code was incorrect here is correct code
       int number = 4;
       int finishNumber = 20;
        int evenCount =0;
        int oddCount =0;


       while(number <= finishNumber){
        number++; //you often want the increment first to avoid infinite loops. this is why it was set to 4
        if(!isEvenNumber(number)){
            oddCount++;
            continue; //remember continue skips...so here if it is not even it will continue back to the beginning and not print
        }
        System.out.println("even number " + number);
        evenCount++;
        if(evenCount >=5){
            break;
        }
       }
       System.out.println(evenCount + " even numbers");
       System.out.println(oddCount + " odd numbers");
    }
    public static boolean isEvenNumber( int number){
        return number % 2 == 0;
    }
}
