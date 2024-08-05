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
private String endDate;

//default constructor
public Worker() {}

public Worker(String name, String birthDate, String endDate) {
    this.name = name;
    this.birthDate = birthDate;
    this.endDate = endDate;
}

public int getAge(int birthDate){
    return 2024 - birthDate;
}


}
