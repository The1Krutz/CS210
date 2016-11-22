import java.util.*;

public class ex8DuplicateGeneric {
    public static void main(String[] args) {
        Integer[] dupeInts = { 1, 2, 3, 3, 4, 5, 6, 2 };
        String[] dupeStrings = { "Wilson", "Sherman", "Lynch", "Chancellor", "Graham", "Wilson", "Lynch" };
        /* +++++++++++++++++++++++++ */
        printDupes(dupeInts);
        printDupes(dupeStrings);
        /* +++++++++++++++++++++++++ */
    }

    public static < T > void printDupes(T[] input) {
        ArrayList<T> alreadySeen = new ArrayList<T>();
        ArrayList<T> duplicates = new ArrayList<T>();

        for (int i = 0; i < input.length; i++) {
            T x = input[i];
            if (alreadySeen.contains(x)) {
                if (!duplicates.contains(x)) {
                    duplicates.add(x);
                    System.out.println("Duplicate Element is: " + x);
                }
            } else {
                alreadySeen.add(x);
            }
        }
    }
}
