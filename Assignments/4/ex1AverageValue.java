// 1. Write a Java program to calculate average value of an array elements.

public class ex1AverageValue {
    public static void main(String[] args) {
        int[] numbers = new int[] { 10, 20, 30, 40, -50, 60, -70 };
        // my code starts

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        double average = (double)sum / numbers.length;

        // my code ends
        System.out.println("Average value of the array elements is : " + average);
    }
}
// Average value of the array elements is : 5.0
