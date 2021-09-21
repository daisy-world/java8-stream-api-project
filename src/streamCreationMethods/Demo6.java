package streamCreationMethods;

import java.util.stream.Stream;

public class Demo6 {
    public static void main(String[] args) {

        //Stream.Builder()

        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("Rahul")
                                        .add("Sachin")
                                         .add("Sourav")
                                         .add("Sehwag")
                                         .add("Laxman").build();
        stream.forEach(System.out::println);

    }
}
