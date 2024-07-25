package Sections.sec87_POJOvsTheRecord;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++){
            //we change Student from the student class to LPAStudent of LPAStudent record

            // If you look at LPAStudent and Student side by side the LPAStudent eliminates a ton of code that is in Student
            LPAStudent s = new LPAStudent("S92300" +i,  
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
        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java MasterClass");

        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
       // recordStudent.setClassList(recordStudent.getClassList() + ", Java OCP Exam 829");  this won't work because records don't have setters

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList() );
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList() );

    }
}
