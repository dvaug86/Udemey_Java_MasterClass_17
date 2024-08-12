package Sections.sec99_StringBuilderClass;

public class Main {
    public static void main(String[] args) {
        // 4 ways to create a new StringBuilder object using the new keyword:

        // // 1. Pass a String
        // StringBuilder helloBuilder = new StringBuilder("Hello");

        // // 2.Pass no arguments at all
        // StringBuilder emptyBuilder = new StringBuilder();

        // // 3. Pass an integer value
        // StringBuilder emptyBuilder5 = new StringBuilder(5);

        // // 4. Pass some other type of character sequence
        // // below we use the helloBuilder from 1.
        // StringBuilder stringBuilder = new StringBuilder(helloBuilder);

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");
        // inorder to get the above statement to work like we imagine (Hello World and
        // Goodbye) it needs to be assigned to a variable
        // therefore it should look more like helloWorld = helloWorld.concat(" and
        // Goodbye");
       

        // This statement below won't compile as is:
        // You can't assign a string literal to a string builder variable.
        // StringBuilder helloWorldBuilder = "Hello" + " World";

        // Instead you have to use one of the string builder constructors.
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);


    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("String length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("StringBuilder length = " + builder.length());
        System.out.println("capacity = "+ builder.capacity());
    }
}
