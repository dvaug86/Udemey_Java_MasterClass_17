package Sections.Section109_Polymorphism_Casting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        // Movie theMovie = new Movie("Star Wars");
        // theMovie.watchMovie();
    
        // Movie theMovie = new Adventure("Star Wars"); //not instead of new Movie it is new Adventure
        // theMovie.watchMovie();

        // Movie thMovie = Movie.getMovie("s", "Star Wars");
        // thMovie.watchMovie();

        //the try shouldn't be neccessary on a real problem vs this short example
        try (//allows a user interface with a scanner review section 6
        Scanner s = new Scanner(System.in)) {
            while (true){
                System.out.print("Enter Type (A for Adventure, C for Comedy, " + "S for Science Fiction or Q to quit): ");
                String type = s.nextLine();
                if("Qq".contains(type)){
                    break;
                }
                System.out.println("Enter Movie Title; ");
                String title = s.nextLine();
                Movie movie = Movie.getMovie(type, title);
                movie.watchMovie();
            }
        }
    }
}
