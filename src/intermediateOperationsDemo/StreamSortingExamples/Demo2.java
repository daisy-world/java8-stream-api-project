package intermediateOperationsDemo.StreamSortingExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sorting a List of Strings
public class Demo2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Marco","Daisy","Michael","Sanya","Robin");

         //without using stream
     /*   Collections.sort(list);                                // sorting in ascending order
        System.out.println(list);                             //op: [Daisy, Marco, Michael, Robin, Sanya]
        Collections.sort(list,Collections.reverseOrder());    //sorting in descending order
        System.out.println(list);   */                         // op:[Sanya, Robin, Michael, Marco, Daisy]

        //using stream

        list.stream()
             .sorted()
             .forEach(System.out::println);

        System.out.println("=======================");
        list.stream()
             .sorted(Comparator.reverseOrder())
              .forEach(System.out::println);

    }
}
