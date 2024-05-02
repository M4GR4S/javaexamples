package collections.arraycollection;

import java.util.Arrays;

public class ArrayCollection {
    public static void main(String[] args) {
        /*
         * Ways at which we may declare an array
         */

        // 1. Declare an array called myArray with 3 values: 0, 1 and 2
        int[] myArray;
        myArray = new int[]{0, 1, 2};
        System.out.println(myArray.length);

        // 2. Declare an array called myArray2 with 3 values: 0, 1 and 2
        int[] myArray2 = {0, 1, 2};
        System.out.println(myArray2.length);

        // 3. Declare an array called myArray3 with 3 values: 0, 1 and 2
        int myArray3[] = {0, 1, 2};
        System.out.println(myArray3.length);

        // 4. Declare an array called myArray4
        // all values within each element is set to a default value of 0
        int myArray4[] = new int[4];
        System.out.println(myArray4.length);

        // Access the values within myArray4 (all should initialised to 0)
        for (int i = 0; i < myArray4.length; i++){
            System.out.println(myArray4[i]);
        }

        // 5. access the values with myCharArray (all should be initialised to null)
        char myCharArray[] = new char[4];
        System.out.println(myCharArray.length);

        for (int i = 0; i < myCharArray.length; i++){
            System.out.println("myCharArray " + i + " has: " + myCharArray[i]);
        }

        // 6. To fill an array (myArray5) with a particular value
        int myArray5[] = {8, 8, 8, 8};
        System.out.println(Arrays.toString(myArray5));  // [8, 8, 8, 8]

        Arrays.fill(myArray5, 10);
        System.out.println(Arrays.toString(myArray5));  // [10, 10, 10, 10]

        // 7. Changing the values for an array element
        myArray5[0] = 9;
        myArray5[1] = 8;
        myArray5[2] = 7;
        myArray5[3] = 6;

        System.out.println(Arrays.toString(myArray5));
    }
}
