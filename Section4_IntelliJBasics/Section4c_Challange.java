//Section 4 challange 
//Step 1: create a double variable with a value of 20.00
//Step 2: create a  second variable of type double with a value 80.00
//Step 3: add both numbers together then multiply by 100.00
//Step 4: use the remainder operator to figure out what the remainder from the result of the operation in
//          step three and 40.00 will be.
//Step 5: create a blooean variable that assigns the value true if the remainder in step 4 is 0.00 or false if it's not zero
//Step 6: output the boolean variable just to see what the result is
//Step 7: write an if-then statement that displays a message, 'got some remainder' if the boolean in step 5 is not true

public class Section4c_Challange {
    public static void main(String[] args) {
        double dblVar = 20.00d; //i forgot to add the d don't neccessarily need to do this here since double is the standard
        double secDblVar  = 80.00d; //i forgot to add the d
        double result = (dblVar+secDblVar) *100.00d;
        double resultRemainder = result % 40.00d;
        boolean boolVar = (resultRemainder==0 )? true : false;
        System.out.println(boolVar);
        if(!boolVar){
            System.out.println("got some remainder");
        }else{
            System.out.println("no remainder");
        }

    }
}
