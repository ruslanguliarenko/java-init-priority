public class Grandparent {
    private static int a = init("Grandparent: static variable init");
    private int b = init("Grandparent: non-static variable init");

    public Grandparent() {
        System.out.println("Grandparent: constructor init");
    }

    static {
        System.out.println("Grandparent: static block init");
    }

    {
        System.out.println("Grandparent: non-static block init");
    }

    protected static int init(String msg){
        System.out.println(msg);
        return 0;
    }
}
