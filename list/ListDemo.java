/*

* List is a subinterface of Collection.
* It represents an ordered collection (also called a sequence).
* Duplicates are allowed (unlike Set).
* null values are allowed
* Provides positional access (via index like arrays).
* Maintains insertion order

public interface List<E> extends Collection<E>

* ordered -> maintains insertion order
* Duplicates are allowed
* Indexed -> each element has an index

Methods of List -

boolean add(int index, E e)                 //Add an element at specified index
boolean addAll(int index, Collection<> c)   //Add elements of collection at specified index
E get(int index)                            //returns element at index
E set(int index, E e)                       //replaces element at index
int indexOf(Object o)                       //return index of first occurence
int lastIndexOf(Object o)                   //return index of last occurence
ListIterator<E> listIterator()              //Returns ListIterator for bi-directional traversal
List<E> subList(int fromIndex, int toIndex) //Returns a view of a portion of list

* changes in sublist reflects in original list

* */

package javaCollections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Santo");
        names.add("Tony");
        names.add("Mony");
        names.add("Tony");

        System.out.println("list: "+ names);

        //Get by index
        System.out.println("index 2: "+ names.get(2));

        //Replace element
        names.set(2, "Sony");
        System.out.println("After set: "+ names);

        System.out.println("Index: "+ names.lastIndexOf("Tony"));

        //sublist
        List<String> sub = names.subList(1, 3);
        System.out.println("sublist: "+ sub);

        sub.set(0, "Gony");
        System.out.println(names);

        //iterating with listIterator
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Forward: "+ listIterator.next());
        }

        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.println("Previous: "+ listIterator.previous());
        }
    }
}
