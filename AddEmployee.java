package FinalProgektOpp;

import java.util.List;

public class AddEmployee {




 public List<Employee>addEmployee(List<Employee>list, Employee employee){

    if (list.isEmpty()){

        employee.setId(1);
        list.add(employee);

    }
else {
    employee.setId(list.size()+1);
    list.add(employee);
    }

     return list;
 }

}
