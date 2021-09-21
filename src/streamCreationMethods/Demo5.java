package streamCreationMethods;

import java.util.stream.Stream;

public class Demo5 {
    public static void main(String[] args) {

        // Stream.iterate()

        Stream<Integer> stream = Stream.iterate(10,n->n*2).limit(5);
        stream.forEach(System.out::println);
    }
}
