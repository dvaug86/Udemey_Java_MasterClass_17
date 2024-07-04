public class sec41_KeyWordsandExpressions {
    public static void main(String[] args) {
        // 1.609344 is the conversion factor for miles to km
        // double kilometers = (100 * 1.609344); // entire line is a valid statement

        int highScore = 50; // highScore = 50 is an expression
        if (highScore > 25) { // highscore > 25 is an expression
            // add bonus points
            highScore = 1000 + highScore; // this is 2 expressions in one line highscore = 1000 + highscore and
                                            // 1000 + highscore is another
        }

        int health = 100; //health =100 expression
        if ((health < 25) && (highScore >1000)){ // health < 25 and highScore >1000 are expressions
                                                //(health < 25) && (highScore >1000) is also an expression
            highScore = highScore -1000; // highScore -1000 and   highScore = highScore -1000 are expressions
        }

    }
}
