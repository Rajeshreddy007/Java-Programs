package Functional_Interface;
interface A{
    void play();//interface with single abstract method call functional interface
}
interface b{
    void add(int a,int b);
}
public class Finterface {
    public static void main(String[] args) {
        A obj  = ()-> System.out.println("Play Music"); // Lamda Expression
        obj.play();
        b obj1  = (i,j)-> System.out.println("Addition : "+(i+j)); // Lamda Expression
        obj1.add(10,5);
    }
    
}
