import java.util.*;
import java.io.*;

public class scannerTest {
    public static void main(String[] args)
    throws FileNotFoundException {
        Scanner input = new Scanner(new File("readme.txt"));



        System.out.println(input.next());
        System.out.println(input.next());
        System.out.println(input.next());



        // while (!input.hasNextInt()) {
        //     input.next();
        // }
        // System.out.println(input.nextInt());
    }
}
