package PredicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Verwende ein Predicate, um nur gerade Zahlen zu filtern
        List<Integer> evenNumbers = filterNumbers(numbers, num -> num % 2 == 0);

        System.out.println("Ursprüngliche Liste: " + numbers);
        System.out.println("Gefilterte Liste (nur gerade Zahlen): " + evenNumbers);
    }

    // Methode zum Filtern von Zahlen mit einem Predicate
    private static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.stream()
                .filter(predicate::test)
                .collect(Collectors.toList());
    }
}

@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}

