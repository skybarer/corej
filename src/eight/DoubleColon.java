package eight;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class DoubleColon {

    public static void main(String[] args) {
        // Creating predicate
        Predicate<Integer> lesserThan = (i) -> i < 48;
        // Calling Predicate method
        System.out.println(lesserThan.test(10));


        // Get the stream
        Stream<String> stream = Stream.of("Skybarer", "For", "Skybarer", "A", "Computer", "User");
        stream.forEach(System.out::println);
    }
}
