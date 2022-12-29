package FinalProgektOpp;

import java.util.List;

public class DeliteEmployee {
Employee employee;
public List<Employee> delEmployee( List<Employee>list,int id){
    if (list.isEmpty()){
        System.out.println("Список сотудников не должен быть пустым");

        return list ;
    }

else {
    for (int i=0;i<list.size();i++){

        if (i==id-1){
           employee=list.get(i);
        }
    }
    list.remove(employee);

   if(list.isEmpty()){return list;}
    else {
        for (int i=id-1;i<list.size();i++){
            list.get(i).setId(i);

        }
   }

    }

  return list;
}



}
