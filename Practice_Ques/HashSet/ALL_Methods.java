package Practice_Ques.HashSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class ALL_Methods {
    static void HashSetMethods() {

        // Syntax
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("Akash");
        set.add("Yash");
        set.add("Lav");
        set.add("Kratika");
        set.add("Aarushi");
        set.add("Ritesh");

        // Duplicate element (will not be added)
        System.out.println(set.add("Yash"));    // false
        System.out.println(set.add("Ayushi"));  // true

        // Printing the HashSet
        System.out.println(set);

        // Checking whether an element exists
        System.out.println(set.contains("Lav"));    // true
        System.out.println(set.contains("Riya"));   // false

        // Removing an element
        System.out.println(set.remove("Lav"));      // true
        System.out.println(set.remove("Riya"));     // false

        // Size of the HashSet
        System.out.println(set.size());

        // Checking if the set is empty
        System.out.println(set.isEmpty());

        // Traversing the HashSet
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println();

        // Traversing using Iterator
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        -> An Iterator is an object that lets you access the elements of a collection one by one.
//        -> hasNext() → Checks whether another element exists.
//        -> next() → Returns the next element and moves the iterator forward.

        // Converting to Array
        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));

        // Clearing the HashSet
        set.clear();

        // Check after clearing
        System.out.println(set.isEmpty()); // true
    }

    public static void main(String[] args) {
        HashSetMethods();
    }
}
