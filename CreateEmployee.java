package FinalProgektOpp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateEmployee extends Employee{
    Calendar calendar;
    int year;
   int month;
   int day;
private int salary;

    public int getYear(){
        calendar=Calendar.getInstance();
     //calendar.set(2020,0,25);
        System.out.println(" Введите год поступления сотрудника");

       Scanner scanner =new Scanner(System.in);
       try {
           year=scanner.nextInt();
       }
        catch (InputMismatchException e){
            System.err.println("Неверный ввод,повторите");
            getYear();
        }
     if (year>calendar.getInstance().getWeekYear()||year<calendar.getInstance().getWeekYear()-30)
     {
         System.err.println("Год слишком большой или слишком маленький, повторите ввод");

         getYear();
     }
 //   System.out.println(calendar.getWeekYear());
        return year;
    }
    public int getMonth(){
        System.out.println(" Введите месяц поступления сотрудника от 0 до 11");
        Scanner scanner =new Scanner(System.in);
        try {
            month=scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.err.println("Неверный ввод,повторите");
            getMonth();
        }
 if(month>11||month<0){
     System.err.println("Месяц слишком бльшой или маленький");
     getMonth();
 }

       return month;

    }

public int getDay(){
    System.out.println(" Введите день поступления сотрудника от 1 до 31");
    Scanner scanner =new Scanner(System.in);
    try {
        day=scanner.nextInt();
    }
    catch (InputMismatchException e){
        System.err.println("Неверный ввод,повторите");
       getDay();
    }
    if(day>31||day<1){
        System.err.println("День слишком большой или маленький");
        getDay();
    }

    return day;

}




    public Employee createEmployee(){
        System.out.println("Введите данные сотудника");
        System.out.println("Введите имя сотрудника");
        String firstName=getName();
        System.out.println("Введите фамилию сотрудника");
        String lastName=getName();
        System.out.println("Введите время поступления сотрудника");
        Date employment=getDate();
        System.out.println("Введите зарплату сотрудника не меньше 12тыс. и не больше 100 тыс.");
        salary=getyourSalary();
        Employee employee=new Employee(firstName,lastName,employment,1,salary);

return employee;
    }

public String getName(){
    System.out.println("Ваш ввод ");
      String s=""  ;
      Scanner scanner=new Scanner(System.in);
      s=scanner.nextLine();
      if (s.equals("")){
          System.err.println("Введённое значение не должно быть пустым");
          getName();
      }
       return s;
}
public Date getDate(){
        calendar=Calendar.getInstance();

year=getYear();

month=getMonth();

    day=getDay();
    calendar.set(year,month,day);
if (calendar.getTimeInMillis()>=Calendar.getInstance().getTimeInMillis())
{
    System.out.println(calendar.getTime());
    System.err.println("Установленная дата не должна превышать текущую или быть равной");
    getDate();
}
    System.out.println(calendar.getTime());
return calendar.getTime();
}


 public int getyourSalary(){
     System.out.println("Зарплата будет: ");
     Scanner scanner=new Scanner(System.in);
     try {
         salary=scanner.nextInt();
     }
     catch (InputMismatchException e){
         System.err.println("Некоректный ввод, повторите");
         getSalary();

     }
     if(salary<12000||salary>100000){
         System.err.println("Зарплата слишком большая или маленькая,повторите ввод");
         getSalary();
     }

   return salary;
 }



}


