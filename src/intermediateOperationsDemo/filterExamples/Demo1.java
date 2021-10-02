package intermediateOperationsDemo.filterExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,17,20,15,30);

        List<Integer> evenList = new ArrayList<Integer>();

        //without using stream
      /*  for (int n:list) {
            if(n%2==0){
                evenList.add(n) ;
            }
        }
        System.out.println(evenList);


    */

     //   using stream

        evenList=  list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenList);

    }

}
