/*

ArrayDeque (Array Double Ended Queue) is a resizable array-based implementation of Deque.

Supports insertion & removal at both ends (head & tail).

Can be used as:
Queue (FIFO) → offer(), poll(), peek().
Stack (LIFO) → push(), pop().
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
ArrayDeque is faster (array-based, less memory overhead).
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
        deque.add("A");
        deque.addFirst("B");
        deque.addLast("C");

        System.out.println("Deque: "+ deque);

        //Removing elements from both ends
        System.out.println("Remove first : "+ deque.removeFirst());
        System.out.println("Remove last: "+ deque.removeLast());
        System.out.println("After removals: "+ deque);

        //stack behavior
        deque.push("X");
        deque.push("Y");
        System.out.println("Stack Mode: "+ deque);  //[Y, X, A]

        System.out.println("Pop: "+ deque.pop());   //removes Y
    }
}
