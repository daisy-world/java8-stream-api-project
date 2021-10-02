package intermediateOperationsDemo.StreamSortingExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sorting a List of Integers

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,11,3,5,10,7,29);

        //without using stream
      /*  Collections.sort(list);      //natural order sorting or sorting in ascending order
        System.out.println(list);*/   // op: [2, 3, 5, 7, 10, 11, 29]
        Collections.sort(list,Collections.reverseOrder());   // sorting in descending order
        System.out.println(list);                           // op:  [29,11,10,7,5,3,2]

        // using stream
        /*list.stream()
            .sorted()                                        //natural order sorting  or sorting in ascending order
            .forEach(System.out::println); */
        list.stream()
             .sorted(Comparator.reverseOrder())
             .forEach(System.out::println);

    }

}
