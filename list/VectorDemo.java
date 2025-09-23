/* Vector - (legacy)

* Grows automatically when capacity is reached:
If capacityIncrement is specified → increases by that amount.
Else, it doubles the current capacity.

Vector()                     // default capacity = 10
Vector(int initialCapacity)
Vector(int initialCapacity, int capacityIncrement)
Vector(Collection<? extends E> c)

* Thread safety by default. Synchronized Methods using intrinsic lock
* Lower performance in single threaded scenarios

* */

package javaCollections.list;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>(10, 5);

        vector.add(1);
        vector.add(2);
        vector.add(3);

        ListIterator<Integer> listIterator = vector.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("Ele: "+ listIterator.next());
        }
        System.out.println(vector);
    }
}
