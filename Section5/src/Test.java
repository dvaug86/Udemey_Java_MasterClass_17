public class Test {
    public static void main(String[] args) {

        int myAge = calcMyAge(1986);
        System.out.println("My age is " + myAge);

    }

    public static int calcMyAge(int dateOfBirth) {

        int AgeMath = (2024 - dateOfBirth);
        return AgeMath;
    }
}
