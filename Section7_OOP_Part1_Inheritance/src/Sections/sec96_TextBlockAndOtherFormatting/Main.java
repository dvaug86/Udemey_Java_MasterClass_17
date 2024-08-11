package Sections.sec96_TextBlockAndOtherFormatting;

public class Main {
    public static void main(String[] args) {
        //old way
        //I don't think this works anymore had to type in chcp 65001 in terminal to get bullets to start showing up.
        String bulletIt = "Print a Bulleted List: \n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point \n";
                System.out.println(bulletIt);

        //New betterish way:
        //need to use triple quotes to get it to work naturally the \u2022 is the unicode for the bullet points
        //the triple quotes NEED to be on their own line.
        String textBlock = """ 
            Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point """;
System.out.println(textBlock);
        //printf formating
        int age = 35;
        System.out.printf("your age is %d\n", age); //%d is a place holder for other data
        
        int yearOfBirth = 2023-age;
        System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);
                                
                
                
    }
}
