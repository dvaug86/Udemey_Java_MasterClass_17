package sec70_ParsingValuesAndREadingInput;

public class Main {
    public static void main(String[] args) {
        
        // String currentYear = "2024";
        // String usersDateOfBirth = "1999";

        // System.out.println("Age =" + (currentYear + usersDateOfBirth)); 
        //tried  (currentYear - usersDateOfBirth) but that shows error
        // error warning does show (currentYear + usersDateOfBirth) will work;
        // as we see it concatenates the 2 strings so it shows 20241999
        
        //now we try with currentYear being the literal numeric value.
        int currentYear = 2024;
        String usersDateOfBirth = "1999";

        System.out.println("Age =" + (currentYear + usersDateOfBirth)); 
        //we get the same result.

    }   
}
