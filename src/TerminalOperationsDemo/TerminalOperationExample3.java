package TerminalOperationsDemo;

import java.util.Arrays;
import java.util.List;

//count()
public class TerminalOperationExample3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,7,9,11,13);

        long count = list.stream()
                .count();
        System.out.println(count);

    }
}
