/*
 * Create a method called printDayOfWeek, that takes an int parameter called day dut doesn't return any values
 * Use the enhanced switch statement to return the name of the day based on the parameter passed to the switch statment so that 0 will return sunday
 * 1 will retun Monday and so on.
 * Any number not between 0and 6 should return inalid day
 * 
 * Bonus: Create a second method called printWeekDay, that uses an if then else statement instead of a swich to produce the same output
 */




package sec59_SwitchExpressionChallange;

public class Main {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        System.out.println("");
        
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);



    }
    public static void printDayOfWeek(int day){
       
        String dayofWeek = switch(day){
            case 0 -> "Sunday";
            case 1-> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            default -> "Invalid day";
            
        }; //remember semicolon after
        System.out.println(day + " stands for " + dayofWeek );
    }
    public static void printWeekDay(int day){

        String dayOfWeek = "Invalid Day";
        if (day == 0 ){
            dayOfWeek = "sunday";
        }else if (day ==1){
            dayOfWeek = "monday";
        }else if (day ==2){
            dayOfWeek = "tuesday";
        }else if (day ==3){
            dayOfWeek = "wednesday";
        }else if (day ==4){
            dayOfWeek = "thursday";
        }else if (day ==5){
            dayOfWeek = "friday";
        }else if (day ==6){
            dayOfWeek = "saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
