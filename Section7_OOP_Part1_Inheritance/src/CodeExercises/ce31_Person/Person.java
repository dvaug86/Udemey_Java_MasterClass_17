package CodeExercises.ce31_Person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName(){
        if(firstName == "" && lastName == ""){
            return "";
        }
        if(firstName =="" && lastName !=""){
 return lastName;
        }
        if(firstName !="" && lastName ==""){
             return firstName;
                    }
                    return firstName+" "+lastName;
    }
}
/*
 * got it right. just didn't use the .isEmpty() method suggested. still worked doing the != "" approach.
 * Answer key below
 * public class Person {
 
    private String firstName;   
    private String lastName;    
    private int age;            
 
    public boolean isTeen() {
        return age > 12 && age < 20;
    }
    
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
 
    public String getFullName() {
        
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
 
        if (firstName.isEmpty()) {
            return lastName;
        }
 
        if (lastName.isEmpty()) {
            return firstName;
        }
 
        return firstName + " " + lastName;
    }
}
 */