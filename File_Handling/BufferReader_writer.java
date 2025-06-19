package File_Handling;

import java.io.*;

public class BufferReader_writer {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rajes\\Desktop\\JavaCourse\\File_Handling\\Buffer_example.txt");

        FileWriter fWriter = null;
        BufferedWriter bWriter = null;
        FileReader fReader = null;
        BufferedReader bReader = null;

        try {
            fWriter = new FileWriter(file);
            bWriter = new BufferedWriter(fWriter);
            bWriter.write("I Kumbam Raja Rajesh Reddy Age : 21");
            bWriter.write(77); // writes 'M'
            bWriter.newLine(); // optional: to avoid readLine returning null
            bWriter.flush(); // flush data to file

            fReader = new FileReader(file);
            bReader = new BufferedReader(fReader);
            System.out.println(bReader.readLine());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            try {
                if (bWriter != null) bWriter.close();
                if (fWriter != null) fWriter.close();
                if (bReader != null) bReader.close();
                if (fReader != null) fReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
