package Abstract;
abstract class a{  //   If any method in a class is abstract then the class should be Abstract class
    public abstract void show(); // Method Declaration but no implementation
    public void display(){
        System.out.println("Display Block");
    }
}
public class Abstract extends a { // If any class extends Abstract class it must implement the abstract methods
    public void show() {
        System.out.println("Show Block");
    }
    public static void main(String[] args) {
        Abstract obj=new Abstract();
        obj.show();
        obj.display();
    }
   
}