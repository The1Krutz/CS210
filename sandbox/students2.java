import java.util.*;
import java.io.*;

/**
 * takes a correctly formatted student input file, and a choice of gender, then displays names of all students
 * of that gender, along with a total count and average age
 */
public class students2 {
    // shared console scanner
    public static Scanner console = new Scanner(System.in);

    /**
     * program entry point
     * @param {String[]} args command line arguments
     * @throws FileNotFoundException if the file specified by the user cannot be located
     */
    public static void main(String[] args)
    throws FileNotFoundException {
        outputStudents(getScanner());
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
    public static void outputStudents(Scanner input) {
        ArrayList<String> maleStudents = new ArrayList<String>();
        ArrayList<String> femaleStudents = new ArrayList<String>();
        int maleCount = 0;
        int femaleCount = 0;
        int maleTotalAge = 0;
        int femaleTotalAge = 0;

        // iterate over the file stream, processing each student and adding them
        // to the display if they match the gender being searched for
        while (input.hasNext()) {
            // skip id number
            input.nextInt();
            String nextName = input.next();
            String thisGender = input.next();
            int thisAge = input.nextInt();
            if (thisGender.equals("m")) {
                maleStudents.add(nextName);
                maleTotalAge += thisAge;
                maleCount++;
            } else {
                femaleStudents.add(nextName);
                femaleTotalAge += thisAge;
                femaleCount++;
            }
        }
        // calculate the average age of the listed students
        double maleAvgAge = (double)maleTotalAge / maleCount;
        double femaleAvgAge = (double)femaleTotalAge / femaleCount;

        // and display the summary to the console
        System.out.println(femaleCount + " female students.");
        for (String s : femaleStudents) {
            System.out.println(s);
        }
        System.out.println("Average age is " + femaleAvgAge);

        System.out.println(maleCount + " male students.");
        for (String s : maleStudents) {
            System.out.println(s);
        }
        System.out.println("Average age is " + maleAvgAge);
    }
}
