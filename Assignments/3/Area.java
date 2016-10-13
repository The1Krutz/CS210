import java.util.*;
/**
 * Area class
 * @author Thomas Kent
 * @since 12 October 2016
 *
 * Prompts user for figure type, calculates and compares area
 */
public class Area {
    public static Scanner scan = new Scanner(System.in);
    public static String[] figureTypes = new String[2];

    /**
     * Program entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Double area1 = getInfoForFigure(1);
        Double area2 = getInfoForFigure(2);

        System.out.println("\n" + figureTypes[0] + " area = " + area1 + "\n"
                           + figureTypes[1] + " area = " + area2 + "\n\n"
                           + compareAreas(area1, area2));
    }

    /**
     * compares two doubles, and returns output to be displayed
     * @param area1 area of figure one
     * @param area2 area of figure two
     * @return string representation of the comparison between the two figures
     */
    public static String compareAreas(Double area1, Double area2) {
        if (area1 < area2) {
            return "The " + figureTypes[1] + " is larger than the " + figureTypes[0];
        } else if ( area1 > area2) {
            return "The " + figureTypes[0] + " is larger than the " + figureTypes[1];
        } else {
            return "The " + figureTypes[0] + " and " + figureTypes[1] + " are equal";
        }
    }

    /**
     * Prompts the user for input regarding which type of figure, and returns the area of that figure
     * @param  figureNumber indicator of which figure is being processed
     * @return area of whatever figure is selected
     */
    public static Double getInfoForFigure(int figureNumber) {
        int figure = whatKindOfFigure(figureNumber);
        if (figure == 1) {
            figureTypes[figureNumber - 1] = "Rectangle";
            return processRectangleArea();
        } else if (figure == 2) {
            figureTypes[figureNumber - 1] = "Triangle";
            return processTriangleArea();
        } else if (figure == 3) {
            figureTypes[figureNumber - 1] = "Circle";
            return processCircleArea(); // 10 lines without checking for invalid input
        } else {
            System.out.println("\nInvalid selection, try again\n");
            return getInfoForFigure(figureNumber); // 13 lines including check for invalid input
        }
    }

    /**
     * Prompts user to select type of figure
     * @param figureNumber indicator of which figure is being described
     * @return integer representing the type of figure: 1-Rectangle, 2-Triangle, 3-Circle
     */
    public static int whatKindOfFigure(int figureNumber) {
        System.out.println("Information for figure " + figureNumber + ":\nSelect Type\n1) rectangle\n2) triangle\n3) circle:");
        return scan.nextInt();
    }

    /**
     * prompts user for rectangle dimensions and calculates area
     * @return area of the rectangle
     */
    public static Double processRectangleArea() {
        System.out.print("height? ");
        Double height = scan.nextDouble();
        System.out.print("width? ");
        Double width = scan.nextDouble();

        return height * width;
    }

    /**
     * prompts user for triangle dimensions and calculates area
     * @return area of the triangle
     */
    public static Double processTriangleArea() {
        System.out.print("base? ");
        Double base = scan.nextDouble();
        System.out.print("height? ");
        Double height = scan.nextDouble();

        return (base * height) / 2;
    }

    /**
     * prompts user for circle dimensions and calculates area
     * @return area of the circle
     */
    public static Double processCircleArea() {
        System.out.print("radius? ");
        Double radius = scan.nextDouble();

        return Math.PI * radius * radius;
    }
}
