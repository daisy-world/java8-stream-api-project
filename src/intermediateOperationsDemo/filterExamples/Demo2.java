package intermediateOperationsDemo.filterExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Lipsa","Daisy","David","Daniel",null,"Sanya",null);
        List<String> resultList = new ArrayList<String>();

        resultList=list.stream().filter(name->name!=null && name.startsWith("D")).collect(Collectors.toList());

                 list.stream()
                .filter(name->name!=null && name.startsWith("D"))
                .forEach(System.out::println);
       // System.out.println(resultList);
    }
}
