// CS201 Assignment 1 (Methods)
// Thomas / Kent

public class Chapter1Ex11 {
    public static int numRockets = 2;

    public static void main(String[] args) {
        drawCone(numRockets);
        drawDivider(numRockets);

        drawBody(numRockets);
        drawDivider(numRockets);

        drawBodyWithWords(numRockets);
        drawDivider(numRockets);

        drawBody(numRockets);
        drawDivider(numRockets);

        drawCone(numRockets);
    }

    /**
     * Draws a rocket cone
     * @param num number of times to draw this figure
     */
    public static void drawCone(int num){
        for(int i=0; i<num; i++) {
            System.out.print("   /\\    ");
        }
        System.out.println();
        for(int i=0; i<num; i++) {
            System.out.print("  /  \\   ");
        }
        System.out.println();
        for(int i=0; i<num; i++) {
            System.out.print(" /    \\  ");
        }
        System.out.println();
    }

    /**
     * Draws a rocket body
     * @param num number of times to draw this figure
     */
    public static void drawBody(int num){
        for(int i=0; i<num; i++) {
            System.out.print("|      | ");
        }
        System.out.println();
        for(int i=0; i<num; i++) {
            System.out.print("|      | ");
        }
        System.out.println();
    }

    /**
     * Draws a rocket body with the words 'United States' inside it
     * @param num number of times to draw this figure
     */
    public static void drawBodyWithWords(int num){
        for(int i=0; i<num; i++) {
            System.out.print("|United| ");
        }
        System.out.println();
        for(int i=0; i<num; i++) {
            System.out.print("|States| ");
        }
        System.out.println();
    }

    /**
     * Draws a horizontal divider
     * @param num number of times to draw this figure
     */
    public static void drawDivider(int num){
        for(int i=0; i<num; i++) {
            System.out.print("+------+ ");
        }
        System.out.println();
    }
}
