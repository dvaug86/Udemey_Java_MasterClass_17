//In this challenge I'm to create 2 methods:
// The first method should be named displayHighScorePosition
//this will have 2 parameters
// -> players name
// -> players position in a highscore list
//this method should print a message like "Tim managed to get into position 2 on the highscore list"

//The second method should be named calculateHighScore Position
//this method should only have 1 parameter, the player's score
// this method should return a number between 1 and 4 based on the score values shown in this table
//-> score greater than 1000 = result 1
//-> score greater than or equal to 500 but less than 1000 = result 2
//-> score greater than or equal to  100 but less than 500 = result 3
//-> all other scores = result 4

//finally we'll call both methods and display the results for the following scores 1500, 1000, 500, 100, 25

public class sec46_MethodChallange {
    public static void main(String[] args) {

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        playerPosition =  scorePosition;
        calculateHighScore(scorePosition)
        System.out.println(playerName + " managed to get into position " + playerPosition + "on the highscore list");
    }

    public static int calculateHighScore(int scorePosition) {
        int position;
        if (scorePosition > 1000) {
            position = 1;
        } else if (scorePosition >= 500 && scorePosition < 1000) {
            position = 2;
        } else if (scorePosition >= 100 && scorePosition < 500) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
