package TerminalOperationsDemo;

import java.util.Arrays;
import java.util.List;

//toArray()
public class TerminalOperationExample4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,7,9,11,13);
        Object[] arr = list.stream()
                           .toArray();

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
