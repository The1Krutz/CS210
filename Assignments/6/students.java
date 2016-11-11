import java.util.*;
import java.io.*;

/**
 * takes a correctly formatted student input file, and a choice of gender, then displays names of all students
 * of that gender, along with a total count and average age
 */
public class students {
    // shared console scanner
    public static Scanner console = new Scanner(System.in);

    /**
     * program entry point
     * @param {String[]} args command line arguments
     * @throws FileNotFoundException if the file specified by the user cannot be located
     */
    public static void main(String[] args)
    throws FileNotFoundException {
        Scanner input = getScanner();

        System.out.print("Which gender do you want? ");
        outputStudents(input, console.nextLine());
    }

    /**
     * prompts the user for the location of the student information file, then attempts to open it
     * @return A Scanner containing the file stream specified by the user
     * @throws FileNotFoundException if the file specified by the user cannot be located
     */
    public static Scanner getScanner()
    throws FileNotFoundException {
        System.out.print("What is the file name? ");
        // use student.txt
        return new Scanner(new File(console.nextLine()));
    }

    /**
     * processes the file stream for the given gender, and displays output
     * @param {Scanner} input file stream containing the student data
     * @param {String} gender gender specified by the user (assumes male/female are only valid options)
     */
    public static void outputStudents(Scanner input, String gender) {
        String shortGender = "";
        String longGender = "";
        String nextName = "";
        int count = 0;
        int totalAge = 0;

        // set short and long gender names based on user input
        if (gender.startsWith("m")) {
            shortGender = "m";
            longGender = "male";
        } else {
            shortGender = "f";
            longGender = "female";
        }

        // iterate over the file stream, processing each student and adding them
        // to the display if they match the gender being searched for
        while (input.hasNext()) {
            // skip id number
            input.nextInt();
            nextName = input.next();
            String thisGender = input.next();
            int thisAge = input.nextInt();
            if (thisGender.equals(shortGender)) {
                // if the student matches the gender, output their name to the console
                System.out.println(nextName);
                // add their age to the total
                totalAge += thisAge;
                // and increment the count of students
                count++;
            }
        }
        // calculate the average age of the listed students
        double avgAge = (double)totalAge / count;

        // and display the summary to the console
        System.out.println("We have " + count + " " + longGender + " students.\nAverage age is " + avgAge);
    }
}
