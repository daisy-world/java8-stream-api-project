package TerminalOperationsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//collect()
public class TerminalOperationExample1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Albert","Daisy","David","Daniel","Lewis","Sanya","Edward");

       /* List<String> resultList = list.stream()
                                      .collect(Collectors.toList());

        System.out.println(resultList);
    */
        Long collect = list.stream()
                           .collect(Collectors.counting());
        System.out.println(collect);
    }

}
