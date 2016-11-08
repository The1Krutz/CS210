import java.io.*;
import java.util.*;

public class tempConverter {
    public static void main(String[] args)
    throws FileNotFoundException {
        Scanner thing = new Scanner(new File("temps.txt"));

        temperatureConverter(thing);
    }

    public static void temperatureConverter(Scanner input) {
        while (input.hasNext()) {
            double temp = input.nextDouble();
            String scale = input.next();
            double converted = 0.0;
            String newScale = "";

            if (scale.equals("C")) {
                // converting C -> F
                converted = temp * 9 / 5 + 32;
                newScale = "F";
            } else {
                // converting F -> C
                converted = (temp - 32) * 5 / 9;
                newScale = "C";
            }
            System.out.println(temp + " " + scale + " = " + converted + " " + newScale);
        }
    }
}
