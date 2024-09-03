import java.io.*;

public class RAF2 {
    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("myFile.txt", "rw");
        String s="Black white yellow blue green";
        byte[] data=s.getBytes();
        raf.write(data);
        raf.seek(5);
        byte[] buffer=new byte[17];
        System.out.println(raf.read(buffer));
        System.out.println(new String(buffer));
        raf.seek(18);
        raf.write(" Pink ".getBytes());
        raf.close();
    }
}
