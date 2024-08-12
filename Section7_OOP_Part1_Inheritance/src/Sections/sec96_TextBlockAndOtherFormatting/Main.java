package Sections.sec96_TextBlockAndOtherFormatting;

public class Main {
    public static void main(String[] args) {
        // old way
        // I don't think this works anymore had to type in chcp 65001 in terminal to get
        // bullets to start showing up.
        String bulletIt = "Print a Bulleted List: \n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point \n";
        System.out.println(bulletIt);

        // New betterish way:
        // need to use triple quotes to get it to work naturally the \u2022 is the
        // unicode for the bullet points
        // the triple quotes NEED to be on their own line.
        String textBlock = """
                Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub Point """;
        System.out.println(textBlock);
        // printf formating
        int age = 35;
        // System.out.printf("your age is %d\n", age); // %d is a place holder for other
        // data
        System.out.printf("your age is %d%n", age); // is another version of new line

        int yearOfBirth = 2023 - age;
        // System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth); // add %n here to see differences
        // d is the symbol used for a decimal integer value
        // it is one of many conversion types.
        System.out.printf("your age is %f%n", (float) age);
        System.out.printf("your age is %.2f%n", (float) age);
        // .2 is precision. it says you only want 2 decimal places

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %d %n", i);
        }
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
            // the 6 says it wants to fill up 6 spaces
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
