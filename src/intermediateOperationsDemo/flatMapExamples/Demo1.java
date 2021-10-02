package intermediateOperationsDemo.flatMapExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Marco","Daisy");
        List<String> list2 = Arrays.asList("Michael","Sanya");
        List<String> list3 = Arrays.asList("Robin");

        List<List<String>> finalList = Arrays.asList(list1, list2, list3);
        System.out.println(finalList);

        List<String> resultList = finalList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(resultList);


    }

}
