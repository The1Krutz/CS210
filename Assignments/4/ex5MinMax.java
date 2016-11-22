// 5. Write a Java program to find the maximum and minimum value of an array. 

import java.util.Arrays;   
public class ex5MinMax {    
  static int max;  
  static int min;  
    public static void max_min(int my_array[]) {  





}  
  
    public static void main(String[] args) {  
        int[] my_array = {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};  
        max_min(my_array);  
        System.out.println(" Original Array: "+Arrays.toString(my_array));  
        System.out.println(" Maximum value for the above array = " + max);  
        System.out.println(" Minimum value for the above array = " + min);  
    }  
}
//Original Array: [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
//Maximum value for the above array = 92
//Minimum value for the above array = 8  
