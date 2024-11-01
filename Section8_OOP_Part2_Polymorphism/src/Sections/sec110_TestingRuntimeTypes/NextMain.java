package Sections.sec110_TestingRuntimeTypes;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();
        // Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws"); //The (Adventure is
        // casting) we need to cast to avoid errors

        // Below will still create an error of not casting Adventure with a "C"
        // Adventure jaws = (Adventure) Movie.getMovie("c", "Jaws");
        // jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        // below is not the best way to test for runtime type.
        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }

    }
}
