public class HelloIfElse {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("He is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the High score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (secondTopScore < 100)) {
            System.out.println("Greater than second top score and less than 100 ");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("this is true");
        }

        boolean isCar = false;
        // if(isCar == true){
        //     System.out.println("this isn't suppose to happen");
        // }
        if(!isCar){
            System.out.println("this isn't suppose to happen");  //using ! is the not operator it is asking if the case is the opposite here
        }

        //ternery operators
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if(isDomestic){
            System.out.println("This is a domestic car");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18 )? "over 18" : "still a kid";
        System.out.println("our client is " + ageText );


    }

}
