package com.company;

public class B extends A {

    private static int a = printInit("initialized static variable in class B");
    private int b = printInit("initialized no-static variable in class B");

    public B(){
        System.out.println("Constructor B called");
    }

    static {
        System.out.println("static B block called ");
    }

    {
        System.out.println("no-static B block called ");
    }
}
