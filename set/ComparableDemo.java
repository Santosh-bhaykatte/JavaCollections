/*
* Comparable (Natural Ordering):

A class implements Comparable<T> to define its natural/default order.
Example: String, Integer, etc. already implement Comparable.

You override the method:
* public int compareTo(T o)

Returns 0 if equal
Returns negative if this < o
Returns positive if this > o
_______________________________________________

* Comparator (Custom Ordering):

* What if you want multiple ways of sorting? (by id, by name, etc.)

* You don’t want to fix sorting inside the class (like Comparable does).

That’s where Comparator<T> comes in.

You create an external comparator object and pass it to TreeSet.

* */

package javaCollections.set;

import java.util.Comparator;
import java.util.TreeSet;

class Employee {
    int id;
    int age;
    String name;

    Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    /*
    @Override
    public int compareTo(Employee s) {
        return this.id - s.id;
    }

     */
    @Override
    public String toString() {
        return id +"-"+ name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        //Comparator for sorting by age
        Comparator<Employee> ageComp = (e1, e2) -> ((Integer) e1.age).compareTo(e2.age);

        //Comparator for sorting by name
        Comparator<Employee> nameComp = (e1, e2) -> e1.name.compareTo(e2.name);

        TreeSet<Employee> set = new TreeSet<>(nameComp);

        set.add(new Employee(3, 23, "santosh"));
        set.add(new Employee(1, 27, "Mahesh"));
        set.add(new Employee(2, 12, "Omesh"));

        System.out.println(set);    //Sorted by name
    }
}
