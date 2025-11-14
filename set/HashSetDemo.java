/* Set (Interface)-

* Set is a collection that does not allow duplicate elements. (only unique elements)
* It models the mathematical set abstraction.
* Insertion order depends on the implementation (HashSet, LinkedHashSet, TreeSet).

* Nulls allowed?

HashSet: allows 1 null
LinkedHashSet: allows 1 null
TreeSet: does not allow null (NullPointerException if added)
_____________________________________________________

* Key Characteristics -

Unique elements only → no duplicates.
No index-based access → unlike List, cannot get(0).
_____________________________________________________

* Order depends on implementation:

HashSet: unordered
LinkedHashSet: insertion order      (HashSet + LinkedList)
TreeSet: sorted/natural order
_____________________________________________________

* Implementations-

a) HashSet - unordered collection of unique elements

Backed by HashMap internally.   e.g add(E e) -> HashMap.put(Key, PRESENT)
Elements stored as keys, dummy Object as value.
No ordering guarantee.
Constant time operations (O(1)).  e.g add(E e), remove(Object o), contains(Object o) etc.

b) LinkedHashSet - ordered

HashSet + doubly linked list.
Maintains insertion order.
Slightly slower than HashSet.

c) TreeSet - sorted/natural-ordering

Backed by TreeMap (Red-Black tree) internally.
Elements stored in sorted order.
Operations: O(log n).
Requires elements to be Comparable or a Comparator must be provided.

_____________________________________________________

* Advantages -

1. Prevents duplicates automatically.
2. Provides efficient operations depending on implementation.
3. Specialized implementations for ordering/sorting (TreeSet) and insertion order (LinkedHashSet).

* Disadvantages -

1. No random/index-based access.

2. Choice of implementation affects performance:
HashSet faster but no order    O(1)
TreeSet slower but sorted/ordered      O(log n)

3. Requires proper implementation of hashCode() and equals().
_____________________________________________________

****** Tricky Interview Questions **********

1) Can Set contain null?
→ Depends: HashSet/LinkedHashSet = yes (only 1), TreeSet = no. (NullPointerException)

2) Difference between HashSet and HashMap?
→ HashSet uses HashMap internally, stores elements as keys with dummy Object value (PRESENT).

3) Why Set doesn’t allow duplicates?
→ Because internally uniqueness is ensured using hashing or comparison logic (hashCode() + equals() for HashSet, natural ordering for TreeSet).

4) Difference between HashSet and TreeSet?

HashSet = O(1), unordered. faster
TreeSet = O(log n), ordered/sorted. slower

5) Which is faster HashSet or TreeSet? Why?
HashSet faster (O(1)), TreeSet slower (O(log n)) due to tree balancing.

6) How does HashSet check for duplicates?
Uses hashCode() first → if same bucket, then checks equals().

7) What happens if hashCode() is same but equals() is false?
Both objects can coexist in HashSet (hash collision handled).

* */

package javaCollections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // ---------- HashSet ----------
        System.out.println("---- HashSet ----");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");      //return HashMap.put("Banana", PRESENT) == null;
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple");   //duplicate ignored
        hashSet.add(null);      //Allows one null

        System.out.println("HashSet elements: "+ hashSet);
        //Order is not guaranteed (Unordered)

        // ---------- LinkedHashSet ----------
        System.out.println("\n---- LinkedHashSet ----");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");   //duplicate ignored
        linkedHashSet.add(null);      //Allows one null

        System.out.println("LinkedHashSet elements: "+ linkedHashSet);
        //Maintains Insertion order

        // ---------- TreeSet ----------
        System.out.println("\n---- TreeSet ----");
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Apple"); // duplicate ignored
//        treeSet.add(null); // Throws NullPointerException!

        System.out.println("TreeSet elements: " + treeSet);
        // Sorted order (natural ordering of strings)

    }
}
