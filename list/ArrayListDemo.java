/*
* ArrayList is a resizable array implementation of the List interface.
* Part of java.util package.
* Unlike arrays (fixed size), ArrayList can grow/shrink dynamically.
* Maintains insertion order.
* Allows duplicate elements and null values.
👉 It is not synchronized (multiple threads modifying it simultaneously can cause issues).
*
* _____________________________________________________________________________
* It can not automatically shrink, capacity remains same after removing elements
* trimToSize() → reduces capacity to current size.
* _____________________________________________________________________________

* public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, Serializable {
            transient Object[] elementData;     //hold elements of list
            private int size;                   //number of elements stored

            //Overridden Methods of List<E>, Collection<E>
        }

* Interfaces Implemented:

List → ordered, duplicates allowed.
RandomAccess → supports fast random access (get() is O(1)).
Cloneable → supports shallow copy via clone().  //Only references are copied, not actual objects
Serializable → can be serialized.

* Internal Implementation:

Backed by a dynamic array → transient Object[] elementData;

Default capacity = 10 (when first element is added).

When full → grows by 50% (newCapacity = oldCapacity + oldCapacity/2).

Index-based access like an array.

Uses System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) when shifting elements (insert/remove in middle).

* ✅ Advantages:

Fast random access (get() and set() are O(1)).
Dynamic resizing (no fixed size).
Easy to use, widely adopted.

❌ Disadvantages:

Slower insertions/removals in middle (O(n)) due to shifting.
Consumes more memory (array may be partially empty).
Not thread-safe (must use Collections.synchronizedList() for multithreading).

* */

package javaCollections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    static List<String> removeEleByIndex(int index, List<String> list) {
        int size = list.size();
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: "+ index +", Size: "+ size);
        }

        int eleMoved = size-index-1;
        String[] arr = list.toArray(new String[0]);

        if (eleMoved > 0) {
            System.arraycopy(arr, index+1, arr, index, eleMoved);
        }
        arr[--size] = null;

        return new ArrayList<>(Arrays.asList(arr).subList(0, size));
    }
    public static void main(String[] args) {
        /*
        List<String> list = new ArrayList<>();

        list.add("sam");    //Expands initial capacity to 10
        list.add("john");
        list.add("edd");
        list.add("sam");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.contains("john"));

         */
        List<String> list = new ArrayList<>(List.of("A", "B", "C", "D"));
//        System.out.println(removeEleByIndex(2, list));
        System.out.println(removeEleByIndex(1, list));

//        String[] arr = new String[] {"A", "B", "C", "D"};
        List<String> list1 = new ArrayList<>(Arrays.stream(new String[] {"A", "B", "C", "D"}).toList());
        list1.add("100");
        list1.set(1, "K");
        System.out.println(list1);
    }
}
