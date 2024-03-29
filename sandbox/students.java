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
        String longGender = "";
        String nextName = "";
        int count = 0;
        if (gender.startsWith("m")) {
            simpleGender = "m";
            longGender = "male";
        } else {
            simpleGender = "f";
            longGender = "female";
        }
        while (input.hasNext()) {
            input.nextInt();
            nextName = input.next();
            String thisGender = input.next();
            if (thisGender.equals(simpleGender)) {
                System.out.println(nextName);
                count++;
            }
        }
        System.out.println("We have " + count + " " + longGender + " student");
    }
}
