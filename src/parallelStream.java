import util.Employee;

import java.util.ArrayList;
import java.util.List;

public class parallelStream {
    public static void main(String[] args) {

        List<Employee> empList=new ArrayList<Employee>();

        empList.add(new Employee(1,"Marco","marco@gmail.com",25000));
        empList.add(new Employee(2,"Daisy","daisy@gmail.com",30000));
        empList.add(new Employee(3,"Michael","michael@gmail.com",40000));
        empList.add(new Employee(4,"Sanya","sanya@gmail.com",28000));
        empList.add(new Employee(5,"Robin","robin@gmail.com",50000));

        long t1 = System.currentTimeMillis();
        empList.stream().filter(employee->employee.getSalary()>25000)
                .forEach(employee -> System.out.println(employee.getName()));

        long t2 = System.currentTimeMillis();
        System.out.println("time taken for execution using sequential stream.." + (t2-t1));

        t1 = System.currentTimeMillis();
        empList.parallelStream().filter(employee->employee.getSalary()>25000)
                .forEach(employee -> System.out.println(employee.getName()));
        t2 = System.currentTimeMillis();

        System.out.println("time taken for execution using parallel stream.." + (t2-t1));

    }

}
