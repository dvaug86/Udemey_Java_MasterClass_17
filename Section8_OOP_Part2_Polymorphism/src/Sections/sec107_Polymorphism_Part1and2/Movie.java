package Sections.sec107_Polymorphism_Part1and2;

public class Movie {

    // fields
    private String title;

    // constructor
    public Movie(String title) {
        this.title = title;
    }

    // methods - this is a public method so it can be called from the outside world.
    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
    // .getclass() is a java.lang.object and it returns class type info

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
        super.watchMovie();
        System.out.printf("..%s%n".repeat(4),
                "Something funny happens",
                "something even funnier happens",
                "something sad happens",
                "happy ending");
    }

}

class ScienceFiction extends Movie {

    // constructor
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows up");
    }

}