package FinalKeyword;
class A{
    final public void display(int a){ // we can not override final methods
        System.out.println("Age : "+a);
    }
}
public final class Final extends A {// final class can't extended to child class. it is the termination of inheritance
        public static void main(String[] args) {
        final int age=18;//Constant, we can not change values later
        Final obj = new Final();
        obj.display(age);

    }
}
