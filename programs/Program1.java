/*
Write a program that takes a List of integers with duplicates ([1, 5, 2, 8, 5, 2, 9]) and prints a list of unique integers in sorted order.
* */

package javaCollections.programs;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 2, 8, 5, 2, 9);
        List<Integer> uniqueSorted = new ArrayList<>(new TreeSet<>(list));
        System.out.println("Unique sorted list: "+ uniqueSorted);
    }
}
