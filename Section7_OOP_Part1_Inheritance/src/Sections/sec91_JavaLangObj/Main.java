package Sections.sec91_JavaLangObj;

public class Main extends Object {
    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        // System.out.println(max.toString());
        System.out.println(max); // this shows that the to string method has been changed.

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        // return "Student [name=" + name + ", age=" + age + "]";
        return name + " is " + age;
    }

    // @Override
    // public String toString() {
    // return super.toString();
    // }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }

}