/* LinkedList

A class in Java that implements both:

List interface → maintains insertion order, allows duplicates and null values.
Deque interface → supports insertion/deletion from both ends.

Unlike ArrayList (backed by dynamic array), LinkedList is backed by a doubly linked list.

* Each node has 3 parts:
    [ prev | data | next ]

prev → reference to previous node
data → actual element
next → reference to next node

public class LinkedList<E>
    extends AbstractSequentialList<E>
    implements List<E>, Deque, Cloneable, Serializable

* Key Properties:

Dynamic size → grows/shrinks easily.
No capacity concept (unlike ArrayList).
Insertion/Deletion is fast (O(1)) at beginning/middle/end if reference is known.
Access/Search is slow (O(n)) because it needs traversal.
Allows duplicates & nulls.
Not synchronized by default.

* */

package javaCollections.list;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);

        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list.toString());

        list.remove("B");
        System.out.println(list);

        list.removeLast();

        System.out.println("First: "+ list.getFirst());
        System.out.println("Last: "+ list.getLast());

        // Iterate
        for(String s : list) {
            System.out.println(s);
        }
    }
}
