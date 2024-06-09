public class sec44_IfThenElseChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // new paramters
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int finalScore = score;
        if (gameOver) { // this is the same as if (gameOver == true)
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final Score was " + finalScore);

            // Challenge
            // Insert a code segment after the code above
            // *set the existing score variable to 10,000
            // *set the existing level completed to variable 8
            // * set the existing bonus variable to 200
            // * Use the same if condition meaning if game over is true then you want to
            // perform the calc and print
            // out the value of the finalscore variable

            // as i suspected this was an intro into the world of functions aka methods.
        }
    }

}