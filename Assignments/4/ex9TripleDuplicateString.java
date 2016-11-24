// 9. Write a Java program to find the TRIPLE duplicate values of an array of string values.

import java.util.*;

public class ex9TripleDuplicateString {
    public static void main(String[] args)
    {
        String[] my_array = { "Wilson", "Sherman", "Lynch", "Wilson", "Graham", "Wilson", "Lynch" };
        // my code starts

        HashMap<String, Integer> dupes = new HashMap<String, Integer>();

        // loop through all strings in the array, and keep a count of how many times each unique string occurs
        for (int i = 0; i < my_array.length; i++) {
            if (dupes.containsKey(my_array[i])) {
                // if key exists, increment its counter
                dupes.put(my_array[i], dupes.get(my_array[i]) + 1);
            } else {
                // if key doesn't exist, add it with count 1
                dupes.put(my_array[i], 1);
            }
        }

        String[] keys = dupes.keySet().toArray(new String[0]);
        // output any strings that have a count greater than 3
        for (String s : keys) {
            if (dupes.get(s) >= 3) {
                System.out.println("Triple Duplicate Element is: " + s);
            }
        }

        // my code ends
    }
}
//Triple Duplicate Element is : Wilson
