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

* Important Methods

Adding: add(), addFirst(), addLast(), offer(), offerFirst(), offerLast()
Removing: remove(), removeFirst(), removeLast(), poll(), pollFirst(), pollLast()
Accessing: get(), getFirst(), getLast(), peek(), peekFirst(), peekLast()


* Differences -                 ArrayList       LinkedList
1. Access by index -              O(1)            O(n)
2. Insert/Delete in middle -      O(n)            O(1) if reference is known
3. Insert/Delete at start -       O(n)            O(1)
4. Memory                         Less            More (extra prev/next)
5. Cache Locality                 Better          Poor

* ArrayList still outperforms LinkedList in iteration & access because of cache locality

* */

package javaCollections.list;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);

        ((LinkedList<String>) list).addFirst("Start");
        ((LinkedList<String>) list).addLast("End");

        System.out.println(list.toString());

        list.remove("B");
        System.out.println(list);

        ((LinkedList<String>) list).removeLast();

        System.out.println("First: "+ ((LinkedList<String>) list).getFirst());
        System.out.println("Last: "+ ((LinkedList<String>) list).getLast());

        System.out.println();
        System.out.println("Peeked ele: "+ ((LinkedList<String>) list).peek());
        System.out.println("Peeked ele: "+ ((LinkedList<String>) list).peekFirst());
        System.out.println("Peeked ele: "+ ((LinkedList<String>) list).peekLast());



        System.out.println();
        // Iterate
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println();
        // Using ListIterator
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Ele: "+ listIterator.next());
        }
    }
}
