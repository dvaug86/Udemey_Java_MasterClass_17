public class CodingExercise4_BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true,1);
        shouldWakeUp(false,2);
        shouldWakeUp(true,8);
        shouldWakeUp(true,-1);
    }
    public static void shouldWakeUp(boolean barking, int hourOfDay){
       boolean wakeUp = true;
        if((barking = true) && ((hourOfDay >= 8) || (hourOfDay <= 22) || (hourOfDay <0) || (hourOfDay >23))){
            wakeUp = false;
            System.out.println(wakeUp);
        }
        System.out.println(wakeUp);
    }
    
}
