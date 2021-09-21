package streamCreationMethods;

import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {

        //Stream.of(array)  // create a stream from an array

        Stream<String> stream = Stream.of(new String [] {"Rahul","Sachin","Sourav","Laxman","Sehwag"});
        stream.forEach(System.out::println);
    }
}
