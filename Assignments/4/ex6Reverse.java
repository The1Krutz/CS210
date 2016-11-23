// 6. Write a Java program to reverse an array of integer values.

import java.util.Arrays;   
public class ex6Reverse {  
public static void main(String[] args){     
  int[] my_array1 = {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019};  
  System.out.println("Original array : "+Arrays.toString(my_array1));    
// my code starts

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

// my code ends
System.out.println("Reverse array : "+Arrays.toString(my_array1));  
 }  
}
//Original array : [2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019]
//Reverse array : [2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010]
