package sec65_whileLoopChallengeExercise;

/*
 * create a method called isEvenNumber that has a parameter type int
 * its purpose is to determine if the argument passed to the method is an even number or not
 * return true if the method if its an even number
 * next use a while loop to test a range of numbers from 5 to including 20 but print out only the even numbers
 */

public class Main {
    public static void main(String[] args) {
       
       //my code was incorrect here is correct code
       int number = 4;
       int finishNumber = 20;

       while(number <= finishNumber){
        number++; //you often want the increment first to avoid infinite loops. this is why it was set to 4
        if(!isEvenNumber(number)){
            continue; //remember continue skips...so here if it is not even it will continue back to the beginning and not print
        }
        System.out.println("even number " + number);
       }
    }
    public static boolean isEvenNumber( int number){
        return number % 2 == 0;
    }
}
