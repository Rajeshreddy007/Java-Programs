public class Constructor {
    private int age;
    public Constructor(){
        System.out.println("Default Constructor Block Executed"); // default constructor
        age=18;
    }
    public Constructor(int a){
        System.out.println("Parameterized Constructor"); // parameterized constructor
        age=a;
    }
    public static void main(String[] args) {
      Constructor obj=new Constructor(); 
      System.out.println(obj.age);
      Constructor obj1=new Constructor(21);
      System.out.println(obj1.age); 

    }
}
