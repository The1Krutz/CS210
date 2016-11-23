// 3. Write a Java program to copy an array by iterating the array.

import java.util.Arrays;   
public class ex3CopyArray {  
 public static void main(String[] args) {  
   int[] my_array = new int[]{25, 10, 55, 65, 36, 92, 77, 8, 13, 79};  
   int[] new_array = new int[10];         
   System.out.println("Source Array : "+Arrays.toString(my_array));    
// my code starts

for(int i=0;i<my_array.length;i++)
new_array[i] = my_array[i];

// my code ends
   System.out.println("New Array: "+Arrays.toString(new_array));  
 }  
 }
//Source Array : [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
//New Array: [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
