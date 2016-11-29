import java.util.*;
import java.awt.*;

/**
 * program that generates 1000 random numbers.
 * During generation, a count is kept of how many times each number occurs.
 * The count of each value is then ouput to the console, and to a graphics panel.
 *
 * @class randomCounter
 * @author Thomas Kent
 * @since 28 November 2016
 */
public class randomCounter {
    public static Random rand = new Random();

    public static int width = 900;
    public static int height = 500;
    public static int randomCount = 1000;
    public static int range = 10;

    /**
     * program entry point
     * @param {String[]} args command line arguments
     */
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(width, height);
        panel.setBackground(Color.BLACK);
        Graphics g = panel.getGraphics();

        int[] count = new int[range];

        for (int i = 0; i < randomCount; i++) {
            int a = rand.nextInt(range);
            count[a]++;
        }

        printCount(count);
        drawCount(g, count);
    }

    /**
     * prints the count of random numbers into the console
     * @param {int[]} count array of random number counts
     */
    public static void printCount(int[] count) {
        for (int i = 0; i < count.length; i++) {
            System.out.println("[" + i + "]: " + count[i]);
        }
    }

    /**
     * draws bars for all of the random numbers counted
     * @param {Graphics} g graphics panel in which to draw the bars
     * @param {int[]} count contains the counts for each random number
     */
    public static void drawCount(Graphics g, int[] count) {
        int barGap = 10; // space between bars
        int barWidth = width / 10 - barGap; // width of each bar
        int barMaxHeight = 400; // maximum height of each bar
        int fontHeight = 30;
        int yOffset = 50; // shift the bars and labels down by this amount
        int xOffset = 20; // shift the white labels right by this amount

        int maxCount = getMax(count); // highest value being displayed. Determines scale of each bar
        int barHeightIncrement = barMaxHeight / maxCount; // scales bar height to the maximum value. Guarantees that no value runs off the screen.

        // loop through and draw bars for each count
        for (int i = 0; i < count.length; i++) {
            int x = (barWidth + barGap) * i + barGap / 2;
            int height = count[i] * barHeightIncrement;
            int y = barMaxHeight - height + yOffset;
            int labelY = barMaxHeight + fontHeight + yOffset;

            // draw bar
            // public void fillRect(int x, int y, int width, int height) {
            g.setColor(Color.GREEN);
            g.fillRect(x, y, barWidth, height);

            // draw upper value
            g.setFont(new Font("Consolas", 1, fontHeight));
            g.drawString("" + count[i], x, y - 5);

            // change color and draw lower label
            g.setColor(Color.WHITE);
            g.drawString("" + i, x + xOffset, labelY);
        }
    }

    /**
     * returns the max value from an array by copying it into a temp array, sorting the temp array,
     * and returning the last element (which is the largest element)
     * @param {int[]} count array or integers to find the max value of
     * @return {int} largest value in the array
     */
    public static int getMax(int[] count) {
        int[] temp = Arrays.copyOfRange(count, 0, count.length - 1);
        Arrays.sort(temp);
        return temp[temp.length - 1];
    }
}
