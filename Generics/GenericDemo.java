package Generics;

import java.util.ArrayList;
import java.util.List;

class A<T> {
    T obj;

    A(T obj) {
        this.obj = obj;
    }

    public void show() {
        System.out.println("Class A object: " + obj);
    }
}

class B<T> extends A<T> {
    B(T obj) {
        super(obj);
    }

    public void display() {
        System.out.println("Class B object: " + obj);
    }
}

public class GenericDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        A<Integer> a1 = new A<>(10);
        a1.show();

        B<String> b1 = new B<>("Hello");
        b1.show();
        b1.display();

        // Upper Bound Wildcard
        List<? extends A<?>> upperBoundList = new ArrayList<>();
    
        // Lower Bound Wildcard
        List<? super A<?>> lowerBoundList = new ArrayList<>();
        lowerBoundList.add(new A<>(20));  
        lowerBoundList.add(new B<>("World"));

        for (Object obj : lowerBoundList) {
            System.out.println("Lower bound object: " + obj);
        }
    }
}
