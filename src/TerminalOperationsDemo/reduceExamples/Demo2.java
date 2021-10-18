package TerminalOperationsDemo.reduceExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Marco","Daisy","Michael","Sanya","Robin");

        Optional<String> result = list.stream()
                .reduce((a, b) -> a.length() > b.length() ? a : b);

        System.out.println(result.get()); //Michael

    }
}
