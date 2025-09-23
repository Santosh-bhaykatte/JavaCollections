/*
Stack is legacy class, extends Vector in java.util package
It inherits all Vector properties (dynamic array, synchronized).
It follows the LIFO (Last-In, First-Out) principle.
Being based on Vector → it is synchronized.

Methods:
push(E e) - Pushes an element onto the top of the stack.
pop()     - Removes and returns the top element (throws EmptyStackException if empty).
peek()    - Returns (but does not remove) the top element.
empty()   - Checks if stack is empty.
search(Object o)    - Returns 1-based position of object from top (−1 if not found).

___________________________________
Deque<Integer> stack = new ArrayDeque<>();
stack.push(10);
stack.push(20);
System.out.println(stack.pop());  // 20

* Faster than Stack (no synchronization overhead).
* More flexible (Deque can be used as queue or stack).
____________________________________

* */

package javaCollections.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.search("A")); // 2 (position from top)
        System.out.println(stack.empty());     // false
    }
}
