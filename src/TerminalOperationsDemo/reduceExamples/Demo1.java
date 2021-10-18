package TerminalOperationsDemo.reduceExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30);

       // before java 8
        Integer sum = 0;
        for (Integer no:list) {
            sum = sum+no;
        }
        System.out.println(sum);

        // using reduce() method
        Optional<Integer> result = list.stream()
                .reduce((a, b) -> a + b);
        System.out.println(result.get());

        // using method reference
        Optional<Integer> result1 = list.stream()
                .reduce(Integer::sum);
        System.out.println(result1.get());

        Integer result2 = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(result2);
    }
}
