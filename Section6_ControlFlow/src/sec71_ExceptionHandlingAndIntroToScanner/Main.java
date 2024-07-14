package sec71_ExceptionHandlingAndIntroToScanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

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

        Scanner scanner = new Scanner(System.in); //new object of type scanner
       
        // String name = System.console().readLine("Hi, What's your Namme? ");
        System.out.println("Hi, What's your Namme? ");
        String name =scanner.nextLine();
        
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        // String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
}
