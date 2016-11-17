import java.util.*;

public class ex7DuplicateValue {
    public static void main(String[] args) {
        int[] my_array = { 1, 2, 3, 3, 4, 5, 6, 2 };
        /* +++++++++++++++++++++++++ */
        ArrayList<Integer> alreadySeen = new ArrayList<Integer>();
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for (int i = 0; i < my_array.length; i++) {
            if (alreadySeen.contains(my_array[i])) {
                if (!duplicates.contains(my_array[i])) {
                    duplicates.add(my_array[i]);
                    System.out.println("Duplicate Element is: " + my_array[i]);
                }
            } else {
                alreadySeen.add(my_array[i]);
            }
        }
        /* +++++++++++++++++++++++++ */
    }
}
