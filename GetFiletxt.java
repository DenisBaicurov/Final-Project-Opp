package FinalProgektOpp;

import java.io.*;
import java.util.Date;
import java.util.List;

public class GetFiletxt implements GetFile {


    @Override
    public void getFile(List<Employee>list) {
File file=new File("ListEmployee.txt");

        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(file);
        for (int i=0;i<list.size();i++) {

               // System.out.println("Это id будет" +list.get(i).getId());
                int id = list.get(i).getId();
                writer.write(" Id сотрудника " + id + "\n");
                String fistname = list.get(i).getFirstName();
                writer.write("Имя сотрудника " + fistname + "\n");
                String lastname = list.get(i).getLastName();
                writer.write(" Фамилия сотрудника " + lastname + "\n");
                Date date = list.get(i).getEmployment();
                writer.write("Дата поступления сотрудника " + list.get(i).getEmployment() + "\n");
                int salary = list.get(i).getSalary();
                writer.write("Зарплата сотрудника " + salary + "\n");

        }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
