public class test1 {
    public static void main(String[] args) {
        String[] stars = { "", "*****", " * * ", "  *  " };
        int[] sequence = { 1, 1, 2, 3, 2, 0, 1, 1, 2, 3, 2, 1, 1, 0, 3, 3, 3, 1, 1, 2, 3, 2 };

        for (int i = 0; i < sequence.length; i++) {
            System.out.println(stars[sequence[i]]);
        }
    }
}
