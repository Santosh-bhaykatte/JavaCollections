package javaCollections.programs;

import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id +" = "+ name;
    }
}

public class Program2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "sam"));
        students.add(new Student(2, "john"));
        students.add(new Student(3, "rob"));

        students.remove(1);
        System.out.println(students);
    }
}
