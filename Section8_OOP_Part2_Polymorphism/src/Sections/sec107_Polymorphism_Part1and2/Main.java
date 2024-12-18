package Sections.sec107_Polymorphism_Part1and2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
        // theMovie.watchMovie();

        try (Scanner s = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q to quit): ");
                String type = s.nextLine();
                if ("Qq".contains(type)) {
                    break;
                }
                System.out.println("Enter Movie Title: ");
                String title = s.nextLine();
                Movie movie = Movie.getMovie(type, title);
                movie.watchMovie();
            }
        }

    }
}
