package File_Handling;
import java.io.File;
import java.io.IOException;

public class Basics {
    public static void main(String[] args) throws IOException {
        File file= new File("C:\\Users\\Rajes\\Desktop\\JavaCourse\\File_Handling\\example.txt");
        System.out.println(file.exists());//false
        System.out.println(file.createNewFile());
        System.out.println(file.exists());

        File file1 = new File("C:\\Users\\Rajes\\Desktop\\JavaCourse");
        String names[]= file1.list();
        int count =0;
        for(String n : names){
            count++;
            System.out.println(n);
        }
        System.out.println("Total Folders : "+count);
    }
}
