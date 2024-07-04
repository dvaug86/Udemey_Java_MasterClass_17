/*
 * create a method of time from seconds into hours
 * display remaining time of minutes and seoncds in a string
 *  -create 2 methods with same name: getDurationString
 *      -first method has  one parameter of type int named seconds  
 *      -second method has 2 paramters named minutes and seonds both ints
 *  -both methods return a string in the format shown 'XXh YYm ZZs'
 * 
 * this is here XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds
 * -the first method should in turn call the second method to return its results
 * 
 * Bonus: add validation. 
 *  -first method: seconds method should be >= 0
 *  - second mehtod minutes should be >=0 and <=59 and same for seconds
 * -if it is invalid a message should be displayed
 */

public class sec53_SecondsAndMinutesChallange {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(int seconds) {

        // 2 step approach
        if(seconds < 0){ 
            return "Invalid data for seconds (" + seconds + "), must be a positive integer value";
        }
        int minutes = seconds / 60;
        // int hours = minutes / 60;
        // System.out.println("hours= " + hours);

        // int remainingMinutes = minutes % 60;
        // System.out.println("minutes = " + minutes);
        // System.out.println("remaining minutes = " + remainingMinutes);

        // int remainingSeconds = seconds % 60;
        // System.out.println("remainng seconds= " + remainingSeconds);

        // 1 step approach
        // int hours1 = seconds / 3600;
        // System.out.println("hours1: " + hours1);

        // return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

        //to eliminate a lot of this code which can be considered redundant we will do the overload method.
        return getDurationString(minutes, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
    
        if(minutes < 0){ 
            return "Invalid data for minutes (" + minutes + "), must be a positive integer value";
        }
        if  (seconds < 0 || seconds >59){
return "invalid data for seconds";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;


        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}
