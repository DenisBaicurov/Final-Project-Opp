package FinalProgektOpp;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UpdateEmployee extends CreateEmployee{
Employee employee;
   private String firstName;
   private String lastName;
  private   Date employment;
  private   int salary;
public List<Employee>updateEmployees(List<Employee>list, int id){
boolean b=false;
for (int i=0;i<list.size();i++)
{
    if(i+1==id){
        System.out.println("Данный сотрудник найден, будем менять данные?");
        System.out.println("Если да,то нажмите 1,нет любую другую клавишу");
        Scanner scanner=new Scanner(System.in);
        if (scanner.nextLine().equals("1")){b=true;}
    }

    if(b==true){
     employee=list.get(id-1);
      employee=updateEmployee(employee, id);

 list.set(id-1,employee);
    }

}


return list;
}

public Employee updateEmployee(Employee employee ,int id){


    System.out.println("Прежнее имя сотрудника "+employee.getFirstName());
    System.out.println("Будем менять,если да нажмите 1, если нет любую другую клавишу");
    Scanner scanner=new Scanner(System.in);
    String first=scanner.nextLine();
    if (first.equals("1")){  firstName=getName(); }
    else if (!first.equals("1")){firstName=employee.getFirstName();}
    System.out.println("Прежняя фамилию сотрудника "+employee.getLastName());
    System.out.println("Будем менять,если да нажмите 1, если нет любую другую клавишу");
    Scanner scanner1=new Scanner(System.in);
    String last=scanner1.nextLine();
    if (last.equals("1")){  lastName=getName();}
    else  if(!last.equals("1")){lastName=employee.getLastName();}

    System.out.println("Прежнее время поступления сотрудника "+employee.getEmployment());
    System.out.println("Будем менять,если да нажмите 1, если нет любую другую клавишу");
    Scanner scanner2=new Scanner(System.in);
    String dat=scanner2.nextLine();
    if (dat.equals("1")){ employment=getDate();}
    else  if (!dat.equals("1")){employment=employee.getEmployment();}

int formersalary=employee.getSalary();
    System.out.println("Прежняя зарплата сотрудника "+ formersalary);
    System.out.println("Будем менять,если да нажмите 1, если нет любую другую клавишу");
    Scanner scanner3=new Scanner(System.in);
    String sal=scanner3.nextLine();
    if (sal.equals("1")){ salary=getyourSalary();}
    else if (!sal.equals("1")){ salary=formersalary;}
     employee=new Employee(firstName,lastName,employment,id,salary);

    return employee;
}


}
