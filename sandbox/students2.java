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
        String nextName = "";

        // iterate over the file stream, processing each student and adding them
        // to the display if they match the gender being searched for
        while (input.hasNext()) {
            // skip id number
            input.nextInt();
            nextName = input.next();
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
        System.out.println("We have " + maleCount + " male students.");
        String[] ms = new String[maleStudents.size()];
        maleStudents.toArray(ms);
        for (int i = 0; i < ms.length; i++) {
            System.out.println(ms[i]);
        }
        System.out.println("Average age is " + maleAvgAge);

        System.out.println("\nWe have " + femaleCount + " female students.");
        String[] fs = new String[femaleStudents.size()];
        femaleStudents.toArray(fs);
        for (int i = 0; i < fs.length; i++) {
            System.out.println(fs[i]);
        }
        System.out.println("Average age is " + femaleAvgAge);


    }
}
