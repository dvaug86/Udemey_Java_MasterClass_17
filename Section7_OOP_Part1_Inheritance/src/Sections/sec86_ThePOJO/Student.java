package Sections.sec86_ThePOJO;

public class Student {
private String id;
private String name;
private String dateOfBirth;
private String classList;

public Student(String id, String name, String dateOfBirth, String classList) {
    this.id = id;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.classList = classList;
}

@Override //the '@' symbol stands for annotation. annotations are a type of metadata
public String toString() {
    return "Student {id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", classList=" + classList + "}";
}


}
