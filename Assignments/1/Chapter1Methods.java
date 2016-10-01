// CS201 Assignment 1 (Methods)
// Thomas / Kent

public class Chapter1Methods {

    public static void first() {
        System.out.println("Inside first method");
    }

    public static void second() {
        third();
        System.out.println("Inside second method");
    }

    public static void third() {
        System.out.println("Inside third method");
        System.out.println("Inside second method");
    }

    public static void main(String[] args) {
        // DO NOT change this part
        first();
        third();
        second();
        third();
    }
}
