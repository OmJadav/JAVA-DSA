import java.io.*;

public class McqTesting {
    public static void main(String args[]) {
        try {
            // Suppose, the input.txt file contains the following text
            // This is a line of text inside the file.
            FileInputStream input = new FileInputStream("input.txt");
            // Reads 3 bytes from the file
            input.read();
            input.read();
            input.read();
            // Returns the number of available bytes
            System.out.println("Available bytes " + input.available());
            input.close();
        } catch (Exception e) {
        }
    }
}