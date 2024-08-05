/*
 * Class: Employee
 * ------------------------------------
 * fields: employeeId: long
 *          hireDate: String
 * ====================================
 */
package Sections.sec92_InheritanceChallangePt1;

public class Employee extends Worker {
private long employeeId;
private String hireDate;

//default constructor
public Employee(){}

public Employee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
    super(name, birthDate, endDate);
    this.employeeId = employeeId;
    this.hireDate = hireDate;
}



}
