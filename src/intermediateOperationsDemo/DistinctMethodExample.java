package intermediateOperationsDemo;

import java.util.Arrays;
import java.util.List;

public class DistinctMethodExample {
    public static void main(String[] args) {
        List<String> courseList= Arrays.asList("Java","Python","Ruby","Javascript","Java","Angular","React");
        courseList.stream()
                  .distinct()
                  .forEach(System.out::println);
    }
}
