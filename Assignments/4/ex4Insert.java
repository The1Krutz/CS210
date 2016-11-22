// 4. Write a Java program to insert an element (specific position) into an array.

import java.util.Arrays;   
public class ex4Insert {  
public static void main(String[] args) {  
  
   int[] my_array =new int[] {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};  
   // Insert an element in 3rd position of the array (index->3, value->12)  
   int Index_position = 3;  
   int newValue    = 12;  
   System.out.println("Original Array : "+Arrays.toString(my_array));       
     




   System.out.println("New Array: "+Arrays.toString(my_array));  
 }  
 }
//Original Array : [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
//New Array: [25, 10, 55, 12, 65, 36, 92, 77, 8, 13]
