/*
 * Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise, print "Neither all are equal or different".
 */

public class CodingExercise11_EqualityPrinter {
    public static void main(String[] args) {

    }

    public static void printEqual(int var1, int var2, int var3) {
        if (var1 < 0 || var2 < 0 || var3 < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (var1 == var2 && var2 == var3) {
            System.out.println("All numbers are equal");
            return;
        }
        if (var1 != var2 && var1 != var3 && var2 != var3) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }

}


/* This is the solution given. Mine still worked I need to remember that it is ok to just have int a vs int var1
 * public class IntEqualityPrinter {
 
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    private static final String NEITHER_ALL_EQUAL_MESSAGE = "Neither all are equal or different";
    private static final String ALL_DIFF_MESSAGE = "All numbers are different";
     
    public static void printEqual(int a, int b, int c) {
        
        if (a < 0 || b < 0 || c < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (a == b && b == c) {
            System.out.println(ALL_EQUAL_MESSAGE);
        } else if ((a == b) || (a == c) || (b == c)) {
            System.out.println(NEITHER_ALL_EQUAL_MESSAGE);
        } else {
            System.out.println(ALL_DIFF_MESSAGE);
        }
    }
}
 */