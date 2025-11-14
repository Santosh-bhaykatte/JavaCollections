/*
What is Hashing?

Hashing = Technique of converting an object into a number (hash code) using a hash function.
This number helps in deciding where to store the object in memory (bucket in hash table).

👉 Example:
"Apple".hashCode() → returns an int (e.g., 2031744).
HashSet/HashMap uses this hash code to find the bucket (index in internal array).

So hashing = fast lookup instead of scanning all elements.
_____________________________________________________

HashSet internally uses HashMap.
When you do set.add("Apple"), HashSet actually does HashMap.put("Apple", PRESENT) where PRESENT is a dummy object value.

Step by Step:

Call hashCode() of "Apple".
Example: 2031744.

HashSet applies a hashing algorithm → finds an index in the internal array (bucket).
If that bucket is empty → store "Apple".
If bucket is not empty (collision), it checks each element in that bucket using equals():
If any existing object is equal (equals() returns true), then "Apple" is duplicate → not added.
Otherwise, store it in that bucket (as a linked list/tree entry).

_____________________________________________________

How uniqueness is ensured:

hashCode() → decides the bucket where the object will go.
equals() → decides whether two objects in the same bucket are really equal.

👉 Both must work together:
If two objects have different hash codes → they go to different buckets → unique.
If two objects have the same hash code (collision), then HashSet calls equals() to confirm uniqueness.

_____________________________________________________

* */

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
        if (!(o instanceof Student s)) return false;
//        Student s = (Student) o;
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
        System.out.println(studentSet.add(s3));
        studentSet.add(new Student(3, "rob"));

        System.out.println("Set: "+ studentSet);
    }
}

/* Execution flow -

s1.hashCode() = 1 → bucket 1 → empty → insert s1.

s2.hashCode() = 1 → bucket 1 → collision! → compare with s1 using equals().
s2.equals(s1) → false → insert s2 in same bucket.

s3.hashCode() = 1 → bucket 1 → collision! → compare with s1.
s3.equals(s1) → true → duplicate → not inserted.

* */
