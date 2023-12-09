package FuntionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP04CustomClass {

    public static void main(String[] args) {
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000), new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000), new Course("Microservices", "Microservices", 96, 25000), new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000), new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000), new Course("Kubernetes", "Cloud", 91, 20000));

        System.out.println(courses.stream().allMatch(c -> c.getReviewScore() > 90));//true
        System.out.println(courses.stream().noneMatch(c -> c.getReviewScore() > 90));//false
        System.out.println(courses.stream().anyMatch(c -> c.getReviewScore() > 90));//true

        Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparingInt(Course::getNoOfStudents);
        System.out.println(courses.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));

        courses.stream().sorted(Comparator.comparingInt(Course::getNoOfStudents).reversed()).forEach(System.out::println);
        courses.stream().sorted(Comparator.comparingInt(Course::getNoOfStudents).thenComparing(Course::getReviewScore)).forEach(System.out::println);
        courses.stream().sorted(Comparator.comparing(Course::getName)).forEach(System.out::println);
        System.out.println(courses.stream().mapToInt(Course::getNoOfStudents).max());
        System.out.println(courses.stream().mapToInt(Course::getNoOfStudents).count());
        System.out.println(courses.stream().mapToInt(Course::getNoOfStudents).sum());
    }
}
