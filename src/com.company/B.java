package com.company;

public class B extends A {

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
