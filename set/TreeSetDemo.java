package javaCollections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(20);    //duplicate ignored
//        treeSet.add(null);    //Not allowed

        System.out.println(treeSet);

        System.out.println("Smallest: "+ treeSet.first());
        System.out.println("Largest: "+ treeSet.last());
        System.out.println("Higher than 20: "+ treeSet.higher(20));
        System.out.println("Lower than 20: "+ treeSet.lower(20));
    }
}