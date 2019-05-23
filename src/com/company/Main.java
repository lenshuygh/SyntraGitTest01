package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("main");
        add3rdLineBefore2nd();
        add2ndLine();

        mcJavaANewTest();
        mcJavaANewTest02();
        mcJavaANewTest03();
    }

    private static void mcJavaANewTest03() {
        System.out.println("MCJ_TEST_03");
    }

    private static void mcJavaANewTest02() {
        System.out.println("another test");
        System.out.println("another test line 02");
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
