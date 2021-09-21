package streamCreationMethods;

import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {

        // Stream.of()
        Stream<Integer> stream = Stream.of(10,20,30,40,50);
        //stream.forEach(n-> System.out.println(n));
        stream.forEach(System.out::println);
    }
}
