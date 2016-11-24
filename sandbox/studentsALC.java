import java.util.*;
import java.io.*;

/**
 * takes a correctly formatted student input file, and a choice of gender, then displays names of all students
 * of that gender, along with a total count and average age
 */
public class studentsALC {
    /**
     * program entry point
     * @param {String[]} args command line arguments
     * @throws FileNotFoundException if the file specified by the user cannot be located
     */
    public static void main(String[] args)
    throws FileNotFoundException {
        Scanner input = new Scanner(new File("students.txt"));

        ArrayList<student> students = new ArrayList<>();
        while (input.hasNext()) {
            students.add(new student(
                             input.next(),
                             input.next(),
                             input.next(),
                             input.nextInt()
                             ));
        }

        outputStudents(students);
    }

    /**
     * processes the file stream for the given gender, and displays output
     * @param {Scanner} input file stream containing the student data
     * @param {String} gender gender specified by the user (assumes male/female are only valid options)
     */
    public static void outputStudents(ArrayList<student> input) {
        for (student s :input) {
            System.out.println("id: " + s.id
                               + "\tname: " + s.name
                               + "\tage: " + s.age
                               + "\tgender: " + s.gender);
        }

        // and display the summary to the console
        System.out.println("We have " + input.size() + " students");
    }
}

class student {
    String id;
    String name;
    String gender;
    int age;

    public student(String _id, String _name, String _gender, int _age) {
        id = _id;
        name = _name;
        gender = _gender;
        age = _age;
    }
}
