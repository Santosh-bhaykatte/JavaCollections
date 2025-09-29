package javaCollections;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        //Arrays.toString(arr)
/*        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));*/

        //Arrays.asList(arr)
/*        List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 3);
        list.add(1, 2); //not allowed
        System.out.println(list);*/

        //Arrays.copyOf(arr, newLength)
/*        int[] arr = {1, 2, 3};
        int[] copy = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(copy));*/

        //Arrays.copyOfRange(arr, from, to)
/*        int[] arr = {1, 3, 4, 5, 6};
        int[] copy = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(copy));*/

        //Arrays.sort(arr)
/*        int[] arr = {2, 4, 6, 1, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        //Arrays.binarySearch(arr, key)
/*        int[] arr = {1, 3, 5, 2, 8};
        System.out.println("Index: "+ Arrays.binarySearch(arr, 5));*/

        //Arrays.equals(arr1, arr2)
/*        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));*/

    }
}
