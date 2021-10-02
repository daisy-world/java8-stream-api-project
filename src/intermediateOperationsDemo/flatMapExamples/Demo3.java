package intermediateOperationsDemo.flatMapExamples;

import util.Author;
import util.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        List<Author> authorList= Arrays.asList(new Author(1,"author1", Arrays.asList("book1","book2")),
                                               new Author(2,"author2", Arrays.asList("book3","book4")),
                                               new Author(3,"author3", Arrays.asList("book5","book6")));

        System.out.println(authorList);

        //map() // List<Author> -> List<String> // op : [author1,author2,author3]
   List<String>  nameList =    authorList.stream()
                  .map(author->author.getName())
                   .collect(Collectors.toList());

        System.out.println(nameList);


        List<List<String>> bookList1 = authorList.stream()
                .map(list -> list.getBooks())
                .collect(Collectors.toList());
        System.out.println(bookList1);


        // flatMap() // List<Author> -> book list // op:[book1,book2,book3,book4,book5,book6]
        List<String> bookList = authorList.stream()
                .flatMap(list -> list.getBooks().stream())
                .collect(Collectors.toList());
        System.out.println(bookList);
    }
}
