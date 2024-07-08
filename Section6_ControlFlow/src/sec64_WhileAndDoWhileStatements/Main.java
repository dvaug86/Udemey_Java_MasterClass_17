package sec64_WhileAndDoWhileStatements;

public class Main {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(i);
        // }
        // int j = 1; // have to declare this before while loop. No space in the parenthesis for it
//this is basic while loop which you are better off doing as a for loop like above
        // while( j <=5){
        // System.out.println(j);
        // j++; //have to increment mannually
        // }


        // a more realistic example of when you would use a while loop
        // int j = 1;
        // while (true){
        //     if(j>5){
        //         break;
        //     }
        //     System.out.println(j);
        //     j++;
        // }

        //do while
        int j = 1; 
        boolean isReady = false;
        do{
            if(j>5){
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j>0);
        }while(isReady); //always has to end with ;
    }
}
