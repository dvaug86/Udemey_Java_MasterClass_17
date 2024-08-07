/*
 * Challange is to create the worker class, the employee class and either the salariedEmployee or hourlyEmployee class
 * ____________________________________
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
 * 
 * 
 * Class: Employee
 * ------------------------------------
 * fields: employeeId: long
 *          hireDate: String
 * ====================================
 * 
 * 
 * Class: SalariedEmployee
 * ------------------------------------
 * fields: annualSalary: double
 *          isRetired: boolean
 * _*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
 * methods: retire()
 * ====================================
 * 
 * 
 * Class: HourlyEmployee
 * ------------------------------------
 * fields: hourlyPayRate: double
 * _*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
 * methods: getDoublePay()
 * ====================================
 */

package Sections.sec92_InheritanceChallangePt1;

public class Main {
    public static void main(String[] args) {
       Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020"); 
       System.out.println(tim);
       System.out.println("Age = " + tim.getAge());
       System.out.println("Pay = " + tim.collectPay());

       SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
       System.out.println(joe);
       System.out.println("Joe's Paycheck = $" + joe.collectPay());

       joe.retire();
       System.out.println("Joe's pension check = $" + joe.collectPay());

       HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2020", 15);
       System.out.println(mary);
       System.out.println("Mary's Paycheck = $" +mary.collectPay() );
       System.out.println("Mary's Holidsay Pay = $" +mary.getDoublePay() );
    }

}
