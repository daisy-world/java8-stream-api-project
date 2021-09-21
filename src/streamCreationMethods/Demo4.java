package streamCreationMethods;

import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {

        //Stream.generate()

        Stream<String> stream = Stream.generate(()->"stream").limit(5);
        stream.forEach(System.out::println);

    }
}
