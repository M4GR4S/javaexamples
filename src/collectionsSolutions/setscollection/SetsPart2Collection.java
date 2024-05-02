package collections.setscollection;

import java.util.HashSet;
import java.util.Set;

public class SetsPart2Collection {
    public static void main(String[] args) {

        //1. HashSet defintion of type String
        Set<String> names = new HashSet<String>();

        //2. Adding values to set
        names.add("Santiago");
        names.add("Andres");
        names.add("Camilo");
        names.add("Santiago");

        // The name Santiago is not added two times!
        System.out.println(names);

        //3. Displaying set size
        int size = names.size();
        System.out.println("total names: " + size);

        //4. Verify if set contains name Santiago
        boolean containsName = names.contains("Santiago");
        System.out.println("containsName: "+containsName);

        //5. Remove name Santiago
        names.remove("Santiago");
        System.out.println(names);

        //6. Use for loop to iterate over the name array
        // For each name in names
        for(String name: names){
            System.out.println("name: "+ name);
        }

    }
}
