public class Child extends Parent {
    private static int a = init("Child: static variable init");
    private int b = init("Child: non-static variable init");

    public Child() {
        System.out.println("Child: constructor init");
    }

    static {
        System.out.println("Child: static block init");
    }

    {
        System.out.println("Child: non-static block init");
    }
}
