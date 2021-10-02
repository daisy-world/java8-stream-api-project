package intermediateOperationsDemo.StreamSortingExamples;

import util.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sorting a List of custom objects

public class Demo3 {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1, "Marco", "marco@gmail.com", 25000, "IT"));
        empList.add(new Employee(2, "Daisy", "daisy@gmail.com", 30000, "Finance"));
        empList.add(new Employee(3, "Michael", "michael@gmail.com", 40000, "HR"));
        empList.add(new Employee(4, "Sanya", "sanya@gmail.com", 28000, "IT"));
        empList.add(new Employee(5, "Robin", "robin@gmail.com", 50000, "Finance"));
        empList.add(new Employee(6, "Albert", "Anel@gmail.com", 50000, "HR"));

        //without using stream
       /* Collections.sort(empList,new SalaryComparator());  //ascending order
        empList.forEach(System.out::println);*/

        //using stream
       /* empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary)) //ascending order
                .forEach(System.out::println);*/

        empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()) //descending order
                .forEach(System.out::println);

    }
}

class SalaryComparator implements  Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()- o2.getSalary());
    }
}


