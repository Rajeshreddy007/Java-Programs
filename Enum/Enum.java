package Enum;
enum permission{
    OPEN,READ,WRITE,EXECUTE;
}
public class Enum {
    public static void main(String[] args) {
        permission s = permission.WRITE;
        if(s==permission.OPEN){
            System.out.println("File Opened");
        }
        else if(s==permission.READ){
            System.out.println("Read mode");
        }
        else if(s==permission.WRITE){
            System.out.println("Write mode");
        }
        else{
            System.out.println("File Executed");
        }
    }
}
