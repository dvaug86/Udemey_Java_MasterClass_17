package sec56and57_TheSwitchStatment;

public class Main {
    public static void main(String[] args) {
        // int value = 1;
        // if (value == 1) {
        // System.out.println("Value was 1");
        // } else if (value == 2) {
        // System.out.println("Value was 2");
        // } else{
        // System.out.println("Was not 1 or 2");
        // }

        int switchValue = 4;
        // switch (switchValue) {
        // case 1:
        // System.out.println("Value was 1");
        // break;
        // case 2:
        // System.out.println("Value was 2");
        // break;
        // case 3: case 4: case 5:
        // System.out.println("Was a 3, a 4, or a 5 ");
        // System.out.println("Actually it was a " +switchValue);
        // break;
        // default:
        // System.out.println("Was not 1, 2, 3, 4 or 5");
        // break;

        // The enhanced switch statment:
        // break is not needed and semicolon (;) has been replaced by (->)
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a  " + switchValue);
            }
            default -> System.out.println("was not a 1, 2, 3, 4, or a 5");
            // more code
        }
        String month = "oCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    // new method:
    // This the traditional switch
    // public static String getQuarter(String month) {
    // switch (month) {
    // case "JANUARY":
    // case "FEBRUARY":
    // case "March":
    // return "1st";
    // case "APRIL":
    // case "MAY":
    // case "JUNE":
    // return "2nd";
    // case "JULY":
    // case "AUGUST":
    // case "SEPTEMBER":
    // return "3rd";
    // case "OCTOBER":
    // case "NOVEMBER":
    // case "DECEMBER":
    // return "4th";

    // }
    // return "bad";
    // }

    // enhanced method:
    public static String getQuarter(String month) {
       return  switch (month) {                               //notice the return before swith
            case "JANUARY", "FEBRUARY", "March" -> { yield "1st";}
            case "APRIL", "MAY", "JUNE" ->  "2nd";
            case "JULY", "AUGUST","SEPTEMBER" ->  "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" ->  "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; //yield is used insted of return when it is with codeblock
            }
            };

        }
        
    }

