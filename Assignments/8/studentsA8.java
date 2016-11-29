import java.util.*;
import java.io.*;

/**
 * Program that prompts the user for a file containing student data.
 * Once a valid file is given, reads the student data into lists separated by gender,
 * and outputs the student information to the console.
 *
 * @class studentsA8
 * @author Thomas Kent
 * @since 28 November 2016
 */
public class studentsA8 {
    public static Scanner console = new Scanner(System.in);

    /**
     * program entry point
     * @param {String[]} args command line arguments
     */
    public static void main(String[] args) {
        outputStudents(getScanner());
    }

    /**
     * prompts the user for a file where the student data cna be found
     * loops until a valid file is given
     * @return {Scanner} filestream containing all student data
     */
    public static Scanner getScanner() {
        Scanner input = null;
        do {
            System.out.print("What is the file name? ");
            try {
                input = new Scanner(new File(console.nextLine()));
                // file present, flag loop for completion
                return input;
            } catch (FileNotFoundException ex) {
                // file not found, print error and prompt for retry
                System.out.println("File not found, try again.\n");
            }
        } while (true);
    }

    /**
     * takes a scanner with student data and converts it into two arraylists, one for each gender.
     * Then outputs those lists to the console
     * @param {Scanner} input filestream containing all student data
     */
    public static void outputStudents(Scanner input) {
        ArrayList<student> maleStudents = new ArrayList<student>();
        ArrayList<student> femaleStudents = new ArrayList<student>();

        while (input.hasNext()) {
            // create new student and add it to the appropriate list
            student adding = new student(
                input.next(),
                input.next(),
                input.next(),
                input.nextInt());

            if (adding.gender.equals("m")) {
                maleStudents.add(adding);
            } else {
                femaleStudents.add(adding);
            }
        }

        // output all female students
        System.out.println("Female students:" + femaleStudents.size());
        System.out.println("ID  Name      Age");
        System.out.println("-----------------");
        for (student s : femaleStudents) {
            System.out.printf("%-3s %-10s %-2s %n", s.id, s.name, s.age);
        }

        // output all male students
        System.out.println("\nMale students:" + maleStudents.size());
        System.out.println("ID  Name      Age");
        System.out.println("-----------------");
        for (student s : maleStudents) {
            System.out.printf("%-3s %-10s %-2s %n", s.id, s.name, s.age);
        }
    }
}

/**
 * holds all information relevant to an individual student
 * @class student
 */
class student {
    String id;
    String name;
    String gender;
    int age;

    /**
     * default constructor
     * @return {student} blank student object
     */
    public student() {
    }

    /**
     * parameterized constructor
     * @param {String} _id student id number
     * @param {String} _name student name
     * @param {String} _gender student gender
     * @param {int} _age student age
     * @return {student} initialized student object
     */
    public student(String _id, String _name, String _gender, int _age) {
        id = _id;
        name = _name;
        gender = _gender;
        age = _age;
    }
}
