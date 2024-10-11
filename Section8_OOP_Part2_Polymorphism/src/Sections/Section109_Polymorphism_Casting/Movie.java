package Sections.Section109_Polymorphism_Casting;

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
//This is a factory method which gives us a way to obtain an object without having to know the details of how to create it.
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
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
    public void watchAdventure(){
        System.out.println("Watching an Adventure!");
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
    public void watchComedy(){
        System.out.println("Watching a Comedy!");
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
    public void watchScienceFiction(){
        System.out.println("Watching a ScienceFiction!");
    }
}
