package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExercise {
       public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    Comparator<Integer> decendingInt =
            (i1, i2) -> i1 > i2 ? -1 : 1;
    
    List<Integer> num = numbers.stream()
            .filter(d -> d % 2 == 0)
            .map(n -> (int) Math.pow(n, 2))
            .sorted(decendingInt)
            .collect(Collectors.toList());
    System.out.println(num); // Output: [100, 64, 36, 16, 4]                             

    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    
    List<String> nam = names.stream()
        .filter(s -> s.startsWith("A"))
            .collect(Collectors.toList());
    System.out.println(nam); // Output: [Alice, Annie, Alex]

    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    
    Comparator<Integer> sortByMax = (n1, n2) -> n1 > n2 ? -1 : 1;
    
    List<Integer> maxNum = numbers2.stream()
        .sorted(sortByMax)
        .collect(Collectors.toList());
    System.out.println(maxNum.get(0)); // Output: Max: 30
    System.out.println(maxNum.get(maxNum.size() - 1)); // Output: Min: 5
    

    }
}
