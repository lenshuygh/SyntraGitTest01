package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("main");
        add3rdLineBefore2nd();
        add2ndLine();

        mcJavaANewTest();
    }

    private static void mcJavaANewTest() {
        System.out.println("testing for GIT workflow");
    }

    private static void add3rdLineBefore2nd() {
        System.out.println("this line is in between");
    }

    private static void add2ndLine() {
        System.out.println("this is a second line of text");
    }
}
