package com.ch1;

/**
 * Chapter 1 Lab - Question 4
 */
public class Q4 {

    /**
     * Program entry point
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        figure1();
        figure2();
        figure3();
    }

    /**
     * Draws the first figure
     */
    public static void figure1() {
        drawTwoBars();
        drawX();
        drawWhiteSpace();
    }

    /**
     * Draws the second figure
     */
    public static void figure2() {
        drawTwoBars();
        drawX();
        drawTwoBars();
        drawWhiteSpace();
    }

    /**
     * Draws the third figure
     */
    public static void figure3() {
        drawVerticalLine();
        drawTwoBars();
        drawX();
    }

    /**
     * Draws two horizontal bars
     */
    public static void drawTwoBars() {
        System.out.println("*****");
        System.out.println("*****");
    }

    /**
     * Draws an X
     */
    public static void drawX() {
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }

    /**
     * Draws a single blank line
     */
    public static void drawWhiteSpace() {
        System.out.println();
    }

    /**
     * Draws a single vertical line
     */
    public static void drawVerticalLine() {
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    }
}
