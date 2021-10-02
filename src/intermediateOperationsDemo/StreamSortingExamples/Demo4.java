package intermediateOperationsDemo.StreamSortingExamples;

import util.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sorting a List on multiple fields
public class Demo4 {
    public static void main(String[] args) {

        List<Employee> empList=new ArrayList();

        empList.add(new Employee(1,"Marco","marco@gmail.com",25000,"IT"));
        empList.add(new Employee(2,"Daisy","daisy@gmail.com",30000,"Finance"));
        empList.add(new Employee(3,"Michael","michael@gmail.com",40000,"HR"));
        empList.add(new Employee(4,"Sanya","sanya@gmail.com",28000,"IT"));
        empList.add(new Employee(5,"Robin","robin@gmail.com",50000,"Finance"));
        empList.add(new Employee(6,"Albert","Anel@gmail.com",50000,"HR"));


        // using stream
        empList.stream()
                .sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName))
                .forEach(System.out::println);



    }
}
