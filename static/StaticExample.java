class Demo {
    static int a;
    static int b;

    int x;
    int y;

    static {
        a = 24;
        b = 32;
        System.out.println("static block executing");
    }

    static void disp1() {
        System.out.println("Static display method");
        System.out.println("static variable a:" + a);
        System.out.println("Static variable b:" + b);
    }

    {
        x = 100;
        y = 200;
    }

    void disp2() {
        System.out.println("Non static display method");
        System.out.println("non static var x:" + x);
        System.out.println("non static var y:" + y);
    }
}

public class StaticExample {
    public static void main(String args[]) {
        Demo.disp1();

        Demo dm = new Demo();
        dm.disp2();
    }
}