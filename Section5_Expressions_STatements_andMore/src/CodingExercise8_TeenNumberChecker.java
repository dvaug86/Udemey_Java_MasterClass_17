public class CodingExercise8_TeenNumberChecker {
    public static void main(String[] args) {
        
    }

    //
    public static boolean hasTeen(int first, int second, int third){
        if(((first >= 13) && (first <= 19)) || ((second>= 13) && (second <= 19)) || ((third >= 13) && (third <= 19))){
       return true;
        }else return false;
    }
    public static boolean isTeen(int age){
        return (age>=13 && age<=19);
    }
}
