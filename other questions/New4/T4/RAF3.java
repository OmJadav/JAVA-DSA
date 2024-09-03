import java.io.*;

public class RAF3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile f = new RandomAccessFile("D:\\myFile.txt", "rw");
        f.writeChar('A');
        f.writeInt(1024);
        f.writeDouble(78.902);
        System.out.println(f.getFilePointer());
        f.seek(0);
        System.out.println(f.readChar());
        System.out.println(f.readInt());
        System.out.println(f.readDouble());
        f.seek(0);
        System.out.println(f.readInt());
        System.out.println(f.length());
        f.writeBoolean(true);
        f.seek(4);
        System.out.println(f.readBoolean());
        f.close();
    }
}
