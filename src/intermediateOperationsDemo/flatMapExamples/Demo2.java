package intermediateOperationsDemo.flatMapExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,3);
        List<Integer> list2 = Arrays.asList(5,7);
        List<Integer> list3 = Arrays.asList(9,11);

        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
       List<Integer> resultList = finalList.stream()
                                           .flatMap(list->list.stream())
                                            .filter(n->n%2==0)
                                           .collect(Collectors.toList());
        System.out.println(resultList);

    }

}
