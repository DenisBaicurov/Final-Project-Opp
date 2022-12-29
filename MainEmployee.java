package FinalProgektOpp;

import java.util.*;

public class MainEmployee {
  static   int  id=0;

public static int getid(){

    System.out.println("Введите id сотрудника,который хотите изменить(удалить)");
    Scanner scanner=new Scanner(System.in);
   try {
        id=scanner.nextInt();
   }
    catch (InputMismatchException e){
        System.err.println("Неверный ввод ,повторите");
       getid();
    }
 if (id<=0){
     System.err.println("Id не может быть отрицательным или равным нулю, повторите ввод");
     getid();
 }


return id;
}


    public static void main(String[] args) {
        GetFiletxt filetxt=new GetFiletxt();
        boolean b=false;
        boolean bol=true;
        List<Employee>list=new ArrayList<>();

     while (bol==true) {

         System.out.println("Если хотите добавить пользователя, жмите 1, изменить жмите 2 , удалить жмите 3 ,выйти " +
                 "жмите 4");

         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();

         if (input.equals("1")) {
             CreateEmployee createEmployee = new CreateEmployee();
             AddEmployee addEmployeelist = new AddEmployee();
             if (list.isEmpty()) {
                 System.out.println("Так список сотрудников пустой, создаём его");
             }


             Employee employee = createEmployee.createEmployee();
             list=addEmployeelist.addEmployee(list,employee);

             System.out.println("Будем добалять сотрудников?");
             System.out.println("Если да нажмите 1,нет любую другую клавишу");
             Scanner scanner2 = new Scanner(System.in);
             String addemp=scanner2.nextLine();
             if (addemp.equals("1")) {
                 b = true;
             }
             else if (!addemp.equals("1")){b=false;
                 System.out.println("Имеем следующий список сотрудников");

                 for (int i = 0; i < list.size(); i++) {

                     System.out.println(list.get(i));
                 }
                 filetxt.getFile(list);
             }

             while (b == true) {
                 employee = createEmployee.createEmployee();


                 list = addEmployeelist.addEmployee(list, employee);
                 System.out.println("Будем добалять сотрудников?");
                 System.out.println("Если да нажмите 1,нет любую другую клавишу");
                 Scanner scanner1 = new Scanner(System.in);
                 if (!scanner1.nextLine().equals("1")) {
                     b = false;
                     System.out.println("Имеем следующий список сотрудников");
                     for (int i = 0; i < list.size(); i++) {

                         System.out.println(list.get(i));
                     }
                     filetxt.getFile(list);
                 }
             }
         }



         b = true;

         if (input.equals("2")) {
             while (b == true) {
                 System.out.println("Если хотите изменить сотрудника нажмите 1,нет любую другую клавишу");
                 Scanner scanner1 = new Scanner(System.in);
                 String str = scanner1.nextLine();
                 if (str.equals("1")) {
                     b = false;
                     id = getid();

                     for (int i = 0; i < list.size(); i++) {
                         if (i + 1 == id) {
                             b = true;
                             System.out.println("Сотрудник найден!");
                             UpdateEmployee updateEmployee = new UpdateEmployee();
                             list = updateEmployee.updateEmployees(list, id);
                         }
                     }
                     if (b == false) {
                         System.out.println("Такого сотрудника нет!");
                     }
                 }
            else if (!str.equals("1")){b=false;}

                     if (b == true) {
                         System.out.println("Список изменён ");
                         for (int i = 0; i < list.size(); i++) {
                             System.out.println(list.get(i));
                         }
                         filetxt.getFile(list);

                     }

                 while (b == true) {
                     System.out.println("Если хотим продолжить изменения,нажмём 1, нет любую другую клавишу");
                     Scanner scanner2 = new Scanner(System.in);
                     String str1 = scanner2.nextLine();
                     if (str1.equals("1")) {
                         b = false;
                         id = getid();

                         for (int i = 0; i < list.size(); i++) {
                             if (i + 1 == id) {
                                 b = true;
                                 System.out.println("Сотрудник найден!");
                                 UpdateEmployee updateEmployee = new UpdateEmployee();
                                 list = updateEmployee.updateEmployees(list, id);
                             }
                         }
                         if (b == false) {
                             System.out.println("Такого сотрудника нет!");
                         }

                     }

              else if(!str1.equals("1")){b=false;}



                         if (b == true) {
                             System.out.println("Список изменён ");
                             for (int i = 0; i < list.size(); i++) {
                                 System.out.println(list.get(i));
                             }
                             filetxt.getFile(list);

                         }

                 }

             }

         }


         b = true;


         if (input.equals("3")) {
             while (b == true) {
                 System.out.println("Если хотите удалить сотрудника жмите 0, нет , любую другую клавишу");
                 Scanner scanner3 = new Scanner(System.in);
             String str=scanner3.nextLine();
                 if (str.equals("0")) {
                     b = false;
                     id = getid();
                     for (int i = 0; i < list.size(); i++) {
                         if(id==i+1) {
                             b = true;
                             System.out.println("Сотрудник найден!");
                             DeliteEmployee deliteEmployee = new DeliteEmployee();
                             list = deliteEmployee.delEmployee(list, id);
                         }

                     }
                     if (b == false) {
                         System.out.println("Сотрудник с таким Id не найден");
                     }
                 }
             else if (!str.equals("0")){b=false;}


                     if (b == true) {
                         System.out.println("Список изменён ");
                         for (int i = 0; i < list.size(); i++) {

                             System.out.println(list.get(i));
                         }
                         filetxt.getFile(list);
                     }

             }

         }

         if (input.equals("4")){
             System.out.println("До свиданья");
             bol=false;}

         if (!input.equals("1") &&(!input.equals("2"))&& (!input.equals("3"))&&(!input.equals("4"))){

             System.out.println("Неверный ввод, повторите");
         }


     }






    }


}
