package Problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ownerfilepath {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Rajes\\Desktop\\JavaCourse\\Problems\\exp.txt");
        System.out.println(file.getPath());

        try (FileInputStream file1 = new FileInputStream(file)) {
            file1.skip(7);
            int ch;
            while ((ch = file1.read()) != -1)
			{
				System.out.print((char) ch);
			}

        }
    }
}
