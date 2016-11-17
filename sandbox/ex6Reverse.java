import java.util.Arrays;

public class ex6Reverse {
    public static void main(String[] args) {
        int[] my_array1 = { 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019 };
        System.out.println("Original array: " + Arrays.toString(my_array1));
        /* +++++++++++++++++++++++++ */

        int high = 0;
        int low = 0;

        if (my_array1.length % 2 == 0) {
            // even number of elements
            low = my_array1.length / 2 - 1;
            high = low + 1;
        } else {
            // odd number of elements
            low = my_array1.length / 2;
            high = low;
        }

        while (high < my_array1.length && low >= 0) {
            int swap = my_array1[high];
            my_array1[high] = my_array1[low];
            my_array1[low] = swap;

            high++;
            low--;
        }


        /* +++++++++++++++++++++++++ */
        System.out.println("Reverse array:  " + Arrays.toString(my_array1));
    }
}
