/*
 * Barking Dog
We have a dog that likes to bark.  We need to wake up if the dog is barking at night!

Write a method shouldWakeUp that has 2 parameters.

1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

In all other cases return false.

If the hourOfDay parameter is less than 0 or greater than 23 return false.
TIP: Use the if else statement with multiple conditions.

NOTE: The shouldWakeUp method  needs to be defined as public static ​like we have been doing so far in the course.

NOTE: Do not add a  main method to solution code.

 */


public class CodingExercise4_BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
       shouldWakeUp(true, -1); 
    }

    // public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        
    //     if ((hourOfDay < 0) || (hourOfDay > 23)) {
    //         return false;
    //     }  if (barking = true && ((hourOfDay < 0) && (hourOfDay < 23))) { //ithink this is where  I erred. I wasn't wrong on logic the whole time just need to realize what is 0 and 1
    //         return false;
    //     }
    //     return true;
        
    // }
  
//here is the correct and slimmed down version 

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        
        // if the hourOfDay is less than 0 or greater than 23, it's not
         // valid, so return false
         if (hourOfDay < 0 || hourOfDay > 23) {
             return false;
         }
         // if the dog is barking, and it's before 8am or after 10pm,
         // then you should wake up.
         return barking && (hourOfDay < 8 || hourOfDay > 22);
     }
     }
    // final test i think
    // if ((hourOfDay < 0) || (hourOfDay > 23)) {
    //     return false;
    // }else if(barking = false){
    //     return false;
    
    // } else if (barking = true && ((hourOfDay >= 8) && (hourOfDay <= 22))) {
    //     return false;
    // }
// }

//i t
//close
//   if ((hourOfDay < 0) || (hourOfDay > 23)) {
//     return false;
// } else if (barking = true && ((hourOfDay >= 8) && (hourOfDay <= 22))) {
//     return false;
// }
// return true;
/*
 *  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        
       // if the hourOfDay is less than 0 or greater than 23, it's not
        // valid, so return false
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        // if the dog is barking, and it's before 8am or after 10pm,
        // then you should wake up.
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
 */





// failed attempt 1
// public static void shouldWakeUp(boolean barking, int hourOfDay){
// boolean wakeUp = true;
// if((barking = true) && ((hourOfDay >= 8) || (hourOfDay <= 22) || (hourOfDay
// <0) || (hourOfDay >23))){
// wakeUp = false;
// System.out.println(wakeUp);
// }
// System.out.println(wakeUp);