package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithNoInitialValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b); // performs multiplication for each element in the stream and returns a new result fo.
    }

    public static String combineStudentNames() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .distinct()
                .reduce("", String::concat);
    }

    public static Optional<String> getHighestGradeStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2)
                .map(Student::toString);
    }

    public static int noOfNotebooks() {
        return StudentDataBase.getAllStudents().stream().filter(s -> s.getGradeLevel() > 3).map(Student::getNoteBooks).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
        System.out.println("Result is : " + performMultiplication(integerList));
        Optional<Integer> result = performMultiplicationWithNoInitialValue(integerList);
        System.out.println("Result without initial value is : " + result.orElse(0));
        System.out.println("Student Names Combined " + combineStudentNames());
        Optional<String> result1 = getHighestGradeStudent();
        System.out.println("Highest Grade Student is : " + result1.orElse("No data found for Highest Grade Student"));
        System.out.println("Total Number of Notebooks are " + noOfNotebooks());
    }
}
