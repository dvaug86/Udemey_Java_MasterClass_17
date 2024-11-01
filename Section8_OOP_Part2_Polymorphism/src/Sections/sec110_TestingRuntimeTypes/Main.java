package Sections.sec110_TestingRuntimeTypes;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
       
  
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

    