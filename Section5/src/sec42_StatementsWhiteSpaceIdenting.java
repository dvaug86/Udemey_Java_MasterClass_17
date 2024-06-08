public class sec42_StatementsWhiteSpaceIdenting {
    public static void main(String[] args) {
        int myVariable = 50;

        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("this is" + // statements don't have to be on 1 line
                " another" +
                " test");
        // this is like saying
        System.out.println("This is" + " another" + " test");

        int anotherVariable = 50; myVariable--; System.out.println("myVariable = " +myVariable);
        //this is a viable alternative however putting these statements on seperate lines makes it easier to read
    
        if (myVariable == 0){
            System.out.println("my variable is now = " + myVariable);
        }

    }
}

//whitespace can be as little or as much as needed java ignores whitespace
//identing helps us mere humans see the logical flow of the code.
