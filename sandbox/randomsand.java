import java.util.*;


public class randomsand {
    public static Random rand = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt());
        }
    }
}
