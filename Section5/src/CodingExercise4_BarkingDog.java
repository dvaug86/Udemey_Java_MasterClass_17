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