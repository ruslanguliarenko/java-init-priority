package com.company;

public class C extends B {

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
