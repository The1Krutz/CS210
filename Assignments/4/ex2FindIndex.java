// 2. Write a Java program to find the index of an array element.

public class ex2FindIndex {  
       public static int  findIndex (int[] my_array, int t) {  
// my code starts

for(int i=0;i<my_array.length;i++)
  if(my_array[i] == t)
  return i;


// my code ends
}      
    public static void main(String[] args) {  
      int[] my_array = new int[] {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};  
      System.out.println("Index position of 55 is: " + findIndex(my_array, 55));  
      System.out.println("Index position of 13 is: " + findIndex(my_array, 13));  
       }  
} 
//Index position of 55 is: 2
//Index position of 13 is: 8
