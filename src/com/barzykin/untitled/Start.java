package com.barzykin.untitled;

public class Start {
    public static void main(String[] args) {
        print("Hello, World");
    }

    /**
     * Prints str
     *
     * @param str {@link String} to be printed
     */
    private static void print(String str) {
        System.out.println(str);
        printDelimiter();
    }

    private static void printDelimiter() {
        System.out.println("_____________");
    }
}
