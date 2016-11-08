import java.util.*;
import java.io.*;

public class students {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    throws FileNotFoundException {
        Scanner input = getScanner();

        System.out.print("Which gender do you want? ");
        outputStudents(input, console.nextLine());
    }

    public static Scanner getScanner()
    throws FileNotFoundException {
        System.out.print("What is the file name? ");
        return new Scanner(new File(console.nextLine()));
    }

    public static void outputStudents(Scanner input, String gender) {
        String simpleGender = "";
        if (gender.startsWith("m")) {
            simpleGender = "m";
        } else {
            simpleGender = "f";
        }
        String nextName = "";
        int count = 0;

        while (input.hasNext()) {
            input.nextInt();
            nextName = input.next();
            String thisGender = input.next();
            if (thisGender.equals(simpleGender)) {
                System.out.println(nextName);
                count++;
            }
        }

        if (simpleGender.equals("m")) {
            gender = "male";
        } else {
            gender = "female";
        }
        System.out.println("We have " + count + " " + gender + " student");
    }
}
