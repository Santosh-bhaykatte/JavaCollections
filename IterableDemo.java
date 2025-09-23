/*

Iterable
  └── Collection
        ├── List (ordered, allows duplicates, index-based)
        │     ├── ArrayList
        │     ├── LinkedList
        │     └── Vector (legacy)
        │           └── Stack (legacy)
        │
        ├── Set (unique elements, no duplicates)
        │     ├── HashSet
        │     │     └── LinkedHashSet
        │     └── TreeSet
        │
        └── Queue (FIFO, special purpose)
              ├── PriorityQueue
              └── ArrayDeque

        Map (NOT part of Collection, but very important)
        ├── HashMap
        │     └── LinkedHashMap
        ├── TreeMap
        └── Hashtable (legacy)


* */

// Iterable - root interface for all collections except Map
// only one abstract method
/*
* Iterator<E> iterator()
* returned iterator works with hasNext(), next() and remove()

* hasNext(), next() and remove() - Methods in Iterator<E> interface
* */

package javaCollections;

import java.util.*;

public class IterableDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("Apple");
        fruits.add("Grapes");

        //Enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();

        //Using Iterator
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
