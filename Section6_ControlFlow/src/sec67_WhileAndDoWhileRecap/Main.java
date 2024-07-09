package sec67_WhileAndDoWhileRecap;

public class Main {
    public static void main(String[] args) {
        int number = 0;

        // remember the while loop checks the condition at the start!
        while( number < 15){
            number++;
            if (number <=5){
                System.out.println(" skipping number " + number);
                continue;
            }
            System.out.println("number = " + number);

            if(number >=10){
                System.out.println("Breaking at " + number);
                break;
            }
        }
    }
}
