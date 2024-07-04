public class sec51_MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        // calculateScore(100, 100); broken because this method for 2 needs a string first 
        // calculateScore(75, 54, 66); this one shows up broken because we don't have a calculateScore method with 3 parameters
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
    // public static void calculateScore() {  
    //     System.out.println("No player name, no player score");
    // }
// }
//This doesn't work because its a different method with same name but different because of the void vs int
}
