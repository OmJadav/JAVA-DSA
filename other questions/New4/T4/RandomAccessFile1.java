import java.io.*;

public class RandomAccessFile1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("myFile.txt", "rw");
        String s = "Hello Programmers ,welcome to RAF.";
        System.out.println("Initially File pointer : " + raf.getFilePointer());
        raf.write(s.getBytes());
        System.out.println("After performing write operation ...File pointer : " + raf.getFilePointer());
        raf.seek(0);
        int i = raf.read();
        System.out.println("at position 0 : " + (char) i);
        System.out.println("File pointer :" + raf.getFilePointer());
        i = raf.read();
        System.out.println("next character : " + (char) i);
        raf.seek(12);
        i = raf.read();
        System.out.println("character : " + (char) i);
        raf.seek(10);
        i=raf.read();
        System.out.println("10th char is = "+(char)i);
        raf.seek(11);
        i=raf.read();
        System.out.println("11th char is = "+(char)i);
        System.out.println("Size of File : "+raf.length());
        raf.close();

    }
}
