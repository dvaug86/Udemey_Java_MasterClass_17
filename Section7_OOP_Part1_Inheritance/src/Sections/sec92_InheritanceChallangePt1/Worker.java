/*
 * Class: worker
 * -------------------------------------
 * fields: name: String
 *          birthDate: String
 *          endDate: String
 * _*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
 * methods: int getAge()
 *          double collectPay()
 *          terminate(String endDate)
 * ====================================
 */

package Sections.sec92_InheritanceChallangePt1;

public class Worker {
//fields
private String name;
private String birthDate;
protected String endDate; //this should be protected because it could potentially be set by a subclass

//default constructor
public Worker() {}

public Worker(String name, String birthDate) { //we don't include endDate because generally you don't know the end date when someone is first hired.
    this.name = name;
    this.birthDate = birthDate;
    
}

public int getAge(){
    int currentYear =2025;
    int birthYear = Integer.parseInt(birthDate.substring(6));  //in this challange we are going with birthdates in the form mm/dd/yyyy  therefore index 6 is the first 'y'
    return (currentYear - birthYear);
}
public double collectPay(){
    return 0.0;
}

public void terminate(String endDate){
    this.endDate = endDate;
}

@Override
public String toString() {
    return "Worker {name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "}";
}

}
