/*

* Collection is the root interface of the Collections Framework in Java (except for Map hierarchy).
* Declared in java.util package.
* It represents a group of objects (called elements).
* Subinterfaces: List, Set, Queue, Deque.

* It only declares a container
* Different operations e.g add(E e), addAll(Collection<> c), remove(Object o), size(), contains(Object o), clear(), isEmpty()

* Order & uniqueness is decided by it's SubInterfaces (List, Set, Queue)

public interface Collection<E> extends Iterable<E>

* */

package javaCollections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //Collection reference with ArrayList implementation
        Collection<String> fruits = new ArrayList<>();

        fruits.add("banana");   //add element
        fruits.add("Apple");
        fruits.add("grapes");
        fruits.add("orange");

        //size
        System.out.println("No. fruits: "+ fruits.size());
        System.out.println(fruits);

        //remove
        System.out.println(fruits.remove("banana"));
        System.out.println(fruits);

        //contains
        System.out.println(fruits.contains("Apple"));

        //isEmpty
        System.out.println(fruits.isEmpty());

        //clear
        fruits.clear();
        System.out.println(fruits);
    }
}
