package Sections.sec97_StringFormatting;

public class Main {
    public static void main(String[] args) {
        
        printInformation("Hello World");

    }
    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);;
        System.out.printf("First char = %c %n", string.charAt(0));
        //%c just prints a single character
    }
}
