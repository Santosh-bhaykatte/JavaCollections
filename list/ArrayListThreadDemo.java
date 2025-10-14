/*
ArrayList.add() internally does:

1. Ensure capacity
2. Place element at elementData[size]
3. Increment size

If two threads run in parallel:

Both check capacity simultaneously.
Both write to the same index in elementData.
Both increment size without atomicity.

This causes lost updates, inconsistent size

* */

package javaCollections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; ++i) {
                list.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; ++i) {
                list.add(i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Total size: "+ list.size());
    }
}
