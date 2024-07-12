/*
 * Diagonal Star
Write a method named printSquareStar with one parameter of type int named number. 

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).



EXAMPLE INPUT/OUTPUT:

EXAMPLE 1

printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****

Explanation:

*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


EXAMPLE 2

printSquareStar(8); should print the following:

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********


The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

In the first or last row

In the first or last column

When the row number equals the column number

When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)



HINT: Use a nested loop (a loop inside of a loop).

HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints a space and does not "move" to another line.

HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .
 */

package CodingExercises;

public class CE27_DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return; //I need this to break out of it otherwise it would keep going
        }

        // row count
        for (int i = 1; i <= number; i++) {
            if (i == 1 || i == number) {

                // // column count
                for (int j = 1; j <= number; j++) {
                    System.out.print("*");
                }
            }

            if (i > 1 && i < number) {
                for (int j = 1; j <= number-1; j++) {
                    if (j == 1 || j == number-1) {
                        System.out.print("*");
                    }
                    if(j == i){
                        System.out.print("*"); 
                    }
                    if(j == ((i -j) +1)){
                        System.out.print("*"); 
                    }
                    System.out.print(" ");

                }
            }
            
            System.out.println();
        }
    }
}


//I am proud of my progress with this. However I made it way too complicated as usual.  
//I should have used column and row as my variables instead of i and j. 
// I think that would have made it more readable. 
// Im not sure how much better it would have been if I had used the boolean part though instead of if-else statements.

//below is the answer key:

//public class DiagonalStar {
//     // write code here
//     private static final String STAR = "*";
//     private static final String SPACE = " ";
 
//     public static void printSquareStar(int number) {
        
//         if (number < 5) {
//             System.out.println("Invalid Value");
//             return;
//         }
 
//         // Iterate over each row
//         for (int row = 1; row <= number; row++) {
//             // Iterate over each column
//             for (int column = 1; column <= number; column++) {
//                 // if either row or column equals 1, assign true to isFirstRowOrColumn.
//                 boolean isFirstRowOrColumn = row == 1 || column == 1;
//                 // if either row or column equals number, assign true to isLastRowOrColumn.
//                 boolean isLastRowOrColumn = row == number || column == number;
//                 // if either row equals column, or column equals number minus row plus 1, assign true to isFirstRowOrColumn.
//                 boolean isDiagonal = (row == column) || (column == (number - row + 1));
 
//                 if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
//                     System.out.print(STAR);
//                 } else {
//                     System.out.print(SPACE);
//                 }
//             }
//             // Move to the next line
//             System.out.println();
//         }
//     }
// }