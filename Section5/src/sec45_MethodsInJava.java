// public class sec45_MethodsInJava {
//     public static void main(String[] args) {

        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;

        // // int finalScore = score;
        // calculateScore( true, 800, levelCompleted, bonus);
       
       
        // new paramters
        // score = 10000;
        // levelCompleted = 8;
        // bonus = 200;
        // finalScore = score;

        // finalScore = score;
        // if (gameOver) {
        //     finalScore += (levelCompleted * bonus);

        //     System.out.println("Your final Score was " + finalScore);
        // }

    // }

    // public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;

    //     int finalScore = score;
    //     if (gameOver) {
    //         finalScore += (levelCompleted * bonus);
    //         finalScore +=1000;
    //         System.out.println("Your final Score was " + finalScore);
    //     }
    // }

/////cleaning the code up above down below


/////////////////////////////////////////////////////////////////////////////////////////
// public class sec45_MethodsInJava {
//     public static void main(String[] args) {

//         boolean gameOver = true;
//         int score = 800;
//         int levelCompleted = 5;
//         int bonus = 100;

// int highScore = calculateScore(gameOver, score, levelCompleted, bonus); //should delete the variables above and enter the values here to simplify code, just want to show this as an example 
// System.out.println("The HighScore is " + highScore);

// calculateScore(true, 10000, 8, 200);
//     }
// public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//     int finalScore = score;
//     if (gameOver) {
//         finalScore += (levelCompleted * bonus);
//         finalScore +=1000;
        
//     }
//     return finalScore;
// }
/////////////////////////////////////////////////////////////////////////////////////////////////


//method structure with parameters and return type

//I figured out my error. I had put another method within the main method. That method should have been out side of the public static void main's curly brackets

public class sec45_MethodsInJava {
    public static void main(String[] args) {
int dOB= 1986;
int myAgeIs = calcMyAge(dOB);
System.out.println("My age is " + myAgeIs);
    }
    

public static int calcMyAge(int dateOfBirth){
    int myAge = (2024 - dateOfBirth);
    return myAge;
}

}


