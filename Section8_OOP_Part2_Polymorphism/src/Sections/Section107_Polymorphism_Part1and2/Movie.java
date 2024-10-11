package Sections.Section107_Polymorphism_Part1and2;

public class Movie {

    // fields
    private String title;

    // constructor
    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    // constructor
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        // TODO Auto-generated method stub
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

}
class Comedy extends Movie {
    
    // constructor
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        // TODO Auto-generated method stub
        super.watchMovie();
        System.out.printf("..%s%n".repeat(4),
                "Something funny happens",
                "Something even funnier happens",
                "Something Bad happens",
                "Happy ending");
    }

}
class ScienceFiction extends Movie {
    
    // constructor
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        // TODO Auto-generated method stub
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet blows up");
    }

}
