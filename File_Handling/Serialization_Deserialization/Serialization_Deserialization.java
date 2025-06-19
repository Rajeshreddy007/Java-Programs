package File_Handling.Serialization_Deserialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
    private String name;
    private int C_Id;
    private int age;

    public Customer(int age, int C_Id, String name){
        this.age=age;
        this.C_Id=C_Id;
        this.name=name;
    }
    public void display(){
        System.out.println(C_Id+" "+name+" "+age);
    }
}

public class Serialization_Deserialization {
    public static void main(String[] args) {
        Customer c= new Customer(18, 1249, "Rohith");
        try{
            FileOutputStream file = new FileOutputStream("C:\\Users\\Rajes\\Desktop\\JavaCourse\\File_Handling\\Serialization_Deserialization\\Serial_Deserial.txt");
            BufferedOutputStream bos = new BufferedOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(c);
            oos.close();;

            FileInputStream file1 = new FileInputStream("C:\\Users\\Rajes\\Desktop\\JavaCourse\\File_Handling\\Serialization_Deserialization\\Serial_Deserial.txt");
            BufferedInputStream bis = new BufferedInputStream(file1);
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            Customer cus = (Customer) ois.readObject();
            cus.display();
            ois.close();
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
