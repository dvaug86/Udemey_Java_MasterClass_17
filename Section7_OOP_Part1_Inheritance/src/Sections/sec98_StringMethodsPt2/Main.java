package Sections.sec98_StringMethodsPt2;

public class Main {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        
        System.out.println("Birth month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        //delimiter or first argument above is what will be placed between strings
        System.out.println("newDate = " + newDate);

        //below would be better to do with join but here is the tedious way todo it with concat
        //it's also very inefficient
        String secondNewDate = "25";
        secondNewDate = secondNewDate.concat("/");
        secondNewDate = secondNewDate.concat("11");
        secondNewDate = secondNewDate.concat("/");
        secondNewDate = secondNewDate.concat("1982");
        System.out.println("Second newDate = " + secondNewDate);

        //third tedious way to do the same things
        String thirdNewDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("Third newDate = " + thirdNewDate);

        //4th way
        //this is also called method channing however its very much like the secondNewDate way.
        String fourthWay = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("4th way = " + fourthWay );

        System.out.println("using replace for newDate = " +newDate.replace('/','-'));
        System.out.println("using replace for second newDate = " +secondNewDate.replace("2","00"));
        System.out.println("using replace for second newDate = " +secondNewDate.replaceFirst("/","-"));
        System.out.println("using replaceAll for second newDate = " +secondNewDate.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}
