package Polymorphism;

class Operation {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public void show(int a, int b) {
        System.out.println("Addition (int): " + add(a, b));
    }

    public void show(double a, double b, double c) {
        System.out.println("Addition (double): " + add(a, b, c));
    }

    public void display() {
        System.out.println("Display from Operation class");
    }
}

class AdvancedOperation extends Operation {
    public void display() {
        System.out.println("Display from AdvancedOperation class");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Operation op = new Operation();
        op.show(10, 20);
        op.show(1.1, 2.2, 3.3);

        Operation ref;
        ref = new AdvancedOperation();
        ref.display();
    }
}
