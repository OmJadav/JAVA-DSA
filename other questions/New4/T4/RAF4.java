import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.*;

public class RAF4 {
    public static void main(String[] args)throws IOException {
                RandomAccessFile f = new RandomAccessFile("food.txt", "rw");
        f.setLength(0);
        for(int i=0;i<=10;i++){
            f.writeInt(i);
        }
        System.out.println("File Length : "+f.length());
        f.seek(0);
        f.writeInt(5);
        f.seek(4*4);
        f.writeInt(0);
        f.seek(f.length());
        f.writeUTF("Happy Ending");
        f.close();
    }
}
