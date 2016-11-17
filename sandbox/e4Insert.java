import java.io.*;
import java.util.*;

public class e4Insert {
    public static void main(String[] args) {
        int[] myArray = new int[] { 25, 10, 55, 65, 36, 92, 77, 8, 13, 79 };
        int index = 3;
        int newValue = 12;

        System.out.println("original: " + Arrays.toString(myArray));

        int temp2 = 0;
        int temp = myArray[index - 1];
        myArray[index - 1] = newValue;

        for (int i = index - 1; i < myArray.length; i++) {
            temp2 = myArray[i];
            myArray[i] = temp;
            temp = temp2;
        }
        System.out.println("new:      " + Arrays.toString(myArray));
    }
}
