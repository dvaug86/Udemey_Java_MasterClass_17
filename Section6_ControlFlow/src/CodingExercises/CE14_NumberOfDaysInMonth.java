package CodingExercises;

public class CE14_NumberOfDaysInMonth {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public static int getDaysinMonth(int month, int year){
        if(((month <1) || (month >12) || ((year < 1) || (year > 9999)))){
            return -1;
        }
        int days = switch(month){
            case 1, 3, 5, 7, 8 , 10, 12 -> 31;
            case 2 ->{
                if(isLeapYear(year)==true){
                    yield 29;
                }
                yield 28;
            }
            default -> 30;
        };
       return  days;
    }
}
