package com.company;

public class A {

    private static int a = printInit("initialized static variable in class A");
    private int b = printInit("initialized no-static variable in class A");

    public A(){
        System.out.println("Constructor A called");
    }

    static {
        System.out.println("static A block called ");
    }

    {
        System.out.println("no-static A block called ");
    }

    protected static int printInit(String s){
        System.out.println(s);
        return 10;
    }
}
