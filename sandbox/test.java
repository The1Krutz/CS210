import java.io.*;
import java.util.*;

public class test{
    public static void main(String[] args)
    throws FileNotFoundException{
Scanner input = new Scanner(new File("readme.txt"));

// part 1
// System.out.println(input.next());
// System.out.println(input.next());
// System.out.println(input.next());

// part 2
// System.out.println(input.nextDouble());
// System.out.println(input.nextDouble());

// part 3
while(!input.hasNextInt()){
    input.next();
}
System.out.println(input.nextInt());
    }
}