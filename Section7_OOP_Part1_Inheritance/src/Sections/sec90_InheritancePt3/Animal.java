package Sections.sec90_InheritancePt3;

public class Animal {
// fields
protected String type; //protected modifier allowes any subclass can access this field.
private String size;
private double weight;

// constructors
// need a default constructor since we are going to have a child class
public Animal() {
    // default constructor
}

public Animal(String type, String size, double weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
}

// don't forget about toString
@Override
public String toString() {
    return "Animal {type=" + type + ", size=" + size + ", weight=" + weight + "}"; 
}

public void move(String speed) {
    System.out.println(type + " moves " + speed);
}

public void makeNoise() {
    System.out.println(type + " makes some kind of noise");
}
}
