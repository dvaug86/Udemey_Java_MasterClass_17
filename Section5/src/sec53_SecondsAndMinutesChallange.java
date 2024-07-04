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
 */

public class sec53_SecondsAndMinutesChallange {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int seconds) {
        int hours = seconds / 3600;
       System.out.println("hours: " +hours);
        return ""; 

    }

    public static String getDurationString(int minutes, int seconds) {
        return "";
    }
}
