package com.company;

public class C extends B {

    private static int a = printInit("initialized static variable in class C");
    private int b = printInit("initialized no-static variable in class C");

    public C(){
        System.out.println("Constructor C called");
    }

    static {
        System.out.println("static C block called ");
    }

    {
        System.out.println("no-static C block called ");
    }
}
