public class Parent extends Grandparent {
    private static int a = init("Parent: static variable init");
    private int b = init("Parent: non-static variable init");

    public Parent() {
        System.out.println("Parent: constructor init");
    }

    static {
        System.out.println("Parent: static block init");
    }

    {
        System.out.println("Parent: non-static block init");
    }
}
