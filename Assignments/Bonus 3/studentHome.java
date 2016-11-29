import java.util.*;
import java.awt.*;
import java.io.*;

/**
 * Program reads a file containing student data, stores in a map, then outputs it to the console grouped by hometown
 *
 * @class studentHome
 * @author Thomas Kent
 * @since 28 November 2016
 */
public class studentHome {
    public static Scanner console = new Scanner(System.in);

    /**
     * program entry point
     * @param {String[]} args command line args
     */
    public static void main(String[] args) {
        Scanner input = null;
        Boolean keepGoing = true;
        do {
            System.out.print("What is the file name? ");
            try {
                input = new Scanner(new File(console.nextLine()));
                // file present, flag loop for completion
                keepGoing = true;
            } catch (FileNotFoundException ex) {
                // file not found, print error and prompt for retry
                System.out.println("File not found, try again.\n");
                keepGoing = false;
            }
        } while (!keepGoing);

        outputStudents(readStudents(input));
    }

    /**
     * accepts a scanner containing the student data from the file, and reads it into a hashmap for later use
     * @param {Scanner} input Scanner containing the student data from the file
     * @return {HashMap<String, ArrayList<String> >} map of towns with their respective students
     */
    public static HashMap<String, ArrayList<String> > readStudents(Scanner input) {
        HashMap<String, ArrayList<String> > allTowns = new HashMap<String, ArrayList<String> >();

        while (input.hasNext()) {
            String name = input.next();
            String hometown = input.next();

            // if the town is already present, add student to list
            if (allTowns.containsKey(hometown)) {
                allTowns.get(hometown).add(name);
            } else {
                // if not already present, add town to hashmap, then student to list
                allTowns.put(hometown, new ArrayList<String>());
                allTowns.get(hometown).add(name);
            }
        }
        return allTowns;
    }
    /**
     * reads the list of students for each hometown and prints them to the console
     * @param {HashMap<String, ArrayList<String> >} allTowns key: town name, value: list of students belonging to that hometown
     */
    public static void outputStudents(HashMap<String, ArrayList<String> > allTowns) {
        String[] towns = allTowns.keySet().toArray(new String[0]);

        // loop for each town
        for (String town : towns) {
            System.out.println("\n" + town + " students: " + allTowns.get(town).size());

            // loop for each student in the town
            for (String student:allTowns.get(town)) {
                System.out.println(student);
            }
        }
    }
}
