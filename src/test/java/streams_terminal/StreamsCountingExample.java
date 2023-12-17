package streams_terminal;

import data.StudentDataBase;

public class StreamsCountingExample {
    public static long count() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .count();

    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
