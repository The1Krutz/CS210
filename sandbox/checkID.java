import java.util.*;
import java.io.*;

public class checkID {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        do {
            String[] oldIDs = getOldIDs(new Scanner(new File("storedIDS.txt")));
            System.out.println("Enter new ID: ");
            String newID = console.nextLine();

            for (int i = 0; i < oldIDs.length; i++) {
                System.out.println(oldIDs[i]);
            }
            writeIDsToFile(oldIDs);

            if (isDuplicate(new Scanner(new File("storedIDS.txt")), newID)) {
                System.out.println("new ID is duplicate, try again...");
            } else {
                System.out.println("new ID accepted");
                break;
            }
        } while (true);
    }

    public static String[] getOldIDs(Scanner file) {
        ArrayList<String> temp = new ArrayList<String>();
        while (file.hasNext()) {
            String b = file.nextLine();
            temp.add(b);
        }
        String[] a = new String[temp.size()];
        return temp.toArray(a);
    }

    public static void writeIDsToFile(String[] old) throws FileNotFoundException {
        PrintStream out = new PrintStream(new File("storedIDS.txt"));

        for (int i = 0; i < old.length; i++) {
            out.println(old[i]);
        }

        out.close();
    }

    public static Boolean isDuplicate(Scanner oldIDs, String newID) {
        String[] old = getOldIDs(oldIDs);
        for (int i = 0; i < old.length; i++) {
            if (old[i].equals(newID)) {
                return true;
            }
        }
        return false;
    }
}
