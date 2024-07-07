/* 
 * Create a for loop using a range of numbers from 1 to 1000 inclusive.
 * Sum all the numbers that can be divided by both 3 and 5
 * Print out the numbers that have met the above conditions
 * Break out the loop once you have found 5 numberst that met the conditions above
 * After breaking out the loop print the sum of the numbers that met the conditions above
 */



package sec62_Sum3and5Challange;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i<=1000 && count <5; i++){
            if(i %3 ==0){
                if( i % 5 == 0){
                    System.out.println(i + "is divisible by 3 and 5");
                }
                i+=i;
            }
            count++;
            System.out.println("the sum of numbers is" +i);
        }
        
    }
}
