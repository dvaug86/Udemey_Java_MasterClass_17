package Sections.sec88_InheritancePt1;

public class Dog extends Animal  {
 public Dog(){
    super(); //this was coming up as an error because Animal didn't have a default constructor
                //I have since added it.
 }
}
