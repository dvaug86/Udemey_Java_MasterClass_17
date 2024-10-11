package Sections.Section107_Polymorphism_Part1and2;

public class Main {
    public static void main(String[] args) {
       
        // Movie theMovie = new Movie("Star Wars");
        // theMovie.watchMovie();
    
        Movie theMovie = new Adventure("Star Wars"); //not instead of new Movie it is new Adventure
        theMovie.watchMovie();
    }
}
