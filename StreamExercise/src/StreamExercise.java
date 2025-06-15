package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Map;

class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return this.name;
        }
        
        public int getScore() {
            return this.score;    
        }
}

public class StreamExercise {

    public static void main(String[] args) {
        // 1. Basic Stream Operations
        // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
        // sort the result in descending order.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Comparator<Integer> decendingInt = (i1, i2) -> i1 > i2 ? -1 : 1;

        List<Integer> num = numbers.stream().filter(d -> d % 2 == 0)
                .map(n -> (int) Math.pow(n, 2)).sorted(decendingInt)
                .collect(Collectors.toList());
        System.out.println(num); // Output: [100, 64, 36, 16, 4]                             

        // 2. Filtering and Collecting
        // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
        List<String> names =
                Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");

        List<String> nam = names.stream().filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(nam); // Output: [Alice, Annie, Alex]

        // 3. Finding Maximum and Minimum
        // Task: Given a list of integers, find the maximum and minimum values using Streams.
        List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);

        Comparator<Integer> sortByMax = (n1, n2) -> n1 > n2 ? -1 : 1;

        List<Integer> maxNum = numbers2.stream().sorted(sortByMax)
                .collect(Collectors.toList());
        System.out.println(maxNum.get(0)); // Output: Max: 30
        System.out.println(maxNum.get(maxNum.size() - 1)); // Output: Min: 5

        // 4. Mapping to a List of Lengths
        // Task: Given a list of strings, map each string to its length and collect the lengths into a
        // List<Integer>
        List<String> words = Arrays.asList("apple", "banana", "pear");
        List<Integer> wordsAns = words.stream().map(d -> d.length())
                .collect(Collectors.toList());
        System.out.println(wordsAns); // Output: [5, 6, 4] (List)

        // 5. Counting Elements
        // Task: Given a list of strings, count how many strings have a length greater than 3.
        List<String> words1 =
                Arrays.asList("hi", "hello", "world", "java", "stream");
        Integer words1Ans =
                (int) words1.stream().filter(d -> d.length() > 3).count();
        System.out.println(words1Ans); // Output: 4

        // 6. Filtering and Collecting to a Set
        // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
        // Set.
        List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
        Set<Integer> numbers3Ans = numbers3.stream()
                .filter(d -> d > 10)
                .collect(Collectors.toSet());
        System.out.println(numbers3Ans); // Output: [15, 20]

        // 7. Mapping to a Map (Key-Value Pairs)
        // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
        // where the key is the student's name and the value is their score.

        // Create Student Class
        // new Student("Alice", 85)
        // new Student("Bob", 75)
        List<Student> students = new ArrayList<>(Arrays.asList(new Student("Alice", 85), new Student("Bob", 75)));
        
        Map<String, Integer> studenMap = students.stream()
                .collect(Collectors.toMap(d -> d.getName(), d -> d.getScore()));
        System.out.println(studenMap); // Output: {Alice=85, Bob=75}



    }
}




