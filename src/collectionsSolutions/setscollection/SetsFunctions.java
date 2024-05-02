package collections.setscollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsFunctions {
    public static void main(String[] args) {

        /*
         * Collections are the framework used to store and manipulate a group of objects.
         * Java Collection is a single unit of objects and cannot store primitive types directly.
         */

        // Creating a Collection, we have two Integer sets
        Integer[] A = {22, 45, 33, 66, 55, 34, 77};
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};

        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(A));

        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(B));

        // Finding the UNION of set1 and set2

        // addAll() adds multiple elements from one collection to another w/o duplicates
        Set<Integer> union_data = new HashSet<Integer>(set1);
        union_data.addAll(set2);
        System.out.print("Union of set1 and set2 is:");
        System.out.println(union_data);

        // Finding INTERSECTION of set1 and set2

        // retainAll() finds the intersection between two sets or collections
        // Only common elements present in both sets are returned and all others are removed

        Set<Integer> intersection_data = new HashSet<Integer>(set1);
        intersection_data.retainAll(set2);
        System.out.print("Intersection of set1 and set2 is:");
        System.out.println(intersection_data);

        // Finding DIFFERENCE of set1 and set2

        // removeAll() removes all elements from one collection that are also present in another
        // Removes all elements from set1 that are present in set2
        // Finally, storing the result in difference_data set.

        Set<Integer> difference_data = new HashSet<Integer>(set1);
        difference_data.removeAll(set2);
        System.out.print("Difference of set1 and set2 is:");
        System.out.println(difference_data);


    }
}
