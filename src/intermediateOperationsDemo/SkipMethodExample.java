package intermediateOperationsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipMethodExample {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(0,1,2,3,4,5,10,20,30,40,50);
        List<Integer> resultList = numList.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
