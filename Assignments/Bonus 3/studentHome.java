import java.util.*;
import java.awt.*;
import java.io.*;

public class studentHome {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, ArrayList<String> > allTowns = new HashMap<String, ArrayList<String> >();
        System.out.println("enter file name: ");
        try {
            readStudents(new Scanner(new File(console.nextLine())));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return;
        }

        outputStudents(allTowns);




    }

    public static HashMap<String, ArrayList<String> > readStudents(Scanner input) {
        HashMap<String, ArrayList<String> > allTowns = new HashMap<String, ArrayList<String> >();

        while (input.hasNextLine()) {




        }





        return allTowns;
    }

    public static void outputStudents(HashMap<String, ArrayList<String> > allTowns) {

    }











}
