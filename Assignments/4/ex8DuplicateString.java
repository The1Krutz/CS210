// 8. Write a Java program to find the duplicate values of an array of string values.

import java.util.*;

public class ex8DuplicateString {
    public static void main(String[] args)
    {
        String[] my_array = { "Wilson", "Sherman", "Lynch", "Chancellor", "Graham", "Wilson", "Lynch" };
        // my code starts

        ArrayList<String> alreadySeen = new ArrayList<String>();
        ArrayList<String> duplicates = new ArrayList<String>();

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
//Duplicate Element is : Wilson
//Duplicate Element is : Lynch
