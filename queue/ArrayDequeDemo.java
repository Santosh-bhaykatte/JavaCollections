/*

ArrayDeque (Array Double Ended Queue) is a resizable array-based implementation of Deque.

ArrayDeque maintains a circular array (default capacity = 16).
Supports insertion & removal at both ends head (front) & tail (rear).

Two pointers:
head → index of first element
tail → index after last element

Can be used as:
Queue (FIFO) → offer(), poll(), peek()
Stack (LIFO) → push(), pop(), peek()
Null elements are not allowed.

Faster than Stack and LinkedList for most use cases.
______________________________________________________

* Advantages & Disadvantages:

✅ Advantages:
Faster than LinkedList (array-based, better cache locality).
Can be used as both Queue & Stack.
No capacity restrictions (resizes dynamically).

❌ Disadvantages:
Not thread-safe → multiple threads modifying without synchronization may cause issues.
Cannot store null elements (throws NullPointerException).

_________________________________________________________

* Interview-Focused Points:

ArrayDeque vs LinkedList:
ArrayDeque is faster (array-based, less memory overhead, better cache locality).
LinkedList uses more memory (node objects, pointers).

ArrayDeque vs Stack:
ArrayDeque is preferred over Stack (legacy class, synchronized, slower).

When does ArrayDeque resize?
When head == tail (array full).
Doubles capacity.

Time complexities:
Insert/remove at head/tail → O(1) amortized.
Resizing → O(n) (rare).

* */

package javaCollections.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        //Adding elements at both ends
        deque.add("B");
        deque.addFirst("C");
        deque.addLast("D");
        deque.addFirst("A");

        System.out.println("Deque: "+ deque);

        //Removing elements from both ends
        System.out.println("Remove first : "+ deque.removeFirst());
        System.out.println("Remove last: "+ deque.removeLast());
        System.out.println("After removals: "+ deque);

        //stack behavior
        deque.push("X");
        deque.push("Y");
        System.out.println("Stack Mode: "+ deque);  //[Y, X, C, B]

        System.out.println("Pop: "+ deque.pop());   //removes Y
    }
}
