package DataStructure.LinkedList;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
public class Student implements Comparable<Student> {

    private String name;
    private int rno;
    private double average;

    public Student(String name, int rno, double average) {
        this.name = name;
        this.rno = rno;
        this.average = average;
    }

    public static Comparator<Student> averageComparator = (o1, o2) -> Double.compare(o1.average, o2.average);
    public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);


    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Saurav", 3, 99.8));
        studentList.add(new Student("Aadil", 1, 69.8));
        studentList.add(new Student("Prashant", 2, 9.8));
        studentList.sort(Student.averageComparator);
        studentList.sort(Student.nameComparator);
        System.out.println(studentList.toString());
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
        //  return Double.compare(this.average,o.average); asc
        //  return Double.compare(o.average,this.average); desc
    }
}
