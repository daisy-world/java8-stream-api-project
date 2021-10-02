package intermediateOperationsDemo.mapExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Marco","Daisy","Michael","Sanya","Robin");
        List<String> resultList = new ArrayList<String>();
        //without using stream
       /* for (String name:list) {
            resultList.add(name.toUpperCase())  ;
        }
        System.out.println(resultList);*/

        //using stream
                list.stream()
                    .map(name->name.toUpperCase())
                    .forEach(System.out::println);
        resultList= list.stream()
                        .map(name->name.toUpperCase())
                        .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
