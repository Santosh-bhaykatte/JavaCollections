/*
A Queue in Java follows FIFO (First In, First Out) order.
Elements are inserted at the rear (tail) and removed from the front (head).
It extends the Collection interface.

Key Methods:                                       | If queue is empty

boolean add(E e)    - inserts element at rear      | throws Exception If capacity is full
boolean offer(E e)  - inserts element at rear      | returns false safely

E remove()          - removes head element         | throws NoSuchElementException
E poll()            - removes head element         | returns null

E element()         - retrives head element without| throws NoSuchElementException
                      removing
E peek()            - retrives head element without| returns null
                      removing

* 📌 Rule of Thumb:
Methods ending with offer/poll/peek are safe (return null/false).
Methods like add/remove/element are strict (throws exception).

* Implementations of Queue:

LinkedList → can work as a Queue (FIFO).
PriorityQueue → elements ordered by priority (not strictly FIFO).
ArrayDeque → double-ended queue (can work as both Stack & Queue).

* */

package javaCollections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //Adding elements
        queue.add("A");
        queue.add("B");
        queue.offer("C");   //safe insertion    (returns false if capacity full)

        //Accessing head
        System.out.println("Peek: "+ queue.peek());     //returns null if empty
        System.out.println("Element: "+ queue.element());   //throws exception if empty

        //Removing elements
        System.out.println("Remove: "+ queue.remove());     //throws exception if empty
        System.out.println("Poll: "+ queue.poll());     //safely return null if empty

        System.out.println("Final Queue: "+ queue);
    }
}
