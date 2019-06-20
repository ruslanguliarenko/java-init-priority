package com.company;

public class A {

    public A(){
        System.out.println("Constructor A called");
    }

    static {
        System.out.println("static A block called ");
    }

    {
        System.out.println("no-static A block called ");
    }

}
