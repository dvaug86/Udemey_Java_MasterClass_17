public class sec43_CodeBlocks_IfElse {
    public static void main(String[] args) {
         boolean gameOver = true;
         int score = 600;
        //  int score = 4000;
        //  int score = 5000;
         int levelCompleted = 5;
         int bonus = 100;

         if ((score < 5000) && (score > 1000)){
            System.out.println("Your score is less than 5000 but greater than 1000 ");
         }else if (score <1000) { //can have as many else if statements as necessary
            System.out.println("Your score is less than 1000");
         }else{
            System.out.println("got here");
         }
    }
    
}
