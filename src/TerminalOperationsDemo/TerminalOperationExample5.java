package TerminalOperationsDemo;

import java.util.Arrays;
import java.util.List;

//anyMatch()
//allMatch()
//noneMatch()
public class TerminalOperationExample5 {
    public static void main(String[] args) {
        List<String> courseList= Arrays.asList("Java","Python","Ruby","Javascript","Java","Angular","React");

        //anyMatch()
        boolean b = courseList.stream()
                .anyMatch(course -> course.contains("Java"));
        System.out.println(b); //true

        //allMatch()
         b = courseList.stream()
                .allMatch(course -> course.contains("Java"));
        System.out.println(b); //false

      //noneMatch()
        b = courseList.stream()
                .noneMatch(course -> course.contains("java"));
        System.out.println(b); //true

    }
}
