package intermediateOperationsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethodExample {
    public static void main(String[] args) {
    List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <=20 ; i++) {
            numList.add(i);
        }
        System.out.println(numList);

        List<Integer> resultList = numList.stream()
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
