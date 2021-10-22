package TerminalOperationsDemo.minMaxExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
//Min & Max for Integer
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30);

        //min()
        Optional<Integer> minValue = list.stream()
                .min(Comparator.comparing(Integer::intValue));
        if(minValue.isPresent()){
            System.out.println(minValue.get()); //10
        }
        list.stream()
                .min(Comparator.comparing(Integer::intValue))
                .ifPresent(no-> System.out.println("the min value is..." + no));
        //max()
        list.stream()
                .max(Comparator.comparing(Integer::intValue))
                .ifPresent(no-> System.out.println("the max value is ..." +no)); //30

    }
}
