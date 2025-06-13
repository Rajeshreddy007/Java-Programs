package Interfaces;
interface a{
    int age=18;//by default variables are static and final
    String name="Rajesh";
    void show();
    void diplay();  // by default methods in inteface are abstract
}
public class Interface implements a {

    @Override
    public void show() {
        System.out.println("Show block");
    }

    @Override
    public void diplay() {
       System.out.println("Display block");
    }
    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.show();
        obj.diplay();
        System.out.println(a.name);
    }
    
}
