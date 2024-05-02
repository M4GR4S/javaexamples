package collections.mapscollection;

import java.util.*;

public class MapsTwoCollection {
    public static void main(String[] args) {

        // 1. Declare a map with String as key and value
        // with initialised values
        Map<String, String> carsMap = new HashMap<String, String>()
        {
            {
                put("car1", "Civic");
                put("car2", "Jazz");
                put("car3", "Accord");
                put("car4", "Type R");
            }
        };

        //2. Displaying map size
        int size = carsMap.size();
        System.out.println("total cars: " + size);

        //3. Verify if map contains key "car3"
        boolean containsKey = carsMap.containsKey("car3");
        System.out.println("containsKey: " + containsKey);

        //4. Verify if map contains value "Accord"
        boolean containsModel = carsMap.containsValue("Accord");
        System.out.println("containsModel: " + containsModel);

        //5. Get "car2"
        System.out.println(carsMap.get("car2"));

        //6. Remove "car3"
        carsMap.remove("car3");
        System.out.println(carsMap);

    }
}
