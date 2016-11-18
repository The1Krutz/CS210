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
     * @throws {FileNotFoundException} if the user name file cannot be read
     */
    public static void main(String[] args) throws FileNotFoundException {
        String[] currentUsers = readAndDisplay();

        String newUserName = "";
        // prompt user for new username
        do {
            newUserName = getNewUserName();
        } while (!isValidUserName(currentUsers, newUserName ));

        System.out.println("New user name accepted: " + newUserName);
        writeUsersToFile(currentUsers, newUserName);

        System.out.println("\nUpdated list of user names: ");
        currentUsers = readAndDisplay();
    }

    /**
     * calls the file reader function and displays the results to the console
     * @return {String[]} array of all current user names on file
     * @throws {FileNotFoundException} if the user name file cannot be read
     */
    public static String[] readAndDisplay() throws FileNotFoundException {
        String[] currentUsers = readUsersFromFile();
        // report current usernames
        System.out.println("currentUsers: " + Arrays.toString(currentUsers));
        return currentUsers;
    }

    /**
     * attempts to read user names from a set file
     * @return {String[]} array of all current user names on file
     * @throws {FileNotFoundException} if the user name file cannot be read
     */
    public static String[] readUsersFromFile() throws FileNotFoundException {
        ArrayList<String> users = new ArrayList<String>();
        Scanner userFile = new Scanner(new File("user.txt"));

        while (userFile.hasNext()) {
            users.add(userFile.next());
        }

        // convert arraylist to array and return
        return users.toArray(new String[0]);
    }

    /**
     * Prompts the user for a new user name, and informs of requirements on that user name
     * @return {String} user name entered by the user
     */
    public static String getNewUserName() {
        System.out.println("Create a new user name. (must be 6+ characters, and cannot begin with a number or '?')");
        return console.nextLine();
    }

    /**
     * performs validations on input user name to make sure it meets standards, and is not already in use
     * @param {String} name input username being validated
     * @return {Boolean} true if the user name meets standards, false otherwise
     */
    public static Boolean isValidUserName(String[] existingUsers, String name) {
        if (name.length() < 6) {
            // name must be at least 6 characters (requirement 4)
            System.out.println("Error: name cannot have fewer than 6 characters");
            return false;
        }
        if (name.matches("[0-9].+")) {
            // name cannot begin with a number (requirement 5)
            System.out.println("Error: name cannot begin with a number");
            return false;
        }
        if (name.startsWith("?")) {
            // name cannot being with ? (requirement 6)
            System.out.println("Error: name cannot begin with a question mark: ?");
            return false;
        }

        for (String existing : existingUsers) {
            // name cannot be duplicate of existing name (requirement 7)
            if (name.equalsIgnoreCase(existing)) {
                System.out.println("Error: name is already in use");
                return false;
            }
        }
        return true;
    }

    /**
     * attempts to write user names to a set file
     * @param {String[]} current user names
     * @param {String} new user name
     * @throws {FileNotFoundException} if the user name file cannot be read
     */
    public static void writeUsersToFile(String[] currentUsers, String newUser) throws FileNotFoundException {
        PrintStream out = new PrintStream(new File("user.txt"));

        for (String s : currentUsers) {
            out.println(s);
        }
        out.println(newUser);

        out.close();

        System.out.println("Usernames saved");
    }
}
