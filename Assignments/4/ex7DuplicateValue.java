// 7. Write a Java program to find the duplicate values of an array of integer values.

import java.util.*;

public class ex7DuplicateValue {
    public static void main(String[] args)
    {
        int[] my_array = { 1, 2, 3, 3, 4, 5, 6, 2 };
        // my code starts

        ArrayList<Integer> alreadySeen = new ArrayList<Integer>();
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for (int i = 0; i < my_array.length; i++) {
            if (alreadySeen.contains(my_array[i])) {
                // if value has already occured, add it to duplicates list and output
                if (!duplicates.contains(my_array[i])) {
                    duplicates.add(my_array[i]);
                    System.out.println("Duplicate Element is: " + my_array[i]);
                }
            } else {
                // if value has not yet occured, add it to the list of values that has occured
                alreadySeen.add(my_array[i]);
            }
        }

        // my code ends
    }
}
//Duplicate Element : 2
//Duplicate Element : 3
