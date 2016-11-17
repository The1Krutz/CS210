import java.io.*;
import java.util.*;

/**
 * @class userName
 * Program that allows the user to create a new username.
 * Performs validations on user input to ensure username meets standards, and is not already in use
 * If new user name meets standards, add it to the stored file
 *
 * @author Thomas Kent
 * @since 16 November 2016
 */
public class userName {
    public static Scanner console = new Scanner(System.in);

    /**
     * program entry point
     * @param {String[]} args command line arguments
     */
    public static void main(String[] args) {
        String[] currentUsers = readUsersFromFile();
        System.out.println("currentUsers: " + Arrays.toString(currentUsers));


    }

    /**
     * attempts to read user names from a set file
     * @returns {String[]} array of all current user names on file
     */
    public static String[] readUsersFromFile() {
        ArrayList<String> users = new ArrayList<String>();
        try {
            // try to open users file and read names into array list
            Scanner userFile = new Scanner(new File("user.txt"));

            while (userFile.hasNext()) {
                users.add(userFile.next());
            }
        } catch (FileNotFoundException ex) {
            // if the file doesn't exist, catch and log exception
            System.out.println(ex);
        }

        // convert arraylist to array and return
        return users.toArray(new String[0]);
    }

    public static void writeUsersToFile() {

    }

    /**
     * performs validations on input user name to make sure it meets standards, and is not already in use
     * @param {String} name input username being validated
     * @return {Boolean} true if the user name meets standards, false otherwise
     */
    public static Boolean checkUserName(String name) {
        if (name.length() < 6) {
            // name must be at least 6 characters (requirement 4)
            return false;
        }
        if (name.matches("[0-9].+")) {
            // name cannot begin with a number (requirement 5)
            return false;
        }
        if (name.startsWith("?")) {
            // name cannot being with ? (requirement 6)
            return false;
        }

        // todo: check if the name is in use







        return true;
    }





































}
