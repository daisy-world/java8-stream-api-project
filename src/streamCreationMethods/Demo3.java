package streamCreationMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {

        //List.stream() // create a stream from a collections (collection,List,Set)
        List<String> list = Arrays.asList("Rahul","Sachin","Sourav","Laxman","Sehwag");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        

    }
}
