package TerminalOperationsDemo;

import java.util.Arrays;
import java.util.List;

//forEach()
public class TerminalOperationExample2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Albert","Daisy","David","Daniel","Lewis","Sanya","Edward");

        list.stream()
                .forEach(System.out::println);


    }
}
