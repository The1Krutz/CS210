package com.cs210;

/**
 * Chapter 1 Lab - Question 4
 */
public class Q4 {
    /**
     * Program entry point
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
    public static void figure1(){
        drawTwoBars();
        drawX();
        drawWhiteSpace();
    }

    /**
     * Draws the second figure
     */
    public static void figure2(){
        drawTwoBars();
        drawX();
        drawTwoBars();
        drawWhiteSpace();
    }

    /**
     * Draws the third figure
     */
    public static void figure3(){
        drawVerticalLine();
        drawTwoBars();
        drawX();
    }

    /**
     * Draws two horizontal bars
     */
    public static void drawTwoBars() {
        allFive();
        allFive();
    }

    /**
     * Draws an X
     */
    public static void drawX() {
        twoAndFour();
        threeOnly();
        twoAndFour();
    }

    /**
     * Draws a single blank line
     */
    public static void drawWhiteSpace(){
        System.out.println();
    }

    /**
     * Draws a single vertical line
     */
    public static void drawVerticalLine() {
        threeOnly();
        threeOnly();
        threeOnly();
    }

    /**
     * Outputs an asterisk in all five positions
     */
    public static void allFive() {
        System.out.println("*****");
    }

    /**
     * Outputs an asterisk only in positions 2 and 4
     */
    public static void twoAndFour() {
        System.out.println(" * * ");
    }

    /**
     * Outputs an asterisk in position 3
     */
    public static void threeOnly() {
        System.out.println("  *  ");
    }
}
