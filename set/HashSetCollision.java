package javaCollections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //BAD : Forcing collision (All objects go to same bucket in hash table)
    @Override
    public int hashCode() {
        return 1;   //constant hash code
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id && Objects.equals(name, s.name);
    }

    @Override
    public String toString() {
        return id +"-"+ name;
    }
}

public class HashSetCollision {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        Student s1 = new Student(1, "sam");
        Student s2 = new Student(2, "john");
        Student s3 = new Student(1, "sam");     //duplicate of s1

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(new Student(3, "rob"));

        System.out.println("Set: "+ studentSet);
    }
}
