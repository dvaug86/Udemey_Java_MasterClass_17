package Sections.sec86_ThePOJO;

public class Main {
    public static void main(String[] args) {
        
        for (int i = 1; i <=5; i++){
            Student s = new Student("S92300" +i, 
            switch(i){
             case 1 -> "Marry";
             case 2 -> "Carol";   
             case 3 -> "Tim";   
             case 4 -> "Harry";   
             case 5 -> "Lisa";
             default-> "Anonymous";   //while this will never be true b/c of loop it's still required.
            }, 
            "05/11/1985",
             "Java MasterClass");
             System.out.println(s);
        }

    }
}
