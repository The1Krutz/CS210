package com.testme;

public class test2 {
    public static void main(String[] args) {
        tester(3);
        tester(10);
    }

    public static int tester(int a) {
        if (a % 2 == 0) {
            return 5;
        } else {
            return 50;
        }
    }
}
