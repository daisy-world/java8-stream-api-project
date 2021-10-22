package TerminalOperationsDemo.minMaxExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
//Min & Max for String

public class Demo2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Marco","Daisy","Michael","Sanya","Robin");

        //min()
        Optional<String> minValue = list.stream()
                .min(Comparator.comparing(String::valueOf));
        if(minValue.isPresent()){
            System.out.println(minValue.get()); // Daisy
        }

        list.stream()
                .min(Comparator.comparing(String::valueOf))
                .ifPresent(no-> System.out.println("min value is .." + no)); // Daisy
        // max()
        list.stream()
                .max(Comparator.comparing(String::valueOf))
                .ifPresent(no-> System.out.println("max value is .." + no)); // Sanya

    }
}
