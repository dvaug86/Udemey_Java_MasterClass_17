package Sections.sec83_ReferenceVsObjVsInstanceVsClass;

public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue"); //creates a new instance of the house class and are assigning it the variable color =blue
        House anotherHouse = blueHouse;  //this creates another reference to the same object

        System.out.println(blueHouse.getColor()); //prints blue
        System.out.println(anotherHouse.getColor()); //blue

        anotherHouse.setColor("red"); //this will make both red because it is setting the object. 
                                            //the reference to blueHouse and another house is to the object that has now
                                            //been set to color red.

        System.out.println(blueHouse.getColor()); //red
        System.out.println(anotherHouse.getColor()); //red

        House greenHouse = new House("green");
        anotherHouse = greenHouse; //this is changing the reference from blue house to green house 
                                    //like x-ing out the address on a sheet from blue house address to green house

        System.out.println(blueHouse.getColor()); // red
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); //green
    }
}
