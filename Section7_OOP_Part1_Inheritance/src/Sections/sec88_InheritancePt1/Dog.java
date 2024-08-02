package Sections.sec88_InheritancePt1;

public class Dog extends Animal  {
 public Dog(){
    //This default with no set default variables
    //super(); //this was coming up as an error because Animal didn't have a default constructor
                //I have since added it.
    
    //here i have super with new default variables
    super("mutt", "big", 50.0); //these are the arguments from animal class
 }
}
