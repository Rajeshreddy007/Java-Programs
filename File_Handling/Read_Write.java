package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write{
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Rajes\\Desktop\\JavaCourse\\File_Handling\\example.txt");// refering the file pathe to file object
        try (FileWriter write = new FileWriter(file)) {
            write.write("My name is Rajesh Reddy, Age : 21"); // writing data into file
        }
        try (FileReader read = new FileReader(file)) { // reader object creation
            char c[]= new char[(int) file.length()];
            read.read(c); // retriving data each time with single character and storing in char array
            for(char data : c){ // printing data
                System.out.print(data);
            }
        }
    }
}