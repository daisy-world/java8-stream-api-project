package TerminalOperationsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny()
//findFirst()
public class TerminalOperationExample6 {
    public static void main(String[] args) {

        List<String> courseList= Arrays.asList("Java","Python","Ruby","Javascript","Java","Angular","React");

        //findAny()
      /*  Optional<String> result = courseList.stream()
                                           .findAny();
          if(result.isPresent()) {
              System.out.println(result.get());
          }*/
      //findFirst()

        Optional<String> result = courseList.stream()
                                           .findFirst();
        if(result.isPresent()) {
            System.out.println(result.get());
        }
    }
}
