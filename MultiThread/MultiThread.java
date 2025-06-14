package MultiThread;
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Play Music");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Browsing internet");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
public class MultiThread {
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();

        obj1.setPriority(10);
        obj.setPriority(1);

        obj.start();
        obj1.start();
    }
    
}
