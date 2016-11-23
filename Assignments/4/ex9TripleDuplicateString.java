// 9. Write a Java program to find the TRIPLE duplicate values of an array of string values.

public class ex9TripleDuplicateString {  
public static void main(String[] args)   
    {  
      String[] my_array = {"Wilson", "Sherman", "Lynch", "Wilson", "Graham", "Wilson", "Lynch"};  
// my code starts

        HashMap<String, int> dupes = new HashMap<String, int>();

        for (int i = 0; i < my_array.length; i++) {
if(dupes.containsKey(my_array[i])){
dupes.put(my_array[i], dupes.get(my_array[i])+1);
}else{
dupes.put(my_array[i], 1);
}
        }

String[] keys = dupes.keySet().toArray(new String[]);

for(String s : keys)
  if(dupes.get(s) >=3)
    System.out.println("Triple Duplicate Element is: "+dupes.get(s));
  




// my code ends
  }      
}
//Triple Duplicate Element is : Wilson
