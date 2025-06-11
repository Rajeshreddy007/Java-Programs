class Example {
    int a;
    static int b;

    static {
        b = 10;
        System.out.println("Static Block Executed: b = " + b);
    }

    public Example() {
        a = 5;
        System.out.println("Constructor Called: a = " + a);
    }

    public void add() {
        System.out.println("Addition (a + b): " + (a + b));
    }

    public static void sub(Example obj) {
        System.out.println("Subtraction (a - b): " + (obj.a - b));
    }

    public static void updateB(int value) {
        b = value;
        System.out.println("Static variable b updated to: " + b);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Example obj1 = new Example();
        obj1.add();
        Example.sub(obj1);

        Example.updateB(20);

        Example obj2 = new Example();
        obj2.a = 15;
        obj2.add();
        Example.sub(obj2);
    }
}
