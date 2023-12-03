package FuntionalProgramming;

import java.util.List;

public class FP01EX {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printOdd(numbers);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        //fourLetterCourses(courses);
        courses.stream().map(c -> c + " " + c.length()).forEach(System.out::println);

    }

    public static void printOdd(List<Integer> numbers) {
        numbers.stream().filter(s -> !(s % 2 == 0)).forEach(System.out::println);
    }

    public static void printSpring(List<String> courses) {

        courses.stream().filter(s -> s.contains("Spring")).forEach(System.out::println);
    }

    public static void fourLetterCourses(List<String> courses) {
        courses.stream().filter(s -> s.length() > 4).forEach(System.out::println);
    }
}
