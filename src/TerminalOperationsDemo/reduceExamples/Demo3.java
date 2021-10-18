package TerminalOperationsDemo.reduceExamples;

import util.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {

        List<Employee> empList=new ArrayList<Employee>();

        empList.add(new Employee(1,"Marco","marco@gmail.com",25000));
        empList.add(new Employee(2,"Daisy","daisy@gmail.com",30000));
        empList.add(new Employee(3,"Michael","michael@gmail.com",40000));
        empList.add(new Employee(4,"Sanya","sanya@gmail.com",28000));
        empList.add(new Employee(5,"Robin","robin@gmail.com",50000));

        Optional<Float> result = empList.stream()
                .filter(emp -> emp.getSalary() > 25000)
                .map(emp -> emp.getSalary())
                .reduce((a, b) -> a > b ? a : b);
        System.out.println(result.get());

        Optional<Float> result1 = empList.stream()
                .filter(emp -> emp.getSalary() > 25000)
                .map(emp -> emp.getSalary())
                .reduce(Float::max);
        System.out.println(result1.get());


    }
}
