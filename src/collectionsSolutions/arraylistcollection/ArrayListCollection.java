package collections.arraylistcollection;

// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html
import java.util.ArrayList; // import the ArrayList class

public class ArrayListCollection {
    public static void main(String[] args) {

        // 1. Create an ArrayList of participants
        ArrayList<String> participantList = new ArrayList<String>();

        // Alternate way of declaring an AnralyList
        // ArrayList<String> participantList = new ArrayList<>();

        System.out.println("ArrayList initially: " + participantList);

        // 2. add users using add() method
        participantList.add("James");
        System.out.println("ArrayList add one element: " + participantList);

        participantList.add("Patrick");
        System.out.println("ArrayList add two elements: " + participantList);

        participantList.add("Angela");
        System.out.println("ArrayList add three elements: " + participantList);

        // 3. An element of the same value can be added where two instances of 'Benny were added'
        participantList.add("Benny");
        System.out.println("ArrayList add four elements: " + participantList);

        participantList.add("Benny");
        System.out.println("ArrayList add five elements: " + participantList);

        // 3. Upon removing 'Benny', the first instance of 'Benny' is removed
        participantList.remove("Benny");
        System.out.println("After Benny is removed: " + participantList);

        // 4. Continue removing users using remove() method
        participantList.remove("James");
        System.out.println("ArrayList remove one element: " + participantList);

        participantList.remove("Patrick");
        System.out.println("ArrayList remove one element: " + participantList);

        /*
         * ArrayList has get() and set() methods to access and modify elements
         * get() method returns the element at the specified position in the list
         * set() method replaces the element at the specified position in the list
         */

        // 5. Get the value of index one from the array list
        String participant = participantList.get(1);
        System.out.println("Participant at Index 1 is: " + participant);

        // 6. Set the value of index one to 'Jenny'
        participantList.set(1, "Jenny");
        System.out.println("Participant at Index 1 is: " + participantList.get(1));
        System.out.println("Latest participant list is: " + participantList);
    }
}
