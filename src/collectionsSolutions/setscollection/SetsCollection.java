package collections.setscollection;

import java.util.HashSet;
import java.util.Set;

public class SetsCollection {
    public static void main(String[] args) {

        // Create a HashSet using the Set interface
        Set<String> data = new HashSet<String>();

        data.add("HTML");
        data.add("CSS");
        data.add("JavaScript");
        data.add("Java");
        data.add("JavaScript");

        System.out.println(data);

    }
}
