
/**
 * DrawRocket class
 * Thomas Kent 05 October 2016
 */
public class DrawRocket {

    /**
     * Program entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int baseHeight;

        try {
            // try to get height from command line args, or use default
            baseHeight = Integer.parseInt(args[0]);
        } catch (Exception ex) {
            // swallow error and set default height
            System.err.println(ex.toString());
            System.err.println("Using default height: 3");
            baseHeight = 3;
        }

        // draw the rocket ship
        drawCone(baseHeight);
        drawDivider(baseHeight);

        drawBodyConeUp(baseHeight);
        drawBodyConeDown(baseHeight);
        drawDivider(baseHeight);

        drawBodyConeDown(baseHeight);
        drawBodyConeUp(baseHeight);
        drawDivider(baseHeight);

        drawCone(baseHeight);
    }

    /**
     * Draws the cone, facing up
     * @param height [description]
     */
    public static void drawCone(int height) {
        // calculate width based on height
        int width = height * 2 - 1;

        for (int i = 0; i < width; i++) {
            // blank space on the sides
            for (int j = 0; j < width - i; j++) {
                System.out.print(" ");
            }

            // draw left side of cone
            for (int j = 0; j <= i; j++) {
                System.out.print("/");
            }

            // center is always the same
            System.out.print("**");

            // draw right side of cone
            for (int j = 0; j <= i; j++) {
                System.out.print("\\");
            }

            // line break
            System.out.println();
        }
    }

    /**
     * Draws the horizontal divider between sections
     * @param height height of other figures in this design
     */
    public static void drawDivider(int height) {
        System.out.print("+");

        // body width is based on height
        for (int i = 0; i < height; i++) {
            System.out.print("=*=*");
        }

        // last output includes a line break
        System.out.println("+");
    }

    /**
     * Draws the upper portion of the body, with the cone facing upo
     * @param height height of this figure in number of lines
     */
    public static void drawBodyConeUp(int height) {
        // calculate width based on height
        int width = height * 2 - 1;
        for (int i = 0; i < height; i++) {
            // left edge
            System.out.print("|");

            // left dots
            for (int j = height - i; j > 1; j--) {
                System.out.print(".");
            }

            // left cone facing up
            for (int j = 0; j <= i; j++) {
                System.out.print("/\\");
            }

            // center dots
            for (int j = height - i; j > 1; j--) {
                System.out.print("..");
            }

            // right cone facing up
            for (int j = 0; j <= i; j++) {
                System.out.print("/\\");
            }

            // right dots
            for (int j = height - i; j > 1; j--) {
                System.out.print(".");
            }

            // right edge and line break
            System.out.println("|");
        }
    }

    /**
     * Draws the lower portion of the body, with the cone facing down
     * @param height height of this figure in number of lines
     */
    public static void drawBodyConeDown(int height) {
        // calculate width based on height
        int width = height * 2 - 1;
        for (int i = 0; i < height; i++) {
            // left edge
            System.out.print("|");

            // left dots
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            }

            // left cone facing down
            for (int j = 0; j < height - i; j++) {
                System.out.print("\\/");
            }

            // center dots
            for (int j = i; j > 0; j--) {
                System.out.print("..");
            }

            // right cone facing down
            for (int j = 0; j < height - i; j++) {
                System.out.print("\\/");
            }

            // right dots
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            }

            // right edge and line break
            System.out.println("|");
        }
    }
}
