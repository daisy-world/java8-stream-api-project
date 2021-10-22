package TerminalOperationsDemo.minMaxExamples;

import util.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
//Min & Max for Object
public class Demo3 {
    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<Employee>();

        empList.add(new Employee(1,"Marco","marco@gmail.com",25000));
        empList.add(new Employee(2,"Daisy","daisy@gmail.com",30000));
        empList.add(new Employee(3,"Michael","michael@gmail.com",40000));
        empList.add(new Employee(4,"Sanya","sanya@gmail.com",28000));
        empList.add(new Employee(5,"Robin","robin@gmail.com",50000));

        //min()
        empList.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .ifPresent(employee -> System.out.println("employee with min salary is " + employee.getName())); //Marco

        //max()
        empList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(employee -> System.out.println("employee with max salary is " + employee.getName())); //Robin

    }
}
