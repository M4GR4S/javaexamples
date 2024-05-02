package collections.mapscollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsCollection {
    public static void main(String[] args) {

        // 1. Declare a map with Integer as key and String as value
        Map<Integer, String> map = new HashMap<Integer, String>();

        // 2. Adding elements to map
        map.put(1,"Raymond");
        map.put(5,"Jason");
        map.put(2,"Sammie");
        map.put(6,"Theresa");

        // 3. Traversing Map
        Set set = map.entrySet();//Converting to Set to traverse through it
        Iterator iterations = set.iterator();

        while(iterations.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry)iterations.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
