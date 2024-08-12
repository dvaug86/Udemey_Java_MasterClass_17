package Sections.sec99_StringBuilderClass;

public class Main {
    public static void main(String[] args) {
        // 4 ways to create a new StringBuilder object using the new keyword:

        // 1. Pass a String
        StringBuilder helloBuilder = new StringBuilder("Hello");

        // 2.Pass no arguments at all
        StringBuilder emptyBuilder = new StringBuilder();

        // 3. Pass an integer value
        StringBuilder emptyBuilder5 = new StringBuilder(5);

        // 4. Pass some other type of character sequence
        // below we use the helloBuilder from 1.
        StringBuilder stringBuilder = new StringBuilder(helloBuilder);

    }
}
