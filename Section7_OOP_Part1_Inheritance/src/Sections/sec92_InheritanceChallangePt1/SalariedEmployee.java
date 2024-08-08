package Sections.sec92_InheritanceChallangePt1;

public class SalariedEmployee extends Employee {



    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    double annualSalary;
    boolean isRetired;
}
