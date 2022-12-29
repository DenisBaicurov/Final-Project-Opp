package FinalProgektOpp;

import java.util.Date;

public class Employee {

   private String firstName;
   private String LastName;
   private Date employment;
   private int id;
   private int Salary;

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;

    }

    public Employee(String firstName, String lastName, Date employment, int id, int salary) {
        this.firstName = firstName;
        LastName = lastName;
        this.employment = employment;
        this.id = id;
        Salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getEmployment() {
        return employment;
    }

    public void setEmployment(Date employment) {
        this.employment = employment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "имя= '" + firstName + '\'' +
                ", фамилия= '" + LastName + '\'' +
                ", дата поступления= " + employment +
                ", id= " + id +
                ", Зарплата= " + Salary +
                '}';
    }
}
