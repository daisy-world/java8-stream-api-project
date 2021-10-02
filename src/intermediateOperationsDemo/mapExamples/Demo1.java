package intermediateOperationsDemo.mapExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,5,7,9);
        List<Integer> resultList=new ArrayList<Integer>();
        // without using stream

      /*  for (int n:list) {
            resultList.add(n*n);
        }
        System.out.println(resultList);*/

        //  using stream

        resultList=   list.stream()
                          .map(n->n*n)
                          .collect(Collectors.toList());
       // System.out.println(resultList);
        list.stream().map(n->n*n).forEach(System.out::println);

    }
}
