package sec70_ParsingValuesAndREadingInput;

public class Main {
    public static void main(String[] args) {

        // String currentYear = "2024";
        // String usersDateOfBirth = "1999";

        // System.out.println("Age =" + (currentYear + usersDateOfBirth));
        // tried (currentYear - usersDateOfBirth) but that shows error
        // error warning does show (currentYear + usersDateOfBirth) will work;
        // as we see it concatenates the 2 strings so it shows 20241999

        // now we try with currentYear being the literal numeric value.
        // int currentYear = 2024;
        // String usersDateOfBirth = "1999";

        // int dateOfBirth = Integer.parseInt(usersDateOfBirth);
        // //Integer is a class
        // //parseInt is the method used from integer class

        // String usersAgeWithPartialYear = "22.5";
        // double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        // System.out.println("The user says he's " + ageWithPartialYear);

        // System.out.println("Age =" + (currentYear + usersDateOfBirth));
        // System.out.println("Age =" + (currentYear - dateOfBirth));
        // //we get the same result.
        // //the int automatically becomes a string.

        int currentYear = 2024;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your Namme? ");
        // this is basically an input window

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        return "";
    }
}
