package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //Collections.sort(list)
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2));
        Collections.sort(list);

        //Collections.reverse(list)
        Collections.reverse(list);

//        System.out.println(Collections.max(list));
//        System.out.println(Collections.min(list));

//        System.out.println(list);

        //Collections.frequency(list, element)
        List<String> names = new ArrayList<>(Arrays.asList("A", "B", "A", "A", "C"));
        System.out.println(Collections.frequency(names, "A"));

        //Collections.unmodifiableList(list)
        List<String> data = new ArrayList<>(Arrays.asList("X", "Y"));
        data.add("Z");
        List<String> unmod = Collections.unmodifiableList(data);
        System.out.println(unmod);
//        unmod.add("A");   //not allowed

        //Conversions

        //Array -> list
        String[] arr = {"A", "B", "C"};
        List<String> list1 = Arrays.asList(arr);    //fixed size list
        List<String> list2 = new ArrayList<>(Arrays.asList(arr));   //resizable

        //list -> array
        List<String> list3 = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        String[] arr1 = list3.toArray(new String[0]);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Integer[] arr2 = list4.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));
    }
}
